package com.fatec.tarde.loja;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@CrossOrigin(origins = "*")
public class CestaController {
    @Autowired
    CestaRepository bd;
    @Autowired
    ItemCestaRepository bdItem;

    @PostMapping("cesta")
    public void gravar(@RequestBody Cesta obj) {
        obj.setCodigoCliente(obj.getCliente().getCodigo());
        bd.save(obj);
        List<ItemCesta> itens = new ArrayList<ItemCesta>();
        for(Produto objP: obj.getItens()){
            ItemCesta item = new ItemCesta();
            item.setCodigoCesta(obj.getCodigo());
            item.setCodigoProduto(objP.getCodigo());
            item.setQuantidade(1);
            item.setValor(objP.getValor());
            bdItem.save(item);
        }
    }
    @GetMapping("cesta/{id}")
    public Cesta carregar(@PathVariable("id") Integer codigo) {
        if(bd.existsById(codigo)){
            Cesta.obj = bd.findById(codigo).get();
            //TODO trazer com native query
            return obj;
        }else{
            return new Cesta()
        }
    }
    @DeleteMapping("cesta/{id}")
    public void remover(@PathVariable("id") Integer codigo){
        bd.deleteById(codigo);
        //TODO pegar lista com native query para apagar itens
    }
}
