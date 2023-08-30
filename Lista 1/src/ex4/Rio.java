package ex4;

public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;

    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public Rio() {
    }

    public void Chover(float elevacao) {
        this.nivel += elevacao;
        System.out.println("Nivel elevado...");
    }

    public void Ensolarar(float reducao) {

        if (this.nivel < reducao) {
            this.nivel = 0;
            System.out.println("O rio está seco");
        } else {
            this.nivel -= reducao;
            System.out.println("Nivel reduzido...");
        }
    }

    public void Limpar() {
        this.poluido = false;
        System.out.println("Rio limpado");
    }

    public void Sujar() {
        this.poluido = true;
        System.out.println("Rio sujado");
    }

    public void Mostrar() {
        System.out.println("Nome do Rio: " + this.nome + "\nNivel: " + this.nivel
                + "\nRio poluido? " + (this.poluido ? "Sim" : "Não"));
        System.out.println("-----");
    }
}