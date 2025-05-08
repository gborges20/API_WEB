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
public class ClienteController {

    @PostMapping("/api/cliente")
    public String gravar(@RequestBody Cliente obj){
        return "O cliente " + obj.getNome() + " foi gravado!!";
    }

    @PutMapping("/api/cliente")
    public String editar(@RequestBody Cliente obj){
        return "O cliente " + obj.getNome() + " foi alterado!!";
    }

    @GetMapping("/api/cliente/{id}")
    public Cliente carregar(@PathVariable int id){
        Cliente obj = new Cliente();
        obj.setId(1);
        obj.setNome("Mariana");
        obj.setEmail("mariana@net.com");
        obj.setSenha("123456");
        obj.setTelefone("11922334455");
        return obj;

    }

    @DeleteMapping("/api/cliente/{id}")
    public String deletar(@PathVariable int id){
        return "cliente " + id + " removido com sucesso!";
    }

    @GetMapping("/api/clientes")
    public List<Cliente> todos(){
        return new ArrayList<Cliente>();
    }
}