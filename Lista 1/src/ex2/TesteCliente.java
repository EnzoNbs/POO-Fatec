package ex2;

public class TesteCliente {

    public static void main(String[] args) {
        Cliente fulano = new Cliente(312, 3, "Fulano", 6023.42f);
        Cliente beltrano = new Cliente(313, 4, "Beltrano", 52.34f);

        fulano.ExibeDados();
        fulano.realizarDeposito(500.00f);
        fulano.ExibeDados();
        fulano.realizarSaque(1022.57f);
        fulano.ExibeDados();

        beltrano.ExibeDados();
        beltrano.realizarDeposito(670f);
        beltrano.ExibeDados();
        beltrano.realizarSaque(805.20f);
        beltrano.ExibeDados();
    }

}