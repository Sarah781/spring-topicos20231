package br.gov.sp.fatec.springtopicos20231.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.springtopicos20231.entity.Medicao;
import br.gov.sp.fatec.springtopicos20231.service.IMedicaoService;

@RestController
@CrossOrigin
@RequestMapping(value = "/medicao")
public class MedicaoController {

    @Autowired
    private IMedicaoService service;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public Medicao cadastrar(@RequestBody Medicao medicao) {
        return service.cadastrar(medicao);
    }

    @GetMapping
    public List<Medicao> listar() {
        return service.listar();
    }
    
    @GetMapping(value = "/id/{medicao}")
    public Medicao buscarPorId(@PathVariable("medicao") Long id) {
        return service.buscarPorId(id);
    }
}