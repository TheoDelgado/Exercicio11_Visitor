package desafio;

public class FactoryMethod {

    private FactoryMethod() {};
    private static FactoryMethod instance = new FactoryMethod();
    public static FactoryMethod getInstance() {
        return instance;
    }

    public FabricaAbstrata obterFabrica(String tipo) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("desafio.Fabrica" + tipo);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Fábrica inexistente");
        }
        if (!(objeto instanceof FabricaAbstrata)) {
            throw new IllegalArgumentException("Fábrica inválida");
        }
        return (FabricaAbstrata) objeto;
    }
}