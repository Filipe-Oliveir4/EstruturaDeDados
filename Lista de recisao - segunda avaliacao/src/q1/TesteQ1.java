package q1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteQ1 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        FilaQ1 fila = new FilaQ1();
        int opcao=0;
        do{
            System.out.println("1 - inserir entrevistado\n" +
                    "2 - proximo entrevistado\n" +
                    "3 - sair");
            try {
                opcao = ent.nextInt();
                if (opcao<=0 || opcao>3){
                    throw new Exception("Insira um numero entre 1 e 3");
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

            switch(opcao){
                case 1:{
                    String nomeEntrevistado;
                    System.out.println("Insira o nome");
                    ent.nextLine();
                    try {
                        nomeEntrevistado = ent.nextLine();
                        if(nomeEntrevistado.equals("")){
                            throw new Exception("Insira uma nome válido para o entrevistado");
                        }
                        fila.inserirContato(nomeEntrevistado);
                    }catch (Exception exception){
                        System.out.println(exception.getMessage());
                    }
                    break;
                }
                case 2:{
                    fila.proximoContato();
                    break;
                }
            }
        }while(opcao!=3);
    }

}
