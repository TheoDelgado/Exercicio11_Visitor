package padroescomportamentais.iterator.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Biblioteca implements Iterable<Livro> {

    private List<Livro> livros = new ArrayList<Livro>();

    public Biblioteca(Livro... livros) {
        this.livros = Arrays.asList(livros);
    }

    @Override
    public Iterator<Livro> iterator() {
        return livros.iterator();
    }

}