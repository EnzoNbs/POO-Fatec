package ex4;

import java.util.ArrayList;

public class Estacionamento {
    private int lugares; // Onde estaciona cada carro
    private String endereco;
    private ArrayList<Veiculo> veiculos;

    public Estacionamento() {
        this.veiculos = new ArrayList<>(lugares);
    }
    
    public Estacionamento(int lugares, String endereco, ArrayList<Veiculo> veiculos) {
        this.lugares = lugares;
        this.endereco = endereco;
        this.veiculos = veiculos;
    }

    public int getLugares() {
        return lugares;
    }
    public void setLugares(int lugares) {
        this.lugares = lugares;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public void addVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
    }

    public boolean removeVeiculo(Veiculo veiculo){
        return veiculos.remove(veiculo);
    }
    
    @Override
    public String toString() {
        return "Estacionamento [lugares=" + lugares + ", endereco=" + endereco + ", \nVeiculos=" + veiculos + "]";
    }

}
