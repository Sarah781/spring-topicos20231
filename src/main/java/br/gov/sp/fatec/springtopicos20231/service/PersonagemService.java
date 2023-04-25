package br.gov.sp.fatec.springtopicos20231.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springtopicos20231.entity.Personagem;
import br.gov.sp.fatec.springtopicos20231.repository.PersonagemRepository;

@Service
public class PersonagemService implements IPersonagemService {

    @Autowired
    private PersonagemRepository personagemRepo;

    @Override
    public Personagem novoPersonagem(Personagem personagem) {
        if (personagem == null || personagem.getNome() == null || personagem.getClasse() == null) {
            throw new IllegalArgumentException("Nome e classe inválidos!");
        }
        return personagemRepo.save(personagem);
    }

    @Override
    public List<Personagem> buscarTodos() {
        return personagemRepo.findAll();
    }

    @Override
    public Personagem buscarPorId(Long id) {
        Optional<Personagem> personagemOp = personagemRepo.findById(id);
        if(personagemOp.isEmpty()){
            throw new IllegalArgumentException("não há personagem");
        }
        return personagemOp.get();
    }
    
}
