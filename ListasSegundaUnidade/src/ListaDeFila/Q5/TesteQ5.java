package ListaDeFila.Q5;

import java.util.Scanner;

public class TesteQ5 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        FilaQ5 fila = new FilaQ5();
        int escolha=0;
        String nomeAluno;
        do{
            System.out.println("1 -Inserir paciente\n" +
                    "2 - Atender paciente\n" +
                    "3 - Verificar se há paciente\n" +
                    "4 - Indicar proximo paciente a ser atendido\n" +
                    "5 - Quantidade de pacientes que aguardam atendimento\n" +
                    "6 - sair");
            try {
                escolha= ent.nextInt();
                if (escolha<1 || escolha>6){
                    throw new Exception("A escolha precisa estar entre 1 e 6");
                }
            }catch (Exception exception){
                System.out.println(exception.getMessage());
            }
            switch (escolha){
                case 1:{
                    ent.nextLine();
                    System.out.println("Qual o nome do paciente?");
                    nomeAluno=  ent.nextLine();
                    fila.inserirPaciente(nomeAluno);
                    break;
                }
                case 2:{
                    fila.atenderPaciente();
                    break;
                }
                case 3:{
                    fila.verificarPaciente();
                    break;
                }
                case 4:{
                    fila.proximoPaciente();
                    break;
                }
                case 5:{
                    fila.quantidadePacientes();
                    break;
                }
            }
        }while(escolha!=6);
    }
}
