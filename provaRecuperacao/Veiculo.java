package provaRecuperacao;
public abstract class Veiculo {
    private int capacidadeDePessoas;
    private double altura;
    private double largura;
    private boolean seguroDoVeiculo;

    public double getAltura() {//Método get para acessar
        return altura;
    }

    public void setAltura(double altura) {//Método set para mudar
        this.altura = altura;
    }

    public double getLargura() {//Método get para acessar
        return largura;
    }

    public void setLargura(double largura) {//Método set para mudar
        this.largura = largura;
    }

    public boolean getSeguroDoVeiculo() {//Método get para acessar
        return seguroDoVeiculo;
    }

    public void setSeguroDoVeiculo(boolean seguroDoVeiculo) {//Método set para mudar
        this.seguroDoVeiculo = seguroDoVeiculo;
    }

    public int getCapacidadeDePessoas() {//Método get para acessar
        return capacidadeDePessoas;
    }

    public void setCapacidadeDePessoas(int capacidadeDePessoas) {//Método set para mudar
        this.capacidadeDePessoas = capacidadeDePessoas;
    }
    public String toString(){
        return "Capacidade de pessoas: "+getCapacidadeDePessoas()+"\nAltura: "+getAltura()+"\nLargura: "+getLargura()+"\nSeguro do veiculo: "+getSeguroDoVeiculo();
    }
}
