package padroescomportamentais.templatemethod.funcionario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioCLTTest {

    @Test
    void deveCalcularSalarioLiquidoSemBonus() {
        FuncionarioCLT funcionario = new FuncionarioCLT();
        funcionario.setSalarioBase(3000.0f);
        funcionario.setBonus(0.0f);
        assertEquals(2400.0f, funcionario.calcularSalarioLiquido(), 0.01f);
    }

    @Test
    void deveCalcularSalarioLiquidoComBonus() {
        FuncionarioCLT funcionario = new FuncionarioCLT();
        funcionario.setSalarioBase(3000.0f);
        funcionario.setBonus(500.0f);
        assertEquals(2800.0f, funcionario.calcularSalarioLiquido(), 0.01f);
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioCLT funcionario = new FuncionarioCLT();
        funcionario.setSalarioBase(3000.0f);
        funcionario.setBonus(0.0f);
        funcionario.setNome("Marco");
        funcionario.setMatricula(1);
        assertEquals("FuncionarioCLT{matricula=1, nome='Marco', salarioLiquido=2400.0}", funcionario.getInfo());
    }
}