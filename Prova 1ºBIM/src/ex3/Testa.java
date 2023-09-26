package ex3;
public class Testa {
    public static void Mostrar(Veiculo veiculo){
        System.out.println(veiculo.toString());
        System.out.println("Quantidade de Rodas: " + veiculo.QtdRodas());
    }
    public static void main(String[] args) throws Exception {
        Carro objCarro = new Carro("LaFerrari", "Ferrari", "Vermelho Elegante", 963, "Coupé");
        Mostrar(objCarro);

        Moto objMoto = new Moto("Ninja H2R", "Kawasaki", "Preto Carbono", 326, "Sporty");
        Mostrar(objMoto);
    }
}
