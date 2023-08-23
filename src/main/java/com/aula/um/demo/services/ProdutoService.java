package com.aula.um.demo.services;

import java.util.Comparator;
import java.util.List;

import com.aula.um.demo.entidades.Produto;
import com.aula.um.demo.repositorios.ProdutoRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    
    @Autowired
    private ProdutoRepositorio repositorio;

    public List<Produto> findAllProduto(){
        List<Produto> list = repositorio.findAllProduto();

        list.sort((p1,p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));

        list.removeIf(new Produto());

        return list;
    }

}
