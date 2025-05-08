package com.fatec.tarde.loja;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@CrossOrigin(origins = "*")
public class ClienteController {
    @Autowired 
    ClienteRepository bd;

    //post - inserir
    //get - ler
    //put - alterar
    //delete - apagar


    @PostMapping("api/cliente")
    public String gravar(@RequestBody Cliente obj) {
        bd.save(obj);
        return "O cliente foi salvo com sucesso";
    }
    @GetMapping("api/clientes")
    public List<Cliente> listar() {
        return bd.findAll();
    }
    
    @PutMapping("api/cliente")
    public String alterar(@RequestBody Cliente obj) {
        //TODO: process PUT request
        if(bd.existsById(obj.getCodigo())){
            bd.save(obj);
            return "O cliente foi alterado com sucesso";
        }else{
            
            return "O cliente não existe";
        }
        
    }

    @DeleteMapping("api/cliente/{codigo}")
    public String apagar(@PathVariable("codigo") Integer codigo){
        if(bd.existsById(codigo)){
            bd.deleteById(codigo);
            return "O cliente foi removido com sucesso";
        }else{
            
            return "O cliente não existe";
        }
    }

    @GetMapping("api/cliente/{codigo}")
    public Cliente carregar(@PathParam("codigo") Integer codigo){
        if(bd.existsById(codigo)){
            return bd.findById(codigo).get();
        }else{
            return new Cliente();
        }
    }
}
