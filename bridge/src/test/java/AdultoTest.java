import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdultoTest {

    @Test
    void deveRetornarValorPassagemAdultoMoto() {
        Veiculo veiculo = new Moto();
        Adulto adulto= new Adulto(5f);
        adulto.setVeiculo(veiculo);

        assertEquals(5.0f, adulto.calcularPrecoPassagem());
    }

    @Test
    void deveRetornarValorPassagemAdultoVan() {
        Veiculo veiculo = new Van();
        Adulto adulto= new Adulto(5f);
        adulto.setVeiculo(veiculo);

        assertEquals(7.5f, adulto.calcularPrecoPassagem());
    }

    @Test
    void deveRetornarValorPassagemAdultoOnibus() {
        Veiculo veiculo = new Onibus();
        Adulto adulto= new Adulto(5f);
        adulto.setVeiculo(veiculo);

        assertEquals(12.5f, adulto.calcularPrecoPassagem());
    }
}