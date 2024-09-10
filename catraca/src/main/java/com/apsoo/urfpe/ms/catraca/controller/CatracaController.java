package com.apsoo.urfpe.ms.catraca.controller;

import com.apsoo.urfpe.ms.catraca.model.Acesso;
import com.apsoo.urfpe.ms.catraca.service.CatracaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/catraca")
public class CatracaController {

    @Autowired
    private CatracaService catracaService;

    @PostMapping("/liberar")
    public String liberarCatraca(@RequestBody Acesso acesso) {
        return catracaService.liberarCatraca(acesso);
    }
}