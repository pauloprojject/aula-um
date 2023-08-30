package com.aula.um.demo.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import com.aula.um.demo.entidades.Produto;
import com.aula.um.demo.services.ProdutoService;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService service;
    
    @GetMapping
    public List<Produto> findAllProduto(){
        return service.findAllProduto();
    }

    @GetMapping("/predicate")
    public List<Produto> findAllPredicate(){
        return service.findAllPredicate();
    }

    @GetMapping("/consumer")
    public List<Produto> findAllConsumer(){
        return service.findAllConsumer();
    }

    @GetMapping("/function")
    public List<Produto> findAllFunction(){
        return service.findAllFunction();
    }
}
