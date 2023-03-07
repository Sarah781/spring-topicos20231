package br.gov.sp.fatec.springtopicos20231.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springtopicos20231.entity.textos;
import br.gov.sp.fatec.springtopicos20231.exception.textosnaoencontradosexception;
import br.gov.sp.fatec.springtopicos20231.repository.textosrepository;

@Service
public class textosservice implements Itextosservice {

    @Autowired
    private textosrepository usuarioRepo;

    public textos novoUsuario(textos textos) {
        if(textos == null 
                || textos.getNome() == null 
                || textos.getSenha() == null) {
            throw new IllegalArgumentException("Nome e senha inválidos!");
        }
        return usuarioRepo.save(textos);
    }

    public List<textos> buscarTodosUsuarios() {
        return usuarioRepo.findAll();
    }

    public textos buscarPorId(Long id) {
        Optional<textos> usuarioOp = usuarioRepo.findById(id);
        if(usuarioOp.isEmpty()) {
            throw new textosnaoencontradosexception("Usuário não existe!");
        }
        return usuarioOp.get();
    }
    
}