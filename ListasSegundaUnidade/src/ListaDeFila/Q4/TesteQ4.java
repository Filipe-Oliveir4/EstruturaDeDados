package ListaDeFila.Q4;

import java.util.Iterator;
import java.util.Scanner;

public class TesteQ4 {
    public static void main(String[] args) {
        FilaQ4 fila = new FilaQ4();
        Scanner ent = new Scanner(System.in);
        int escolha=0, idade=0;
        String nomeAluno="";
        do{
            System.out.println("1 -Inserir alunos\n" +
                    "2 - Consultar alunos\n" +
                    "3 - Sair");
            try {
                escolha= ent.nextInt();
                if (escolha<1 || escolha>4){
                    throw new Exception("A escolha precisa estar entre 1 e 4");
                }
            }catch (Exception exception){
                System.out.println(exception.getMessage());
            }
            switch (escolha){
                case 1:{
                    ent.nextLine();
                    System.out.println("Qual o nome do aluno?");
                    nomeAluno=  ent.nextLine();
                    System.out.println("Qual a idade do aluno?");
                    idade =  ent.nextInt();
                    ent.nextLine();
                    fila.inserirAluno(nomeAluno,idade);
                    break;
                }
                case 2:{
                    fila.listar();
                    break;
                }
            }
        }while(escolha!=3);
        }
    }

