package me.api.carrinho.compras.resource;

import lombok.RequiredArgsConstructor;


import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import me.api.carrinho.compras.model.Item;
import me.api.carrinho.compras.model.Sacola;
import me.api.carrinho.compras.resource.dto.ItemDto;

import me.api.carrinho.compras.service.SacolaService;
import org.springframework.web.bind.annotation.*;

@Api(value ="/ifood-devweek/sacolas")
@RestController
@RequestMapping("/ifood-devweek/sacolas")
@RequiredArgsConstructor
public class SacolaResource {
    private final SacolaService sacolaService;

    @PostMapping
    public Item incluirItemNaSacola(@RequestBody ItemDto itemDto) {
        return sacolaService.incluirItemNaSacola(itemDto);
    }

    @GetMapping("/{id}")
    public Sacola verSacola(@PathVariable("id") Long id) {
        return sacolaService.verSacola(id);
    }

    @PatchMapping("/fecharSacola/{sacolaId}")
    public Sacola fecharSacola(@PathVariable("sacolaId") Long sacolaId,
                               @RequestParam("formaPagamento") int formaPagamento) {
        return sacolaService.fecharSacola(sacolaId, formaPagamento);
    }
}
