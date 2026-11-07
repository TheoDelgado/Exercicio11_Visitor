package desafio;

public class CanalCorreios implements CanalEntrega {

    public String enviar(String conteudo) {
        return conteudo + " enviado pelos Correios";
    }
}