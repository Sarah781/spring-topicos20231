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

import br.gov.sp.fatec.springtopicos20231.entity.Personagem;
import br.gov.sp.fatec.springtopicos20231.service.IPersonagemService;

@RestController
@CrossOrigin
@RequestMapping(value = "/personagem")
public class PersonagemController {

    @Autowired
    private IPersonagemService service;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public Personagem cadastrar(@RequestBody Personagem personagem) {
        return service.novoPersonagem(personagem);
    }

    @GetMapping
    public List<Personagem> listar() {
        return service.buscarTodos();
    }
    
    @GetMapping(value = "/id/{personagem}")
    public Personagem buscarPorId(@PathVariable("personagem") Long id) {
        return service.buscarPorId(id);
    }
}