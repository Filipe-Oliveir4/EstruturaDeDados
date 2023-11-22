package ListaDeFila.Q1;

import ListaDeFila.Q1.FilaQ1;

import java.util.Scanner;

public class TesteQ1 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        FilaQ1 fila = new FilaQ1();
        int escolha=0;
        String nomeMusica;
        do {
            System.out.println("" +
                    "1 - inserir musica\n" +
                    "2 - consultar musica\n" +
                    "3 - remover musica\n" +
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
                    System.out.println("Qual o nome da musica?");
                    nomeMusica = ent.nextLine();
                    fila.inserirMusica(nomeMusica);
                    break;
                }
                case 2:{
                    fila.consultarMusica();
                    break;
                }
                case 3:{
                    fila.removerMusica();
                }
            }
        }while (escolha!=4);
    }
}
