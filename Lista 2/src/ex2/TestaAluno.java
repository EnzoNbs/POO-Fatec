package ex2;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(112123,"Daniel", 18, 6.0f, 5.5f);
        Aluno aluno2 = new Aluno();


        aluno2.setIdade(-3);
        aluno2.setNumeroAluno(43435);
        aluno2.setP1(-4);
        aluno2.setP2(12);

        System.out.println(aluno2.getP1());
        System.out.println(aluno1.getP2());

        System.out.println(aluno1);
        System.out.println(aluno2);

        aluno1.dadosAluno();
        aluno1.notaFinal();

        aluno2.dadosAluno();
        aluno2.notaFinal();
    }
}