package ex4;

public class Veiculo {
    protected String nome;
    protected String marca;
    protected String cor;

    public Veiculo() {
    }
    
    public Veiculo(String nome, String marca, String cor) {
        this.setNome(nome);
        this.setMarca(marca);
        this.setCor(cor);
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

    @Override
    public String toString() {
        return "Veiculo [nome=" + nome + ", marca=" + marca + ", cor=" + cor + "]";
    }

}
