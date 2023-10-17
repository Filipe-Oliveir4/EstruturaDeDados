package Questao2;

public class NoDuplamente {
    String nome;
    NoDuplamente anterior=null;
    NoDuplamente proximo=null;

    public NoDuplamente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NoDuplamente getAnterior() {
        return anterior;
    }

    public void setAnterior(NoDuplamente anterior) {
        this.anterior = anterior;
    }

    public NoDuplamente getProximo() {
        return proximo;
    }

    public void setProximo(NoDuplamente proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
