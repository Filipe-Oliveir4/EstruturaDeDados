package ListaDePilha.Q1;

import java.util.Scanner;

public class TesteQ1 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        PilhaQ1 pilha = new PilhaQ1();
        int escolha=0;
        String nomeLivro;
        do{
            System.out.println("1 -Inserir pilha\n" +
                    "2 - Consultar pilha\n" +
                    "3 - Remover da pilha\n" +
                    "4 - Esvaziar pilha\n" +
                    "5 - Sair\n" );
            try {
                escolha= ent.nextInt();
                if (escolha<1 || escolha>5){
                    throw new Exception("A escolha precisa estar entre 1 e 6");
                }
            }catch (Exception exception){
                System.out.println(exception.getMessage());
            }
            switch (escolha){
                case 1:{
                    ent.nextLine();
                    System.out.println("Qual o nome do livro?");
                    nomeLivro=  ent.nextLine();
                    pilha.inserirNaPilha(nomeLivro);
                    break;
                }
                case 2:{
                    pilha.consultarPilha();
                    break;
                }
                case 3:{
                    pilha.removerDaPilha();
                    break;
                }
                case 4:{
                    pilha.esvaziarPilha();
                    break;
                }
            }
        }while(escolha!=5);
    }
}
