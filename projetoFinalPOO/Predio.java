package projetoFinalPOO;
public class Predio {
    private int quantidadeSalas;
    public void setQuantidadeSalas(int quantidadeSalas){//Método set para mudar
        this.quantidadeSalas = quantidadeSalas;
    }    
     public double getQuantidadeSalas(){//Método get para acessar
        return this.quantidadeSalas;
     }
    /*private double taxaOcupacaoPredio(double periodosSalas,double periodosSalasVazias){
        return periodosSalas/periodosSalasVazias;
    }*/
}