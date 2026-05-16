package com.interviewiq.auth;

import com.interviewiq.dto.UserDTO;
import com.interviewiq.services.UserService;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class AuthFilter implements Filter {

    private final JwtUtil jwtUtil;
    private final UserService userService;

    public AuthFilter(JwtUtil jwtUtil, UserService userService) {
        this.jwtUtil = jwtUtil;
        this.userService = userService;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        // TEMPORARY DEMO OVERRIDE: 
        // 1. JWT validation is completely disabled to allow all requests for frontend testing (Vercel integration).
        // 2. We automatically get/create a demo user to inject a valid userId into the request,
        //    which prevents "User not found" errors in downstream controllers and services.
        
        try {
            UserDTO demoUserDto = new UserDTO();
            demoUserDto.setUsername("demo_user");
            demoUserDto.setPassword("demo_password");
            UserDTO createdDemoUser = userService.getOrCreateUser(demoUserDto);
            
            req.setAttribute("userId", createdDemoUser.getId());
        } catch (Exception e) {
            // Fallback in case of DB issues
            req.setAttribute("userId", 1L);
        }

        // Proceed without any token checks (permitAll equivalent)
        chain.doFilter(request, response);
    }
}
