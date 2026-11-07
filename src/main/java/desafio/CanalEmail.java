package desafio;

public class CanalEmail implements CanalEntrega {

    public String enviar(String conteudo) {
        return conteudo + " enviado por E-mail";
    }
}