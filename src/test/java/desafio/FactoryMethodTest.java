package desafio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryMethodTest {

    @Test
    void deveRetornarMesmaInstancia() {
        FactoryMethod instancia1 = FactoryMethod.getInstance();
        FactoryMethod instancia2 = FactoryMethod.getInstance();
        assertSame(instancia1, instancia2);
    }

    @Test
    void deveRetornarFabricaPF() {
        FabricaAbstrata fabrica = FactoryMethod.getInstance().obterFabrica("PF");
        assertTrue(fabrica instanceof FabricaPF);
    }

    @Test
    void deveRetornarFabricaPJ() {
        FabricaAbstrata fabrica = FactoryMethod.getInstance().obterFabrica("PJ");
        assertTrue(fabrica instanceof FabricaPJ);
    }

    @Test
    void deveRetornarExcecaoParaFabricaInexistente() {
        try {
            FactoryMethod.getInstance().obterFabrica("Autonomo");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fábrica inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFabricaInvalida() {
        try {
            FactoryMethod.getInstance().obterFabrica("MEI");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fábrica inválida", e.getMessage());
        }
    }

}