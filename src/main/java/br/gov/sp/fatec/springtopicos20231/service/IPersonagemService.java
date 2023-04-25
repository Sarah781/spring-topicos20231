package br.gov.sp.fatec.springtopicos20231.service;

import java.util.List;

import br.gov.sp.fatec.springtopicos20231.entity.Personagem;

public interface IPersonagemService {
    
    public Personagem novoPersonagem(Personagem personagem);

    public List<Personagem> buscarTodos();

    public Personagem buscarPorId(Long id);
}