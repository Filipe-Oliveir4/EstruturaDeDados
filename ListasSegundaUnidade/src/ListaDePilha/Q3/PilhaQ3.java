package ListaDePilha.Q3;

import java.util.Scanner;
import java.util.Stack;

public class PilhaQ3 {
    public static void main(String[] args) {
        Stack<String> pilha =new Stack<>();
        Scanner ent = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("1 - inserir na pilha\n" +
                               "2 - obter proxima tarefa\n" +
                               "3 - sair");
            try {
                opcao= ent.nextInt();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            ent.nextLine();
            switch (opcao){
                case 1:{
                    System.out.println("Qual o nome da tarefa");
                    pilha.push(ent.nextLine());
                    System.out.println("Tarefa adicionada");
                    break;
                }
                case 2:{
                    if(pilha.empty()){
                        System.out.println("Pilha vazia");
                    }else{
                        System.out.println("Obteve a tarefa:"+pilha.pop());
                    }
                    break;
                }
            }
        }while (opcao!=3);
    }
}
