package me.api.carrinho.compras.repository;

import me.api.carrinho.compras.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
}
