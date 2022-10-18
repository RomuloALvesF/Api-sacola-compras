package me.api.carrinho.compras.repository;

import me.api.carrinho.compras.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
}
