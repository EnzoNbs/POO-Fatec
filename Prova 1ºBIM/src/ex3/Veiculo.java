package ex3;
public abstract class Veiculo {
    protected String nome;
    protected String marca;
    protected String cor;
    protected int horsePower;

    public Veiculo() {
    }

    public Veiculo(String nome, String marca, String cor, int horsePower) {
        this.setNome(nome);
        this.setMarca(marca);
        this.setCor(cor);
        this.setHorsePower(horsePower);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
     public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Veiculo [marca=" + marca + ", cor=" + cor + "]";
    }

    public abstract int QtdRodas();
}
