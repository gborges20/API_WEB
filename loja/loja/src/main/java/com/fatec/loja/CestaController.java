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
public class CestaController {
    @PostMapping("/api/cesta")
    public String gravar(@RequestBody Cesta obj){
        return "O produto " + obj.getProduto() + " foi adicionado ao carrinho!!";
    }

    @PutMapping("/api/cesta")
    public String editar(@RequestBody Cesta obj){
        return "O produto " + obj.getProduto() + " foi alterado!!";
    }

    @GetMapping("/api/cesta/{id}")
    public Cesta carregar(@PathVariable int id){
        Cesta obj = new Cesta();
        obj.setId(1);
        obj.setQuantidade(2);
        obj.setProduto("Camiseta");
        obj.setCliente("Mariana");
        obj.setTotal(350);
        return obj;

    }

    @DeleteMapping("/api/cesta/{id}")
    public String deletar(@PathVariable int id){
        return "cliente " + id + " removido com sucesso!";
    }

    @GetMapping("/api/cestas")
    public List<Cesta> todos(){
        return new ArrayList<Cesta>();
    }
}
