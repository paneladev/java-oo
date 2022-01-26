package com.company.programa;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {

    private final List<Produto> estoque = new ArrayList<>();

    public List<Produto> getAll() {
        return estoque;
    }

    public Produto getBySku(String sku) {
        for (Produto temp : estoque) {
            if(temp.getSku().equals(sku)) {
                return temp;
            }
        }
        return null;
    }

    public void save(Produto novoProduto) {
        estoque.add(novoProduto);
    }

    public void updateBySku(Produto updateProduto) {
        for (Produto temp : estoque) {
            if(temp.getSku().equals(updateProduto.getSku())) {
                temp.setNome(updateProduto.getNome());
                temp.setDescricao(updateProduto.getDescricao());
                temp.setValor(updateProduto.getValor());
                temp.setQuantidade(updateProduto.getQuantidade());
                break;
            }
        }
    }

    public void delete(Produto produto) {
        estoque.remove(produto);
    }

    public void addEstoque(Produto estoque) {
        this.estoque.add(estoque);
    }
}