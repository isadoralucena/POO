package provaRecuperacao;
public class VeiculoTerrestre extends Veiculo{//Criando a classe VeiculoTerrestre que herda Veiculo
    private String motorista;
    public String getMotorista() {//Método get para acessar
        return motorista;
    }

    public void setMotorista(String motorista) {//Método set para mudar
        this.motorista = motorista;
    }
    @Override
    public String toString(){
        return "Capacidade de pessoas: "+getCapacidadeDePessoas()+"\nAltura: "+getAltura()+"\nLargura: "+getLargura()+"\nSeguro do veiculo: "+getSeguroDoVeiculo()+"\nMotorista: "+getMotorista();
    }
}
