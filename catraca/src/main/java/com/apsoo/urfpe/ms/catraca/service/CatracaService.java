package com.apsoo.urfpe.ms.catraca.service;

import com.apsoo.urfpe.ms.catraca.model.Acesso;
import org.springframework.stereotype.Service;

@Service
public class CatracaService {

    public String liberarCatraca(Acesso acesso) {
        // Lógica simplificada para liberar a catraca
        if (acesso.isAutenticado() && acesso.isBiometriaValida()) {
            return "Catraca liberada!";
        } else {
            return "Acesso negado.";
        }
    }
}
