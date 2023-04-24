package br.gov.sp.fatec.springtopicos20231.service;

import java.util.List;

import br.gov.sp.fatec.springtopicos20231.entity.Medicao;

public interface IMedicaoService {

    public Medicao cadastrar(Medicao medicao);
    
    public List<Medicao> listar();

    public Medicao buscarPorId(Long id);

}
