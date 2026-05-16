package com.interviewiq.services;

import com.interviewiq.dto.UserDTO;
import com.interviewiq.models.User;
import com.interviewiq.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDTO getOrCreateUser(UserDTO dto) {
        Optional<User> existing = userRepository.findByUsername(dto.getUsername());
        
        String hashedPassword = hashPassword(dto.getPassword() != null ? dto.getPassword() : "default_pass");

        if (existing.isPresent()) {
            User user = existing.get();
            // In a real app we'd verify password here. For this mock, we just return the user.
            if (!user.getPassword().equals(hashedPassword)) {
                throw new RuntimeException("Invalid password");
            }
            return convertToDTO(user);
        }

        User newUser = new User(dto.getUsername(), dto.getEmail(), hashedPassword);
        newUser = userRepository.save(newUser);
        return convertToDTO(newUser);
    }

    private String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] encodedhash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
            StringBuilder hexString = new StringBuilder(2 * encodedhash.length);
            for (byte b : encodedhash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private UserDTO convertToDTO(User user) {
        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setEmail(user.getEmail());
        return dto;
    }
}
