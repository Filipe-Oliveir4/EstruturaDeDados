package Questao2;

public class ListaQ2 {
    private No atual=null;
    private No primeiro=null;
    private No ultimo=null;
    public ListaQ2() {

    }

    public No getAtual() {
        return atual;
    }

    public void setAtual(No atual) {
        this.atual = atual;
    }

    public No getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public No getUltimo() {
        return ultimo;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }

    public void add(String matricula, String nome) {
        Aluno aluno = new Aluno(matricula,nome);
        No no = new No(aluno);
        if(this.primeiro==null) {
            this.primeiro=no;
            this.ultimo=no;
        }else {
            this.ultimo.setProximo(no);
            this.ultimo=no;
        }
    }

    public  void add(No no){
        if(this.primeiro==null) {
            this.primeiro=no;
            this.ultimo=no;
        }else {
            this.ultimo.setProximo(no);
            this.ultimo=no;
        }
    }

    public void remover() {
        this.atual = this.primeiro;
        if(ultimo==null && primeiro==null){
            System.out.println("Lista vazia");
        } else if (primeiro==ultimo) {
            primeiro=ultimo=null;
        }else {
            while(!atual.getProximo().equals(ultimo)){
                atual=atual.getProximo();
            }
            atual.setProximo(null);
            ultimo=atual;
        }
    }
    public void remover(ListaQ2 lista, No no){
        No atual=lista.getPrimeiro();
        No remover = null;
        if(lista.listaVazia()){
            System.out.println("Lista vazia");
        }else{
            if(atual.equals(no)){
                lista.setPrimeiro(atual.getProximo());
                atual=null;
            }else{
                while (atual.getProximo()!=no){
                    atual=atual.getProximo();
                }
                remover = atual.getProximo();
                atual.setProximo(atual.getProximo().getProximo());
                remover =null;
            }

        }
    }


    public void pesquisar(String nome){
       this.atual=this.primeiro;
       while (atual!=null){
           if (atual.getAluno().getNome().equals(nome)){
               System.out.println(atual);
           }
           atual=atual.getProximo();
           }
    }

    public void mostrarLista(){
        this.atual=primeiro;
        while (atual!=null){
            System.out.println(atual);
            atual=atual.getProximo();
        }
    }

    public ListaQ2 colocarEmOrdemAlfabetica(ListaQ2 lista){
        ListaQ2 listaOrdenada = new ListaQ2();
        No menor;
        while (lista.getPrimeiro()!=null){
            atual=primeiro;
            menor =primeiro;
            if(atual!=null){
                while (atual.getProximo()!=null){
                    if (atual.getAluno().getNome().charAt(0)>atual.getProximo().getAluno().getNome().charAt(0)){
                        menor=atual.getProximo();
                    }
                    atual=atual.getProximo();
                }
                listaOrdenada.add(menor.getAluno().getMatricula(),menor.getAluno().getNome());
                lista.remover(lista,menor);
            }
        }
        return listaOrdenada;
    }

    public boolean listaVazia(){
        if(this.primeiro==null&&this.ultimo==null){
            return  true;
        }else{
            return false;
        }
    }
    public String buscaRecursiva(No no, String nome){
        if(no==null){
            return "Sem resultado";
        }else if (no.getAluno().getNome().equals(nome)){
            return no.getAluno().toString();
        }else{
            return buscaRecursiva(no.getProximo(),nome);
        }
    }
}
