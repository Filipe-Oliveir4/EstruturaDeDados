package Questao3;

public class No {
    int num;
    int posicao;
    No proximo;

    public No(int num, int posicao) {
        this.num = num;
        this.posicao=posicao;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return num+" - "+this.posicao;
    }
}
