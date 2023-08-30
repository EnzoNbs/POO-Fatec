package ex1;

public class TesteAluno {

    public static void main(String[] args) {
        Aluno aluno = new Aluno(23, "João", 16, 6, 8);

        aluno.dadosAluno();
        System.out.println("Média final: " + aluno.notaFinal());

        System.out.println(aluno.passou() ? "Aprovado" : "Reprovado");
    }
}