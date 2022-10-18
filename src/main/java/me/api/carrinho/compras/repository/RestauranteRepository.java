package me.api.carrinho.compras.repository;

import me.api.carrinho.compras.model.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {
}
