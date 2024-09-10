package com.apsoo.urfpe.ms.autenticacao.service;

import com.apsoo.urfpe.ms.autenticacao.model.Usuario;
import org.springframework.stereotype.Service;

@Service
public class AutenticacaoService {

    public String validarUsuario(Usuario usuario) {
        // Lógica simplificada de validação
        if ("123".equals(usuario.getMatricula()) && "senha123".equals(usuario.getSenha())) {
            return "Autenticação bem-sucedida!";
        } else {
            return "Falha na autenticação.";
        }
    }
}
