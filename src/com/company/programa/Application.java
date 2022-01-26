package com.company.programa;

public class Application {

    public static void main(String[] args) {

        ProdutoRepository repository = new ProdutoRepository();
        populaBase(repository);

        //imprime todos os produtos do estoque
        imprimeProdutos(repository);

        Produto bySku = repository.getBySku("RS002");
        //System.out.println("Produto: " + bySku);

        Produto novoProduto = new Produto();
        novoProduto.setSku("A555");
        novoProduto.setNome("Fonte");
        novoProduto.setDescricao("Fonto 700w");
        novoProduto.setValor(199.90);
        novoProduto.setQuantidade(50);
        repository.save(novoProduto);

        //imprimeProdutos(repository);

        Produto updateProduto = new Produto();
        updateProduto.setSku("RS001");
        updateProduto.setNome("Mouse Gamer");
        updateProduto.setDescricao("Mouse gamer 6 botoes");
        updateProduto.setValor(99.9);
        updateProduto.setQuantidade(100);
        repository.updateBySku(updateProduto);

        Produto deleteProduto = new Produto();
        deleteProduto.setSku("RS002");
        repository.delete(deleteProduto);

        imprimeProdutos(repository);

    }

    private static void imprimeProdutos(ProdutoRepository repository) {
        System.out.println(repository.getAll());
    }


    private static void populaBase(ProdutoRepository repository) {
        Produto p1 = new Produto();
        p1.setSku("RS001");
        p1.setNome("Mouse");
        p1.setDescricao("Mouse gamer 6 botoes");
        p1.setValor(89.9);
        p1.setQuantidade(10);
        repository.addEstoque(p1);

        Produto p2 = new Produto();
        p2.setSku("RS002");
        p2.setNome("Teclado");
        p2.setDescricao("Teclado gamer iluminação rgb");
        p2.setValor(119.0);
        p2.setQuantidade(500);
        repository.addEstoque(p2);

        Produto p3 = new Produto();
        p3.setSku("RS003");
        p3.setNome("Fone de ouvido");
        p3.setDescricao("Fone de ouvido gamer");
        p3.setValor(159.9);
        p3.setQuantidade(30);
        repository.addEstoque(p3);
    }
}
