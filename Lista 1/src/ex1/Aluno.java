package ex1;

public class Aluno {
    public int numeroAluno;
    public String nome;
    public int idade;
    public float p1, p2;

    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    public float notaFinal(){
        return (p1 + p2) / 2;
    }

    public void dadosAluno(){
        System.out.println("Número do aluno: " + numeroAluno + "\nNome: " + nome + "\nIdade: " + idade);
    }

    public boolean passou(){
        return notaFinal() >= 6;
    }
}
