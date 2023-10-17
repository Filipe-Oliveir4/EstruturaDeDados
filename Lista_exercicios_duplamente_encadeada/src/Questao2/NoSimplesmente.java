package Questao2;

public class NoSimplesmente {
    String nome;
    NoSimplesmente proximo;

    public NoSimplesmente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NoSimplesmente getProximo() {
        return proximo;
    }

    public void setProximo(NoSimplesmente proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
