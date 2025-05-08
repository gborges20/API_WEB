package com.fatec.loja;

public class Pedido {
    public int id;
    public String cliente;
    public String endereco;
    public String cesta;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getCesta() {
        return cesta;
    }
    public void setCesta(String cesta) {
        this.cesta = cesta;
    }

    
}
