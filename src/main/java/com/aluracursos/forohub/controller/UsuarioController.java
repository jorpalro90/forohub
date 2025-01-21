package com.aluracursos.forohub.controller;

import com.aluracursos.forohub.domain.usuarios.Usuario;
import com.aluracursos.forohub.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUsuario(@Valid @RequestBody Usuario usuario) {
        boolean autenticado = usuarioService.autenticarUsuario(usuario);
        if (autenticado) {
            return ResponseEntity.ok("Inicio de sesión exitoso");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales inválidas");
        }
    }

    @PostMapping
    public ResponseEntity<String> registrarUsuario(@Valid @RequestBody Usuario usuario) {
        String mensaje = usuarioService.registrarUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(mensaje);
    }
}


