package padroescomportamentais.templatemethod.funcionario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioEstagiarioTest {

    @Test
    void deveCalcularSalarioLiquidoSemBonus() {
        FuncionarioEstagiario funcionario = new FuncionarioEstagiario();
        funcionario.setSalarioBase(1500.0f);
        funcionario.setBonus(0.0f);
        assertEquals(1500.0f, funcionario.calcularSalarioLiquido(), 0.01f);
    }

    @Test
    void deveCalcularSalarioLiquidoComBonus() {
        FuncionarioEstagiario funcionario = new FuncionarioEstagiario();
        funcionario.setSalarioBase(1500.0f);
        funcionario.setBonus(200.0f);
        assertEquals(1700.0f, funcionario.calcularSalarioLiquido(), 0.01f);
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioEstagiario funcionario = new FuncionarioEstagiario();
        funcionario.setSalarioBase(1500.0f);
        funcionario.setBonus(0.0f);
        funcionario.setNome("Marcelo");
        funcionario.setMatricula(2);
        assertEquals("Funcionario{matricula=2, nome='Marcelo', salarioLiquido=1500.0}", funcionario.getInfo());
    }
}