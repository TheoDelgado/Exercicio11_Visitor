package padroescomportamentais.chainofresponsability.suporte;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChamadoTest {

    AtendenteEspecialista especialista;
    AtendenteNivel3 nivel3;
    AtendenteNivel2 nivel2;
    AtendenteNivel1 nivel1;

    @BeforeEach
    void setUp() {
        especialista = new AtendenteEspecialista(null);
        nivel3 = new AtendenteNivel3(especialista);
        nivel2 = new AtendenteNivel2(nivel3);
        nivel1 = new AtendenteNivel1(nivel2);
    }

    @Test
    void deveRetornarNivel1ParaChamadoSenha() {
        assertEquals("Nível 1", nivel1.atenderChamado(new Chamado(TipoChamadoSenha.getTipoChamadoSenha())));
    }

    @Test
    void deveRetornarNivel2ParaChamadoRede() {
        assertEquals("Nível 2", nivel1.atenderChamado(new Chamado(TipoChamadoRede.getTipoChamadoRede())));
    }

    @Test
    void deveRetornarNivel3ParaChamadoServidor() {
        assertEquals("Nível 3", nivel1.atenderChamado(new Chamado(TipoChamadoServidor.getTipoChamadoServidor())));
    }

    @Test
    void deveRetornarEspecialistaParaChamadoSeguranca() {
        assertEquals("Especialista", nivel1.atenderChamado(new Chamado(TipoChamadoSeguranca.getTipoChamadoSeguranca())));
    }

    @Test
    void deveRetornarSemAtendimentoParaChamadoImpressora() {
        assertEquals("Sem atendimento", nivel1.atenderChamado(new Chamado(TipoChamadoImpressora.getTipoChamadoImpressora())));
    }

}