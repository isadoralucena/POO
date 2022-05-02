/*Implementar uma classe Lampada que deve possuir como características 
tipo (led, fluorescente,...), 
voltagem, cor, marca, preço, potência, status(boolean). 
Nesta classe devem ser implementados os métodos construtores, getters, setters, toString, ascender e apagar. 
Em uma outra classe chamada LampadaTeste devem ser criados dois objetos do tipo Lampada, 
atribuir valores e exibir os dados deste objeto. 
O programa deverá informar também qual das duas lâmpadas possui maior potência e também 
qual das lâmpadas é a mais cara.*/
package POO;
public class Lampada {
    private String tipoDaLampada;
    private int voltagem;
    private String cor;
    private String marca;
    private float preco;
    private int potencia;
    private boolean statusDaLampada;

    public void setTipoDaLampada(String tipoDaLampada){
    this.tipoDaLampada = tipoDaLampada;
    }
    public void setCor(String cor){
    this.cor = cor;
    }
    public void setMarca(String marca){
    this.marca = marca;
    }
    public void setVoltagem(int voltagem){
    this.voltagem = voltagem;
    }
    public void setPotencia(int potencia){
    this.potencia = potencia;
    }
    public void setPreco(float preco){
    this.preco = preco;
    }
    public void setStatusDaLampada(boolean statusDaLampada){
    this.statusDaLampada = statusDaLampada;
    }
    
    public String getTipoDaLampada(){
        return tipoDaLampada;
    }
    public String getCor(){
        return cor;
    }
    public String getMarca(){
        return marca;
    }
    public int getVoltagem(){
        return voltagem;
    }
    public int getPotencia(){
     return potencia;
    }
    public float getPreco(){
        return preco;
    }
    public boolean getStatusDaLampada(){
        return statusDaLampada;
    }
    public void ascender(){
        statusDaLampada = true;
    }
    public void apagar(){
        statusDaLampada = false;
    }
    public String toString(){
        return "Tipo da lampada: "+this.tipoDaLampada+"\nVoltagem: "+this.voltagem+
                "\nCor: "+this.cor+"\nMarca: "+this.marca+"\nPreco: "+this.preco+
                "\nPotencia: "+this.potencia+"\nStatus da lampada: "+this.statusDaLampada;        
    }
}
