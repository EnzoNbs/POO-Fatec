package ex1;

public class Pessoa extends Animal implements Cidadao, Contribuinte, Professor {
    private boolean votou, pagou, trabalhou, ensinou;
    private int rg, cpf;

    @Override
    public void trabalha() {
        trabalhou = true;
        System.out.println("Professor tra");
    }

    @Override
    public void ensina() {
        ensinou = true;
        System.out.println("Pessoa trabalhou");
    }

    @Override
    public void pagarIR() {
        pagou = true;
        System.out.println("Pessoa pagou o IR");
    }

    @Override
    public void getCPF() {
        cpf = (int) (Math.random() * 10);
        System.out.println("Pessoa tirou cpf");
    }

    @Override
    public void vota() {
        votou = true;
        System.out.println("Pessoa votou");
    }

    @Override
    public void getRg() {
        rg = (int) (Math.random() * 10);
        System.out.println("Pessoa tirou Rg");
    }
}