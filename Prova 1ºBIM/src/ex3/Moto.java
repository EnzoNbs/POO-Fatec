package ex3;
public class Moto extends Veiculo {
    private String categoria;

    public Moto(){
        super();
    }

    public Moto(String nome, String marca, String cor, int horsePower, String categoria) {
        super(nome, marca, cor, horsePower);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Moto ["+ super.toString() + " categoria=" + categoria + "]";
    }

    public int QtdRodas(){
        return 2;
    }

    
}
