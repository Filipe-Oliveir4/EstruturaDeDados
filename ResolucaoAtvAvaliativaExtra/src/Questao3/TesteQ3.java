package Questao3;

import Questao1.FilaDeMusica;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class TesteQ3 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        PilhaFila pilhaFila = new PilhaFila();
        int opcao=0;
        do {
            //Inserção de opção
            System.out.println("1 - Inserir dados na fila\n2 - Listar os dados na fila" +
                    "\n3 - Transferir os dados da fila para uma pilha\n4 - Listar os dados da pilha" +
                    "\n5 - sair");
            try {
                opcao = ent.nextInt();
                if (opcao<=0 || opcao>5){
                    throw new Exception("Insira um numero entre 1 e 5");
                }
            }catch (InputMismatchException exception){
                System.out.println("Insira um numero");
                opcao=0;
                ent.nextLine();
            }catch (Exception exception){
                System.out.println(exception.getMessage());
                opcao=0;
                ent.nextLine();
            }

            //Execução das opções
            switch(opcao){
                case 1:{
                    System.out.println("Insira Numero");
                    ent.nextLine();
                    int num;
                    try {
                       num = ent.nextInt();
                       pilhaFila.inseriFila(num);
                    }catch (Exception exception){
                        System.out.println(exception.getMessage());
                    }
                    break;
                }
                case 2:{
                    pilhaFila.listarFila();
                    break;
                }
                case 3:{
                    pilhaFila.tranferirFilaPilha();
                    break;
                }
                case 4:{
                    pilhaFila.listarPilha();
                }
            }
        }while (opcao!=5);
        System.out.println("Fim da execuçao");
    }
}
