package me.api.carrinho.compras.service;

import me.api.carrinho.compras.model.Item;
import me.api.carrinho.compras.model.Sacola;
import me.api.carrinho.compras.resource.dto.ItemDto;


public interface SacolaService {
    Item incluirItemNaSacola(ItemDto itemDto);
    Sacola verSacola(Long id);
    Sacola fecharSacola(Long id, int formaPagamento);
}
