package provaRecuperacao;
public class VeiculoAereo extends Veiculo{//Criando a classe VeiculoAereo que herda Veiculo
    private String piloto;

    public String getPiloto() {//Método get para acessar
        return piloto;
    }

    public void setPiloto(String piloto) {//Método set para mudar
        this.piloto = piloto;
    }
    @Override
    public String toString(){
        return "Capacidade de pessoas: "+getCapacidadeDePessoas()+"\nAltura: "+getAltura()+"\nLargura: "+getLargura()+"\nSeguro do veiculo: "+getSeguroDoVeiculo()+"\nPiloto: "+getPiloto();
    }
}
