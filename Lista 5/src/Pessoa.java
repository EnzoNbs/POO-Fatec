public class Pessoa extends Animal implements Cidadao, Contribuinte, Professor{
    @Override
    public void vota() {
        System.out.println("Nulo");
    }

    @Override
    public void getRg() {
        System.out.println("12312312345");
    }

    @Override
    public void pagaIR() {

    }

    @Override
    public void getCPF() {

    }

    @Override
    public void trabalha() {

    }

    @Override
    public void ensina() {

    }
}
