package Questao2;


public class ListaDuplamente {
    private NoDuplamente primeiro=null;
    private NoDuplamente ultimo=null;
    private NoDuplamente atual=null;

    public ListaDuplamente() {
    }

    public Questao2.NoDuplamente getPrimeiro() {
        return primeiro;
    }

    public Questao2.NoDuplamente getUltimo() {
        return ultimo;
    }

    public Questao2.NoDuplamente getAtual() {
        return atual;
    }

    public void addInicio(String nome){
        NoDuplamente aux = new NoDuplamente(nome);
        if (primeiro==null && ultimo==null) {
            primeiro = aux;
            ultimo = aux;
        }else{
            aux.setProximo(primeiro);
            primeiro.setAnterior(aux);
            primeiro=aux;
        }
    }

    public void imprimirDoInicio(){
        for (atual=primeiro;atual!=null;atual=atual.getProximo()){
            System.out.print(atual +" ");
        }
        System.out.println();
    }
}
