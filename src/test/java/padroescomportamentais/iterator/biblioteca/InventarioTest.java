package padroescomportamentais.iterator.biblioteca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventarioTest {

    @Test
    void deveContarLivrosDisponiveis() {
        Biblioteca biblioteca = new Biblioteca(
                new Livro("Dom Casmurro", true),
                new Livro("O Cortiço", true),
                new Livro("Memórias Póstumas", false),
                new Livro("Vidas Secas", true)
        );
        assertEquals(3, Inventario.contarLivrosDisponiveis(biblioteca));
    }

    @Test
    void deveContarTotalLivros() {
        Biblioteca biblioteca = new Biblioteca(
                new Livro("Dom Casmurro", true),
                new Livro("O Cortiço", true),
                new Livro("Memórias Póstumas", false),
                new Livro("Vidas Secas", true)
        );
        assertEquals(4, Inventario.contarTotalLivros(biblioteca));
    }

}