package ex0;

public class JogadorBasquete implements IBasquete {

    @Override
    public void arremessar() {
        System.out.println("Arremessou...");
    }

    @Override
    public void pegarRebote() {
        System.out.println("Pegou o rebote...");
    }

    @Override
    public void fazerBloqueio() {
        System.out.println("Fez o bloqueio...");
    }

    @Override
    public void darToco() {
        System.out.println("Deu o toco...");
    }
    
}
