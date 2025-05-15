package com.fatec.tarde.loja;

import org.springframework.stereotype.Repository;

@Repository
public class ProdutoRepository<Produto> extends JpaRepository<Produto,Integer>{

    public static final List<com.fatec.tarde.loja.Produto> findAll = null;

    public void save(Produto obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    public boolean existsById(Integer codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existsById'");
    }

    public Object findById(Integer codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    public void deleteById(Integer codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }


}
