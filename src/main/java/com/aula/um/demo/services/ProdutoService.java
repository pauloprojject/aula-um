package com.aula.um.demo.services;

import java.util.List;
import java.util.stream.Collectors;

import com.aula.um.demo.entidades.Produto;
import com.aula.um.demo.entidades.ProdutoFunctionUtils;
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
        
        return list;
    }

    public List<Produto> findAllPredicate(){
        List<Produto> list = repositorio.findAllProduto();

        list.removeIf((p1) -> p1.getPreco() <= 200);

        return list;
    }

    public List<Produto> findAllConsumer(){
        
        List<Produto> list = repositorio.findAllProduto();

        // list.forEach(new Produto());

        // Consumer<Produto> consume = new Consumer<Produto>() {
        //     @Override
        //     public void accept(Produto p){
        //         p.setPreco(p.getPreco() + 100);
        //     }
        // };

        // Consumer<Produto> consume = (p) -> p.setPreco(p.getPreco() + 100);

        // list.forEach(consume);
        list.forEach((p) -> p.setPreco(p.getPreco() + 100));

        return list;
    }

    public List<Produto> findAllFunction(){
        List<Produto> list = repositorio.findAllProduto();

        List<Produto> listUpper = list.stream().map((p) -> {
            p.setNome(p.getNome().toUpperCase());
            return p;
        }).collect(Collectors.toList());
        

        return listUpper;
    }

    public Double somaTodos(){
        List<Produto> list = repositorio.findAllProduto();

        ProdutoFunctionUtils func = new ProdutoFunctionUtils();
        Double soma = func.SomaProdutos(list, p -> p.getPreco() > 0);

        return soma;
        
    }

}
