package com.interviewiq.controllers;

import com.interviewiq.auth.JwtUtil;
import com.interviewiq.dto.UserDTO;
import com.interviewiq.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public ResponseEntity<?> loginOrRegister(@RequestBody UserDTO request) {
        // Mock app behavior: If user exists, validates password. If not, creates user.
        UserDTO user = userService.getOrCreateUser(request);
        String token = jwtUtil.generateToken(user.getId(), user.getUsername());
        
        Map<String, Object> response = new HashMap<>();
        response.put("token", token);
        response.put("user", user);
        
        return ResponseEntity.ok(response);
    }
}
