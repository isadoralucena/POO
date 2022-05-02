/*Crie uma classe chamada Ingresso que possui um valor em reais e um método imprimeValor().
    a.  crie uma classe VIP, que herda Ingresso e possui um valor adicional. Crie um
método que retorne o valor do ingresso VIP (com o adicional incluído).
    b.  crie uma classe Normal, que herda Ingresso e possui um método que imprime:
"Ingresso normal".
    c.  crie uma classe CamaroteInferior (que possui a localização do ingresso e métodos
para acessar e imprimir esta localização) e uma classe CamaroteSuperior, que é
mais cara (possui valor adicional). Esta última possui um método para retornar o
valor do ingresso. Ambas as classes herdam a classe VIP.*/
package POO;
public class IsadoraQuestao3Arquivo1 {//IsadoraQuestao3Arquivo1 se refere à classe Ingresso
    private double valorEmReaisIngresso;
    public void setValorEmReaisIngresso(Double valorEmReaisIngresso){//Método set para mudar
        this.valorEmReaisIngresso = valorEmReaisIngresso;
    }    
    public double getValorEmReaisIngresso(){//Método get para acessar
        return this.valorEmReaisIngresso;
    }
    public void imprimeValor(){//Método para imprimir
        System.out.println("O valor do ingresso eh: "+getValorEmReaisIngresso());
    }
}
