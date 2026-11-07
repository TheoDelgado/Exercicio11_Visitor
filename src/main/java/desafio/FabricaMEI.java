package desafio;

public class FabricaMEI {

    public Contrato createContrato() {
        return new ContratoPF();
    }
}