package ex3;
public class Carro extends Veiculo {
    private String carroceria;

    public Carro() {
        super();
    }

    public Carro(String nome, String marca, String cor, int horsePower, String corpo) {
        super(nome, marca, cor, horsePower);
        this.carroceria = corpo;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String corpo) {
        this.carroceria = corpo;
    }

    @Override
    public String toString() {
        return "Carro ["+ super.toString() + " carroceria=" + carroceria + "]";
    }
    
    public int QtdRodas() {
        return 4;
    }
}
