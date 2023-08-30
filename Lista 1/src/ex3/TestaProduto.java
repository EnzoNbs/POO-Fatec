package ex3;

public class TestaProduto {

    public static void main(String[] args) {
        Produto produto1 = new Produto(1, "Sabonete", "Dove Creme", 20, 1.8f);
        Produto produto2 = new Produto();

        produto2.nome = "Sabão";
        produto2.preco = 1.2f;
        produto2.qtde = 20;
        produto2.descricao = "Neutro";
        produto2.codigo = 2;

        produto1.ExibeDados();
        produto1.Comprar(5);
        produto1.ExibeDados();

        produto1.Vender(10);
        produto1.ExibeDados();

        produto1.SubirPreco(2.0f);
        produto1.ExibeDados();

        produto1.DiminuirPreco(4.0f);
        produto1.ExibeDados();

        produto2.ExibeDados();
        produto2.Comprar(8);
        produto2.ExibeDados();

        produto2.Vender(12);
        produto2.ExibeDados();

        produto2.SubirPreco(2.20f);
        produto2.ExibeDados();

        produto2.DiminuirPreco(1.5f);
        produto2.ExibeDados();
    }
}