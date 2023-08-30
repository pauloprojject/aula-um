package com.aula.um.demo.entidades;

import java.util.function.Function;

public class Produto implements Function<Produto, Produto>{
    private Integer id;
    private String nome;
    private Double preco;

    public Produto() {}

    public Produto(Integer id, String nome, Double preco) {
        super();
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public Produto apply(Produto p) {
        p.setNome(p.getNome().toUpperCase());

        return p;
    }
    
}
