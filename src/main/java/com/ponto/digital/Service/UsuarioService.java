package com.ponto.digital.Service;

import org.springframework.stereotype.Service;

import com.ponto.digital.Model.Usuario;
import com.ponto.digital.Repository.UsuarioRepository;

@Service
public class UsuarioService {
    
    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario criarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
