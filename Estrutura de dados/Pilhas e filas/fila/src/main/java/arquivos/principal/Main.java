package arquivos.principal;

import arquivos.classes.Fila;
import arquivos.classes.No;

public class Main {
    public static void main(String[] agrs){
        Fila<String> fila = new Fila<>();

        fila.enqueue("primeiro");
        fila.enqueue("segundo");
        fila.enqueue("terceiro");
        fila.enqueue("quarto");

        System.out.println(fila.dequeue());
        System.out.println(fila);
    }
}
