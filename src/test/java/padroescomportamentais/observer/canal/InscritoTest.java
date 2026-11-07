package padroescomportamentais.observer.canal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscritoTest {

    @Test
    void deveNotificarUmInscrito() {
        Canal canal = new Canal("Código Aberto", "Programação");
        Inscrito inscrito = new Inscrito("Inscrito 1");
        inscrito.inscrever(canal);
        canal.publicarVideo();
        assertEquals("Inscrito 1, novo vídeo publicado no Canal{nomeCanal='Código Aberto', categoria='Programação'}", inscrito.getUltimaNotificacao());
    }

    @Test
    void deveNotificarInscritos() {
        Canal canal = new Canal("Código Aberto", "Programação");
        Inscrito inscrito1 = new Inscrito("Inscrito 1");
        Inscrito inscrito2 = new Inscrito("Inscrito 2");
        inscrito1.inscrever(canal);
        inscrito2.inscrever(canal);
        canal.publicarVideo();
        assertEquals("Inscrito 1, novo vídeo publicado no Canal{nomeCanal='Código Aberto', categoria='Programação'}", inscrito1.getUltimaNotificacao());
        assertEquals("Inscrito 2, novo vídeo publicado no Canal{nomeCanal='Código Aberto', categoria='Programação'}", inscrito2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarInscrito() {
        Canal canal = new Canal("Código Aberto", "Programação");
        Inscrito inscrito = new Inscrito("Inscrito 1");
        canal.publicarVideo();
        assertEquals(null, inscrito.getUltimaNotificacao());
    }

    @Test
    void deveNotificarInscritoDoCanalA() {
        Canal canalA = new Canal("Código Aberto", "Programação");
        Canal canalB = new Canal("Mundo Gamer", "Jogos");
        Inscrito inscrito1 = new Inscrito("Inscrito 1");
        Inscrito inscrito2 = new Inscrito("Inscrito 2");
        inscrito1.inscrever(canalA);
        inscrito2.inscrever(canalB);
        canalA.publicarVideo();
        assertEquals("Inscrito 1, novo vídeo publicado no Canal{nomeCanal='Código Aberto', categoria='Programação'}", inscrito1.getUltimaNotificacao());
        assertEquals(null, inscrito2.getUltimaNotificacao());
    }
}