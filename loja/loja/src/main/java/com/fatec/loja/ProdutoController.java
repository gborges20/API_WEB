package com.fatec.loja;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {
    @PostMapping("/api/produto")
    public String gravar(@RequestBody Produto obj){
        return "O produto " + obj.getNome() + " foi adicionado ao carrinho!!";
    }

    @PutMapping("/api/produto")
    public String editar(@RequestBody Produto obj){
        return "O produto " + obj.getNome() + " foi alterado!!";
    }

    @GetMapping("/api/produto/{id}")
    public Produto carregar(@PathVariable int id){
        Produto obj = new Produto();
        obj.setId(1);
        obj.setNome("Camiseta");
        obj.setDescricao("100% Algodão.");
        obj.setPreco(350);
        return obj;

    }

    @DeleteMapping("/api/produto/{id}")
    public String deletar(@PathVariable int id){
        return "Produto " + id + " removido com sucesso!";
    }

    @GetMapping("/api/produtos")
    public List<Produto> todos(){
        return new ArrayList<Produto>();
    }
}
