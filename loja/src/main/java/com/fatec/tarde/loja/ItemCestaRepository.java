package com.fatec.tarde.loja;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ItemCestaRepository extends JpaRepository<ItemCesta, Integer>{

}
