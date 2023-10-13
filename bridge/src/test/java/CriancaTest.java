import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CriancaTest {

    @Test
    void deveRetornarValorPassagemCriancaMoto() {
        Veiculo veiculo = new Moto();
        Crianca crianca= new Crianca(5f);
        crianca.setVeiculo(veiculo);

        assertEquals(2.5f, crianca.calcularPrecoPassagem());
    }

    @Test
    void deveRetornarValorPassagemCriancaVan() {
        Veiculo veiculo = new Van();
        Crianca crianca= new Crianca(5f);
        crianca.setVeiculo(veiculo);

        assertEquals(3.75f, crianca.calcularPrecoPassagem());
    }

    @Test
    void deveRetornarValorPassagemCriancaOnibus() {
        Veiculo veiculo = new Onibus();
        Crianca crianca= new Crianca(5f);
        crianca.setVeiculo(veiculo);

        assertEquals(6.25f, crianca.calcularPrecoPassagem());
    }
}