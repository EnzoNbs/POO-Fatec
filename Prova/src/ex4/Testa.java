package ex4;

public class Testa {
    public static void main(String[] args) {
        Veiculo objCarro = new Veiculo("Carrera", "Porsche", "Cinza");
        Veiculo objCarro2 = new Veiculo("Stingray", "Corvette", "Laranja");
        Veiculo objCarro3 = new Veiculo("Porto Fino", "Ferrari", "Branco");

        Estacionamento objEstacionamento = new Estacionamento();

        objEstacionamento.setEndereco("Centro");
        objEstacionamento.setLugares(40);
        objEstacionamento.addVeiculo(objCarro3);
        objEstacionamento.addVeiculo(objCarro2);
        objEstacionamento.addVeiculo(objCarro);

        System.out.println(objEstacionamento);
    }
}
