package Questao1;

public class ListaQ1 {
    private NoDuplamente primeiro = null;
    private NoDuplamente ultimo = null;
    private NoDuplamente atual = null;

    public ListaQ1() {
    }

    public void addInicio(int num){
        NoDuplamente aux = new NoDuplamente(num);
        if (primeiro==null && ultimo==null) {
            primeiro = aux;
            ultimo = aux;
        }else{
            aux.setProximo(primeiro);
            primeiro.setAnterior(aux);
            primeiro=aux;
        }
    }
    public void addFinal(int num){
        NoDuplamente aux = new NoDuplamente(num);
        if (primeiro==null && ultimo==null) {
            primeiro=ultimo=aux;
        }else{
            ultimo.setProximo(aux);
            aux.setAnterior(ultimo);
            ultimo=aux;
        }
    }

    public void imprimirDoInicio(){
        for (atual=primeiro;atual!=null;atual=atual.getProximo()){
            System.out.print(atual +" ");
        }
        System.out.println();
    }
    public void imprimirDoFinal(){
        for (atual=ultimo;atual!=null;atual=atual.getAnterior()){
            System.out.print(atual+" ");
        }
        System.out.println();
    }

}
