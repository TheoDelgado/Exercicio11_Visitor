package padroesestruturais.decorator.bebida;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BebidaTest {

    @Test
    void deveRetornarPrecoBebida() {
        Bebida bebida = new BebidaEspresso(10.0f);

        assertEquals(10.0f, bebida.getPreco());
    }

    @Test
    void deveRetornarPrecoBebidaComLeiteVapor() {
        Bebida bebida = new LeiteVapor(new BebidaEspresso(10.0f));

        assertEquals(11.0f, bebida.getPreco());
    }

    @Test
    void deveRetornarPrecoBebidaComChantilly() {
        Bebida bebida = new Chantilly(new BebidaEspresso(10.0f));

        assertEquals(12.0f, bebida.getPreco());
    }

    @Test
    void deveRetornarPrecoBebidaComXaropeCaramelo() {
        Bebida bebida = new XaropeCaramelo(new BebidaEspresso(10.0f));

        assertEquals(10.5f, bebida.getPreco());
    }

    @Test
    void deveRetornarPrecoBebidaComLeiteVaporMaisChantilly() {
        Bebida bebida = new LeiteVapor(new Chantilly(new BebidaEspresso(10.0f)));

        assertEquals(13.2f, bebida.getPreco(), 0.001f);
    }

    @Test
    void deveRetornarPrecoBebidaComLeiteVaporMaisXaropeCaramelo() {
        Bebida bebida = new LeiteVapor(new XaropeCaramelo(new BebidaEspresso(10.0f)));

        assertEquals(11.55f, bebida.getPreco(), 0.001f);
    }

    @Test
    void deveRetornarPrecoBebidaComChantillyMaisXaropeCaramelo() {
        Bebida bebida = new Chantilly(new XaropeCaramelo(new BebidaEspresso(10.0f)));

        assertEquals(12.6f, bebida.getPreco(), 0.001f);
    }

    @Test
    void deveRetornarPrecoBebidaComLeiteVaporMaisChantillyMaisXaropeCaramelo() {
        Bebida bebida = new LeiteVapor(new Chantilly(new XaropeCaramelo(new BebidaEspresso(10.0f))));

        assertEquals(13.86f, bebida.getPreco(), 0.001f);
    }

    @Test
    void deveRetornarDescricaoBebida() {
        Bebida bebida = new BebidaEspresso();

        assertEquals("Espresso", bebida.getDescricao());
    }

    @Test
    void deveRetornarDescricaoBebidaComLeiteVapor() {
        Bebida bebida = new LeiteVapor(new BebidaEspresso());

        assertEquals("Espresso/Leite Vaporizado", bebida.getDescricao());
    }

    @Test
    void deveRetornarDescricaoBebidaComChantilly() {
        Bebida bebida = new Chantilly(new BebidaEspresso());

        assertEquals("Espresso/Chantilly", bebida.getDescricao());
    }

    @Test
    void deveRetornarDescricaoBebidaComXaropeCaramelo() {
        Bebida bebida = new XaropeCaramelo(new BebidaEspresso());

        assertEquals("Espresso/Xarope de Caramelo", bebida.getDescricao());
    }

    @Test
    void deveRetornarDescricaoBebidaComLeiteVaporMaisChantilly() {
        Bebida bebida = new LeiteVapor(new Chantilly(new BebidaEspresso()));

        assertEquals("Espresso/Chantilly/Leite Vaporizado", bebida.getDescricao());
    }

    @Test
    void deveRetornarDescricaoBebidaComLeiteVaporMaisXaropeCaramelo() {
        Bebida bebida = new LeiteVapor(new XaropeCaramelo(new BebidaEspresso()));

        assertEquals("Espresso/Xarope de Caramelo/Leite Vaporizado", bebida.getDescricao());
    }

    @Test
    void deveRetornarDescricaoBebidaComChantillyMaisXaropeCaramelo() {
        Bebida bebida = new Chantilly(new XaropeCaramelo(new BebidaEspresso()));

        assertEquals("Espresso/Xarope de Caramelo/Chantilly", bebida.getDescricao());
    }

    @Test
    void deveRetornarDescricaoBebidaComLeiteVaporMaisChantillyMaisXaropeCaramelo() {
        Bebida bebida = new LeiteVapor(new Chantilly(new XaropeCaramelo(new BebidaEspresso())));

        assertEquals("Espresso/Xarope de Caramelo/Chantilly/Leite Vaporizado", bebida.getDescricao());
    }

}