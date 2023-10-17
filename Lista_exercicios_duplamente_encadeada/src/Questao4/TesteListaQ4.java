package Questao4;

public class TesteListaQ4 {
    public static void main(String[] args) {
        ListaQ4<Integer> lista = new ListaQ4<Integer>();
        int num =1;
        boolean addInicioFim=true;
        int qtdNum=0;
        while (qtdNum<15){
            if (num%2==1){
                if(addInicioFim){
                    lista.adicionarNoFim(num);
                    addInicioFim=false;
                }else{
                    lista.adicionarNoInicio(num);
                    addInicioFim=true;
                }
                qtdNum++;
            }
            num++;
        }
        System.out.println(lista.listar());
        lista.removerDofim();
        lista.removerDoinicio();
        System.out.println(lista.listar());
    }
}
