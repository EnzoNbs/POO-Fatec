package ex4;

public class TestaRio {

    public static void main(String[] args) {
        Rio rio1 = new Rio("Tietê", 2500, true);
        Rio rio2 = new Rio();

        rio2.nome = "São Francisco";
        rio2.nivel = 3022.41f;
        rio2.poluido = false;

        rio1.Mostrar();
        rio2.Mostrar();

        rio1.Chover(500);
        rio1.Mostrar();

        rio2.Ensolarar(102.30f);
        rio2.Mostrar();

        rio1.Limpar();
        rio1.Mostrar();

        rio2.Sujar();
        rio2.Mostrar();

    }
}