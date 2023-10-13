public class Adulto extends Passageiro{

    public Adulto(float precoPorKM){
        super(precoPorKM);
    }

    public float calcularPrecoPassagem(){
        return this.precoPorKM * (this.veiculo.getTaxa());
    }

}
