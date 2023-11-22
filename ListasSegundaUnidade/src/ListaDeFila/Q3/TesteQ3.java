package ListaDeFila.Q3;

import java.util.Scanner;

public class TesteQ3 {
    public static void main(String[] args) {
        FilaQ3 fila = new FilaQ3();
        Scanner ent = new Scanner(System.in);
        int escolha=0;
        String nomeCliente;
        do {
            System.out.println("" +
                    "1 - inserir cliente\n" +
                    "2 - consultar numero de clientes\n" +
                    "3 - remover cliente\n" +
                    "4 - sair");
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
                    System.out.println("Qual o nome do cliente?");
                    nomeCliente = ent.nextLine();
                    fila.inserirCliente(nomeCliente);
                    break;
                }
                case 2:{
                    System.out.println(fila.numClientes());
                    break;
                }
                case 3:{
                    fila.removerCliente();
                }
            }
        }while (escolha!=4);
    }
    }

