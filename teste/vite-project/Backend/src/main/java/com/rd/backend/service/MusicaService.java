package com.rd.backend.service;
import com.rd.backend.model.Musica;
import com.rd.backend.repository.MusicaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MusicaService {


        private MusicaRepository musicaRepository;

        public MusicaService(MusicaRepository musicaRepository) {
            this.musicaRepository = musicaRepository;
        }

        public List<Musica> listar() {
            return musicaRepository.findAll();
        }

        public Musica buscarPorId(Long id) {
            return musicaRepository.findById(id)
                    .orElse(null);
        }

        public Musica criar(Musica musica) {
            return musicaRepository.save(musica);
        }

        public Musica atualizar(Long id, Musica musica) {
            Musica musicaExistente = buscarPorId(id);
            musicaExistente.setTitulo(musica.getTitulo());
            musicaExistente.setAno(musica.getAno());
            musicaExistente.setGenero(musica.getGenero());
            return musicaRepository.save(musicaExistente);
        }

        public void excluir(Long id) {
            musicaRepository.deleteById(id);
        }

}
