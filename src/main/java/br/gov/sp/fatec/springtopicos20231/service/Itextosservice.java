package br.gov.sp.fatec.springtopicos20231.service;

import java.util.List;

import br.gov.sp.fatec.springtopicos20231.entity.textos;

public interface Itextosservice {
    
    public textos novoUsuario(textos textos);

    public List<textos> buscarTodosUsuarios();

    public textos buscarPorId(Long id);

}