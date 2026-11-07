package padroescriacao.singleton.tema;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfiguracaoTemaTest {

    @Test
    public void deveRetornarTemaAtual() {
        ConfiguracaoTema.getInstance().setTemaAtual("Escuro");
        assertEquals("Escuro", ConfiguracaoTema.getInstance().getTemaAtual());
    }

    @Test
    public void deveRetornarCorDestaque() {
        ConfiguracaoTema.getInstance().setCorDestaque("Azul");
        assertEquals("Azul", ConfiguracaoTema.getInstance().getCorDestaque());
    }

}