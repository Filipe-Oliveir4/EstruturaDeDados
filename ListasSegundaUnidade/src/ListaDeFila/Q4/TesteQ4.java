package ListaDeFila.Q4;

import java.util.Iterator;

public class TesteQ4 {
    public static void main(String[] args) {
        FilaQ4 fila = new FilaQ4();
        fila.inserirAluno("Ana",12);
        fila.inserirAluno("Filipe",2);
        fila.inserirAluno("Marcos",18);
        fila.inserirAluno("Yasmin",22);
        fila.listar();
        }
    }

