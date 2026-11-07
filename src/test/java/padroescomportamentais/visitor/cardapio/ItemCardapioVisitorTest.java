package padroescomportamentais.visitor.cardapio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemCardapioVisitorTest {

    @Test
    void deveExibirPrato() {
        Prato prato = new Prato(1, "Lasanha", new Categoria("Massas"));

        ItemCardapioVisitor visitor = new ItemCardapioVisitor();
        assertEquals("Prato{codigo=1, nome='Lasanha', categoria=Massas}", visitor.exibir(prato));
    }

    @Test
    void deveExibirBebida() {
        Bebida bebida = new Bebida(2, "Suco de Laranja", "500ml");

        ItemCardapioVisitor visitor = new ItemCardapioVisitor();
        assertEquals("Bebida{codigo=2, nome='Suco de Laranja', tamanho='500ml'}", visitor.exibir(bebida));
    }

    @Test
    void deveExibirSobremesa() {
        Sobremesa sobremesa = new Sobremesa(3, "Pudim", 12.5f);

        ItemCardapioVisitor visitor = new ItemCardapioVisitor();
        assertEquals("Sobremesa{codigo=3, nome='Pudim', preco=12.5}", visitor.exibir(sobremesa));
    }

}