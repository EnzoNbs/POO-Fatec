package ex0;

public class JogadorBasqueteFutebolVolei implements IBasquete, IFutebol, IVolei {

    @Override
    public void sacar() {
        System.out.println("Sacou...");
    }

    @Override
    public void bloquear() {
        System.out.println("Bloqueou...");
    }

    @Override
    public void recepcionar() {
        System.out.println("Recepcionou...");
    }

    @Override
    public void atacar() {
        System.out.println("Atacou...");
    }

    @Override
    public void cabecear() {
        System.out.println("Cabeceou...");
    }

    @Override
    public void chutar() {
        System.out.println("Chutou...");
    }

    @Override
    public void cobrarEscanteio() {
        System.out.println("Cobrou escanteio...");
    }

    @Override
    public void cobrarPenalti() {
        System.out.println("Cobrou penalti...");
    }

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