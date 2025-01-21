package com.aluracursos.forohub.service;

import com.aluracursos.forohub.domain.usuarios.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    public boolean autenticarUsuario(Usuario usuario) {
        return true;
    }

    public String registrarUsuario(Usuario usuario) {
        return "Usuario registrado con éxito: " + usuario.getCorreoElectronico();
    }
}
