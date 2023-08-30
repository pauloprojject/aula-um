package com.aula.um.demo.repositorios;

import java.util.ArrayList;
import java.util.List;

import com.aula.um.demo.entidades.Produto;

import org.springframework.stereotype.Repository;

@Repository
public class ProdutoRepositorio {
    public List<Produto> findAllProduto(){
        
        List<Produto> list = new ArrayList<>();
        
        list.add(new Produto(1, "Notebook", 5000.00));
        list.add(new Produto(2, "Celular", 4500.00));
        list.add(new Produto(3, "Mouse", 150.00));
        list.add(new Produto(4, "Teclado", 100.00));
        list.add(new Produto(5, "Monitor", 1500.00));

        return list;
    }
}
