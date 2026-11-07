package padroescomportamentais.iterator.biblioteca;

import java.util.Iterator;

public class Inventario {

    public static Integer contarLivrosDisponiveis(Biblioteca biblioteca) {
        int quantidade = 0;
        for (Livro livro : biblioteca) {
            if (livro.isDisponivel()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalLivros(Biblioteca biblioteca) {
        int quantidade = 0;
        for (Iterator l = biblioteca.iterator(); l.hasNext(); ) {
            quantidade++;
            l.next();
        }
        return quantidade;
    }

}