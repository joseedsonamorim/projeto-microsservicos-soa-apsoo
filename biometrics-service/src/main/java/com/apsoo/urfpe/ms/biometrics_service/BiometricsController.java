package com.apsoo.urfpe.ms.biometrics_service;


import com.apsoo.urfpe.ms.auth_service.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/biometrics")
public class BiometricsController {

    @PostMapping("/validate")
    public ResponseEntity<String> validateBiometrics(@RequestBody User user) {
        // Simulate biometrics validation
        if ("valid-digital".equals(user.getDigital())) {
            return ResponseEntity.ok("Biometrics validated");
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Biometrics validation failed");
    }
}
