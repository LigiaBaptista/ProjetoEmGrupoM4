package com.rd.backend.service;

import com.rd.backend.Dto.LoginDTO;
import com.rd.backend.Dto.PerfilDTO;
import com.rd.backend.exception.ExceptionApi;
import com.rd.backend.model.Usuario;
import com.rd.backend.repository.UsuarioRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UsuarioService {

    @NonNull
    private UsuarioRepository usuarioRepository;

    @NonNull
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public List<Usuario> listar() {

        try {
            if (usuarioRepository.findAll().isEmpty()) {
                throw new ExceptionApi("Nenhum usuário encontrado", HttpStatus.NOT_FOUND);
            } else {
                return usuarioRepository.findAll();
            }
        } catch (ExceptionApi e) {
            throw new ExceptionApi(e.getMessage(),e.getErrorType());
        }
    }

    public PerfilDTO buscarPorId(Long id) {
        try {
            if (usuarioRepository.findById(id).isPresent()) {
                Usuario usuario = usuarioRepository.findById(id).get();
                return new PerfilDTO(usuario.getNome(), usuario.getEmail());
            } else {
                throw new ExceptionApi("O ID " + id + " não corresponde a nenhum usuário", HttpStatus.NOT_FOUND);
            }
        } catch (ExceptionApi e) {
            throw new ExceptionApi(e.getMessage(),e.getErrorType());
        }
    }

    public Usuario criar(Usuario usuario) {
           try {
                if (usuario.getNome() == null || usuario.getNome().isEmpty()) {
                    throw new ExceptionApi("Nome do usuário não pode ser vazio", HttpStatus.BAD_REQUEST);
                }
                if (usuario.getEmail() == null || usuario.getEmail().isEmpty()) {
                    throw new ExceptionApi("Email do usuário não pode ser vazio", HttpStatus.BAD_REQUEST);
                }
                if (usuario.getSenha() == null || usuario.getSenha().isEmpty()) {
                    throw new ExceptionApi("Senha do usuário não pode ser vazia", HttpStatus.BAD_REQUEST);
                }
                if (usuarioRepository.findByEmail(usuario.getEmail()) != null) {
                    throw new ExceptionApi("Email já cadastrado", HttpStatus.BAD_REQUEST);
                }
                String senhaCriptografada = bCryptPasswordEncoder.encode(usuario.getSenha());
                usuario.setSenha(senhaCriptografada);
                return usuarioRepository.save(usuario);
            } catch (ExceptionApi e) {
                throw new ExceptionApi(e.getMessage(), e.getErrorType());
            }

    }

    public Usuario atualizar(Long id, Usuario usuario) {
        try {
            if (usuarioRepository.findById(id).isPresent()) {
                Usuario usuarioExistente = usuarioRepository.findById(id).get();
                usuarioExistente.setNome(usuario.getNome());
                usuarioExistente.setEmail(usuario.getEmail());
                String senhaCriptografada = bCryptPasswordEncoder.encode(usuario.getSenha());
                usuarioExistente.setSenha(senhaCriptografada);
                return usuarioRepository.save(usuarioExistente);
            } else {
                throw new ExceptionApi("O ID " + id + " não corresponde a nenhum usuário", HttpStatus.NOT_FOUND);
            }
        } catch (ExceptionApi e) {
            throw new ExceptionApi(e.getMessage(),e.getErrorType());
        }
    }




    public void excluir(Long id) {
        try {
            if (usuarioRepository.findById(id).isPresent()) {
                usuarioRepository.deleteById(id);
            } else {
                throw new ExceptionApi("O ID " + id + " não corresponde a nenhum usuário", HttpStatus.NOT_FOUND);
            }
        } catch (ExceptionApi e) {
            throw new ExceptionApi(e.getMessage(),e.getErrorType());
        }
    }

    public PerfilDTO login(LoginDTO loginDTO) {
       try {
           if (loginDTO.getEmail().isEmpty() || loginDTO.getEmail() == null) {
               throw new ExceptionApi("Email não pode ser vazio", HttpStatus.BAD_REQUEST);
           }
           if (loginDTO.getSenha().isEmpty() || loginDTO.getSenha() == null) {
               throw new ExceptionApi("Senha não pode ser vazia", HttpStatus.BAD_REQUEST);
           }
           Usuario usuarioExistente = usuarioRepository.findByEmail(loginDTO.getEmail());

           if (usuarioExistente != null) {
               if (bCryptPasswordEncoder.matches(loginDTO.getSenha(), usuarioExistente.getSenha())) {
                   return new PerfilDTO (usuarioExistente.getNome(), usuarioExistente.getEmail());
               } else {
                   throw new ExceptionApi("Email ou senha inválidos", HttpStatus.UNAUTHORIZED);
               }
           } else {
               throw new ExceptionApi("Email ou senha inválidos", HttpStatus.UNAUTHORIZED);// Repetir para abrir espaço para Brute Force
           }
       } catch (ExceptionApi e) {
           throw new ExceptionApi(e.getMessage(),e.getErrorType());
       }
    }
}
