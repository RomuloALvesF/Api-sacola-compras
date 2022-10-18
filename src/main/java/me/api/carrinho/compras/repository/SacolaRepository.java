package me.api.carrinho.compras.repository;

import me.api.carrinho.compras.model.Sacola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface SacolaRepository extends JpaRepository<Sacola, Long>{
}
