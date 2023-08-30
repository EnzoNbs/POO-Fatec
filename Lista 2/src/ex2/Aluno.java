package ex2;

public class Aluno {
    private int numeroAluno;
    private String nome;
    private  int idade;
    private float p1, p2;

    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        setNumeroAluno(numeroAluno);
        setNome(nome);
        setIdade(idade);
        setP1(p1);
        setP2(p2);
    }

    public Aluno() {
        setNumeroAluno(000000);
        setNome("Nenhum");
        setIdade(0);
        setP1(0);
        setP2(0);
    }

    public int getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(int numeroAluno) {
        String stringNumeroAluno = Integer.toString(numeroAluno);
        if (stringNumeroAluno.length() == 6) {
            this.numeroAluno = numeroAluno;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() <= 30 && !nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0){
            this.idade = idade;
        }
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        if (p1 >= 0 && p1 <= 10){
            this.p1 = p1;
        }
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        if (p2 >= 0 && p2 <= 10) {
            this.p2 = p2;
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "RA: " + numeroAluno +
                ", Nome: '" + nome + '\'' +
                ", Idade: " + idade +
                ", Nota 1: " + p1 +
                ", Nota 2: " + p2 +
                '}';
    }

    public void notaFinal(){
        System.out.println("Média final: " + (p1 + p2) / 2);
    }

    public void dadosAluno(){
        System.out.println("\nRA: " + getNumeroAluno() + "\nNome: " + getNome() + "\nIdade: " + getIdade());
    }
}