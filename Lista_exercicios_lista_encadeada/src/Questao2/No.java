package Questao2;

public class No {

    private Aluno aluno;
    private No proximo;

    public No(Aluno aluno) {
        this.aluno = aluno;
        this.proximo = null;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return aluno.toString();
    }
}
