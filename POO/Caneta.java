/*Implementar uma classe Caneta que deve possuir como características
marca, cor e tamanho. 
Nesta classe devem ser implementados os métodos construtores, getters, setters e toString. 
Em uma outra classe chamada CanetaTeste deverá ser criado um objeto do tipo Caneta, 
atribuir valores e exibir os dados deste objeto.
Aqui vocês devem pesquisar sobre toString. */
package POO;
public class Caneta {
    private String marca, cor, tamanho;
    public Caneta(String marca, String cor, String tamanho){
        this.marca = marca;
        this.cor = cor;
        this.tamanho = tamanho;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getTamanho(){
        return tamanho;
    }
    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }
    public String toString(){
        return "Marca: "+getMarca()+"\nCor: "+getCor()+"\nTamanho: "+getTamanho();
    }
}