package ListaDeFila.Q2;

import java.util.Scanner;

public class TesteQ2 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        FilaQ2 fila = new FilaQ2();
        int escolha=0;
        do {
            System.out.println("" +
                    "1 - inserir contato\n" +
                    "2 - proximo contato\n" +
                    "3 - sair");
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
                    Contato contato = new Contato();
                    ent.nextLine();
                    System.out.println("Qual o nome do contato?");
                    contato.setNome(ent.nextLine());
                    System.out.println("Qual o email do contato?");
                    contato.setEmail(ent.nextLine());
                    System.out.println("Qual o numero do contato?");
                    contato.setNumero(ent.nextLine());
                    fila.inserirContato(contato);
                    break;
                }
                case 2:{
                    fila.proximoContato();
                    break;
                }
            }
        }while (escolha!=3);
    }
}
