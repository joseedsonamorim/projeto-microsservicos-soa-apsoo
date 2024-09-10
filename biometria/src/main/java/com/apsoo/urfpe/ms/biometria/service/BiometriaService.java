package com.apsoo.urfpe.ms.biometria.service;

import com.apsoo.urfpe.ms.biometria.model.Biometria;
import org.springframework.stereotype.Service;

@Service
public class BiometriaService {

    public String validarBiometria(Biometria biometria) {
        // Lógica simplificada de validação biométrica
        if ("123".equals(biometria.getMatricula()) && "biometria_hash".equals(biometria.getHashBiometria())) {
            return "Biometria válida!";
        } else {
            return "Falha na validação biométrica.";
        }
    }
}