package com.apsoo.urfpe.ms.turnstile_service;

import com.apsoo.urfpe.ms.auth_service.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/turnstile")
public class TurnstileController {

    @PostMapping("/access")
    public ResponseEntity<String> access(@RequestBody User user) {
        // Simulate turnstile access
        return ResponseEntity.ok("Turnstile opened for " + user.getNome());
    }
}

