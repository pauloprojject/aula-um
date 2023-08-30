package com.aula.um.demo.entidades;

import java.util.List;
import java.util.function.Predicate;

public class ProdutoFunctionUtils {
    
    public Double SomaProdutos(List<Produto> list, Predicate<Produto> criteria){
        Double sum = 0.0;

        for(Produto produto : list){
            if(criteria.test(produto)){
                sum += produto.getPreco();
            }
        }

        return sum;
    }

}
