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
public class PedidoController {
    @PostMapping("/api/pedido")
    public String gravar(@RequestBody Pedido obj){
        return "O pedido " + obj.getId() + " foi adicionado ao carrinho!!";
    }

    @PutMapping("/api/pedido")
    public String editar(@RequestBody Pedido obj){
        return "O pedido " + obj.getId() + " foi alterado!!";
    }

    @GetMapping("/api/pedido/{id}")
    public Pedido carregar(@PathVariable int id){
        Pedido obj = new Pedido();
        obj.setId(1);
        obj.setCliente("Mariana");
        obj.setEndereco("Rua x, 0, Vila Olimpia");
        obj.setCesta("Cesta Mariana");
        return obj;

    }

    @DeleteMapping("/api/pedido/{id}")
    public String deletar(@PathVariable int id){
        return "pedido " + id + " removido com sucesso!";
    }

    @GetMapping("/api/pedidos")
    public List<Pedido> todos(){
        return new ArrayList<Pedido>();
    }
}
