package com.aula.um.demo.entidades;

import java.util.function.Predicate;

public class Produto implements Predicate{
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

    public void setMome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public boolean test(Object arg0) {
        return t.getPreco() > 200;
    }

    
}