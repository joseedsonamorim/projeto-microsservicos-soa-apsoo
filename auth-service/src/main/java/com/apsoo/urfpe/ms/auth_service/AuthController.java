package com.apsoo.urfpe.ms.auth_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {
        return ResponseEntity.ok(userRepository.save(user));
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        User foundUser = userRepository.findByMatricula(user.getMatricula());
        if (foundUser != null && foundUser.getSenha().equals(user.getSenha())) {
            return ResponseEntity.ok("Login successful");
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed");
    }
}
