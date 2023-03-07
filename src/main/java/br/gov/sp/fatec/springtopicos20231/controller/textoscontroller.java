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


import br.gov.sp.fatec.springtopicos20231.entity.textos;
import br.gov.sp.fatec.springtopicos20231.service.Itextosservice;

@RestController
@CrossOrigin
@RequestMapping(value = "/textos")
public class textoscontroller {

    @Autowired
    private Itextosservice service;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public textos novoUsuario(@RequestBody textos textos) {
        return service.novoUsuario(textos);
    }

    @GetMapping
    public List<textos> buscarTodosUsuarios() {
        return service.buscarTodosUsuarios();
    }
    
    @GetMapping(value = "/id/{textos}")
    public textos buscarPorId(@PathVariable("textos") Long id) {
        return service.buscarPorId(id);
    }
}