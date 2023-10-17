package Questao3;

public class TesteListaQ3 {
    public static void main(String[] args) {
        ListaQ3<Aluno> lista = new ListaQ3<Aluno>();
        Aluno a1 =new Aluno("A1","1");
        Aluno a2 =new Aluno("A2","2");
        Aluno a3 =new Aluno("A3","3");
        Aluno a4 =new Aluno("A4","4");
        Aluno a5 =new Aluno("A5","5");
        Aluno a6 =new Aluno("A6","6");
        Aluno a7 =new Aluno("A7","7");

        //Adicionou 5 alunos
        lista.adicionarNoFim(a1);
        lista.adicionarNoFim(a2);
        lista.adicionarNoFim(a3);
        lista.adicionarNoFim(a4);
        lista.adicionarNoFim(a5);

        //adicionou no inicio
        lista.adicionarNoInicio(a6);
        //adicionou no fim
        lista.adicionarNoFim(a7);


        //listar os elementos
        System.out.println(lista.listar());

    }

}
