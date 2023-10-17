package Questao1;

public class NoDuplamente {
    int num;
    NoDuplamente anterior=null;
    NoDuplamente proximo=null;

    public NoDuplamente(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
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
        return num+"";
    }
}
