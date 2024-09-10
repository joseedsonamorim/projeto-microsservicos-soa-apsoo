package com.apsoo.urfpe.ms.biometria.controller;

import com.apsoo.urfpe.ms.biometria.model.Biometria;
import com.apsoo.urfpe.ms.biometria.service.BiometriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/biometria")
public class BiometriaController {

    @Autowired
    private BiometriaService biometriaService;

    @PostMapping("/validar")
    public String validarBiometria(@RequestBody Biometria biometria) {
        return biometriaService.validarBiometria(biometria);
    }
}