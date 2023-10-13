public abstract class Passageiro {

    protected Veiculo veiculo;

    protected float precoPorKM;

    public Passageiro(float precoPorKM){
        this.precoPorKM = precoPorKM;
    }

    public void setVeiculo(Veiculo veiculo){
        this.veiculo = veiculo;
    }

    public abstract float calcularPrecoPassagem();
}
