package provaRecuperacao;
public class VeiculoAquatico extends Veiculo{//Criando a classe VeiculoAquatico que herda Veiculo
    private String comandante;

    public String getComandante() {//Método get para acessar
        return comandante;
    }

    public void setComandante(String comandante) {//Método set para mudar
        this.comandante = comandante;
    }
    @Override
    public String toString(){
        return "Capacidade de pessoas: "+getCapacidadeDePessoas()+"\nAltura: "+getAltura()+"\nLargura: "+getLargura()+"\nSeguro do veiculo: "+getSeguroDoVeiculo()+"\nComandante: "+getComandante();
    }
}
