package com.rd.pg4project.service;

import com.rd.pg4project.Dto.LoginDTO;
import com.rd.pg4project.Dto.PerfilDTO;
import com.rd.pg4project.Dto.UsuarioDTO;
import com.rd.pg4project.model.Usuario;
import com.rd.pg4project.repository.UsuarioRepository;
import jakarta.websocket.Session;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class UsuarioService {

    @NonNull
    private UsuarioRepository usuarioRepository;

    @NonNull
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }

    public Usuario buscarPorId(Long id) {
        return usuarioRepository.findById(id)
                .orElse(null);
    }

    public Usuario criar(Usuario usuario) {
        String senhaCriptografada = bCryptPasswordEncoder.encode(usuario.getSenha());
        usuario.setSenha(senhaCriptografada);
        return usuarioRepository.save(usuario);
    }

    public Usuario atualizar(Long id, Usuario usuario) {
        Usuario usuarioExistente = buscarPorId(id);
        usuarioExistente.setNome(usuario.getNome());
        usuarioExistente.setEmail(usuario.getEmail());
        String senhaCriptografada = bCryptPasswordEncoder.encode(usuario.getSenha());
        usuarioExistente.setSenha(senhaCriptografada);
        return usuarioRepository.save(usuarioExistente);
    }

    public void excluir(Long id) {
        usuarioRepository.deleteById(id);
    }

    public PerfilDTO login(LoginDTO loginDTO) {
        Usuario usuarioExistente = usuarioRepository.findByEmail(loginDTO.getEmail());

        if (usuarioExistente != null) {
            if (bCryptPasswordEncoder.matches(loginDTO.getSenha(), usuarioExistente.getSenha())) {
                return new PerfilDTO (usuarioExistente.getNome(), usuarioExistente.getEmail());
            }
        }
        return null;
    }
}
