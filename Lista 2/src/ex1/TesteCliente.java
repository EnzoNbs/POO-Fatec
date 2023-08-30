package ex1;

public class TesteCliente {
    public static void main(String[] args) {
        Cliente fulano = new Cliente("323144-4", "1212-0", "Fulano", 5200.42f);
        Cliente beltrano = new Cliente();

        System.out.println(fulano);

        fulano.realizarDeposito(500.0f);
        System.out.println("Saldo de Fulano: " + fulano.getSaldo());
        fulano.realizarSaque(320.0f);
        System.out.println("Saldo de Fulano: " + fulano.getSaldo());

        beltrano.setNome("beltrano");
        beltrano.setSaldo(222.40f);
        System.out.println(beltrano);

        System.out.println(fulano.getNumeroConta());
        System.out.println(fulano.getNome());
        System.out.println(fulano.getNumeroAgencia());
    }
}