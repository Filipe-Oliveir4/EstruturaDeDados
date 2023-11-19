package Questao1;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class TesteQ1 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        FilaDeMusica filaDeMusica = new FilaDeMusica();
        int opcao=0;
        do {
            //Inserção de opção
            System.out.println("1 - Inserir musica\n2 - Tocar musica" +
                    "\n3 - Consultar musica\n4 - sair");
            try {
                opcao = ent.nextInt();
                if (opcao<=0 || opcao>4){
                    throw new Exception("Insira um numero entre 1 e 4");
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
                    String nomeMusica;
                    System.out.println("Insira o nome da musica");
                    ent.nextLine();
                    try {
                        nomeMusica = ent.nextLine();
                        if(nomeMusica.equals("")){
                            throw new Exception("Insira uma nome valido para musica");
                        }
                        filaDeMusica.inserirMusica(nomeMusica);
                    }catch (Exception exception){
                        System.out.println(exception.getMessage());
                    }
                    break;
                }
                case 2:{
                    filaDeMusica.proximaMusica();
                    break;
                }
                case 3:{
                    Iterator iterator = filaDeMusica.ConsultarMusica();
                    if(iterator.hasNext()){
                        System.out.println("Lista:");
                        int x =1;
                        while (iterator.hasNext()){
                            System.out.println(x++ +" - "+iterator.next());
                        }
                        System.out.println("Fim da lista\n");
                    }else{
                        System.out.println("Lista vazia\n");
                    }
                }
            }
        }while (opcao!=4);
        System.out.println("Fim da execuçao");
    }
}
