public class Crianca extends Passageiro {

    public Crianca(float precoPorKM){
        super(precoPorKM);
    }

    public float calcularPrecoPassagem(){
        return (this.precoPorKM * (this.veiculo.getTaxa()) / 2);
    }
}

