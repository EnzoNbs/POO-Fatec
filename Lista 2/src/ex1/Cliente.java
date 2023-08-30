package ex1;

import java.text.DecimalFormat;

public class Cliente {
    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;

    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo) {
        setNumeroConta(numeroConta);
        setNumeroAgencia(numeroAgencia);
        setNome(nome);
        setSaldo(saldo);
    }

    public Cliente() {
        numeroConta = "000000-0";
        numeroAgencia = "0000-0";
        nome = "Nenhum";
        saldo = 0.0f;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {

        if (numeroConta.length() == 8 && numeroConta.charAt(6) == '-') {
            this.numeroConta = numeroConta;
        }
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        if (numeroAgencia.length() == 6 && numeroAgencia.charAt(4) == '-') {
            this.numeroAgencia = numeroAgencia;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() < 30 && !nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Número da Conta: '" + numeroConta + '\'' +
                ", Número da Agencia: '" + numeroAgencia + '\'' +
                ", Nome: '" + nome + '\'' +
                ", Saldo: " + df.format(saldo) +
                '}';
    }

    public void realizarDeposito(float deposito) {
        if (deposito >= 0) {
            saldo += deposito;
        } else {
            System.out.println("Não é possivel depositar este valor");
        }
    }

    public void realizarSaque(float saque) {
        if (saque <= saldo && saque >= 0) {
            saldo -= saque;
        } else {
            System.out.println("Saque inválido");
        }
    }

    DecimalFormat df = new DecimalFormat("R$ 0.00");
}