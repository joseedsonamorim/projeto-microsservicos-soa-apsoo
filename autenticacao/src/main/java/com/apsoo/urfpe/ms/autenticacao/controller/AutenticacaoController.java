package com.apsoo.urfpe.ms.autenticacao.controller;


import com.apsoo.urfpe.ms.autenticacao.model.Usuario;
import com.apsoo.urfpe.ms.autenticacao.service.AutenticacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/autenticacao")
public class AutenticacaoController {

    @Autowired
    private AutenticacaoService autenticacaoService;

    @PostMapping("/login")
    public String login(@RequestBody Usuario usuario) {
        return autenticacaoService.validarUsuario(usuario);
    }
}