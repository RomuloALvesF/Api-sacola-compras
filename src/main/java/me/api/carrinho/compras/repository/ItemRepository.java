package me.api.carrinho.compras.repository;

import me.api.carrinho.compras.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface ItemRepository extends JpaRepository<Item, Long>{
}
