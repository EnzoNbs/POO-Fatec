package ex3;

import java.text.DecimalFormat;

public class Produto {
    public int codigo;
    public String nome;
    public String descricao;
    public int qtde;
    public float preco;

    DecimalFormat df = new DecimalFormat("0.00");

    public Produto(int codigo, String nome, String descricao, int qtde, float preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;

    }

    public Produto() {
    }

    public void ExibeDados() {
        System.out.println("Código: " + this.codigo + " / Nome: " + this.nome
                + " / Preco: R$" + df.format(this.preco) + " / Descrição: " + this.descricao
                + " / Quantidade: " + this.qtde);
        System.out.println("-----");
    }

    public void Comprar(int quantidade) {
        System.out.println("Comprando " + quantidade + " unidades do produto " + this.nome);
        this.qtde = this.qtde + quantidade;
    }

    public void Vender(int quantidade) {
        if (this.qtde >= quantidade) {
            System.out.println("Vendendo " + quantidade + " unidades do produto " + this.nome);
            this.qtde -= quantidade;
        } else {
            System.out.println("Estoque insuficiente");
        }
    }

    public void SubirPreco(float aumento) {
        System.out.println("Subindo preço");
        this.preco += aumento;
    }

    public void DiminuirPreco(float desconto){
        if (desconto >= this.preco){
            System.out.println("Desconto de R$" + df.format(desconto) + " inválido");
        }
        else {
            System.out.println("Descontando R$ " + df.format(desconto));
            this.preco -= desconto;
        }
    }
}