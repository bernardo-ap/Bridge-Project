import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class IdosoTest {

    @Test
    void deveRetornarValorPassagemIdosoMoto() {
        Veiculo veiculo = new Moto();
        Idoso idoso = new Idoso(0);
        idoso.setVeiculo(veiculo);

        assertEquals(0.0f, idoso.calcularPrecoPassagem());
    }

    @Test
    void deveRetornarValorPassagemIdosoVan() {
        Veiculo veiculo = new Van();
        Idoso idoso = new Idoso(0);
        idoso.setVeiculo(veiculo);

        assertEquals(0.0f, idoso.calcularPrecoPassagem());
    }

    @Test
    void deveRetornarValorPassagemIdosoOnibus() {
        Veiculo veiculo = new Onibus();
        Idoso idoso = new Idoso(0);
        idoso.setVeiculo(veiculo);

        assertEquals(0.0f, idoso.calcularPrecoPassagem());
    }
}