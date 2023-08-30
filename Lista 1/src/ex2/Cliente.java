package ex2;

import java.text.DecimalFormat;

public class Cliente {
    public int numeroConta;
    public int numeroAgencia;
    public String nome;
    public float saldo;

    DecimalFormat df = new DecimalFormat("0.00");

    public Cliente(int conta, int agencia, String nome, float saldo) {
        this.numeroConta = conta;
        this.numeroAgencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void realizarDeposito(float deposito) {
        this.saldo += deposito;
        System.out.println("Valor de R$" + df.format(deposito) + " depositado");
    }

    public void realizarSaque(float saque) {
        if (saque > this.saldo) {
            System.out.println("Saque de R$" + df.format(saque) + " negado");
        } else {
            this.saldo -= saque;
            System.out.println("Saque de R$" + df.format(saque) + " autorizado");
        }
    }

    public void ExibeDados() {
        System.out.println("Número da Conta: " + this.numeroConta + "\nNome: " + this.nome +
                "\nNúmero da agência: " + this.numeroAgencia + "\nSaldo Atual: R$" + df.format(this.saldo));
        System.out.println("-----");
    }
}