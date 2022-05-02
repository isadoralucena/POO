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
public class IsadoraQuestao3Arquivo2 extends IsadoraQuestao3Arquivo1{//IsadoraQuestao3Arquivo2 se refere à classe VIP
    private double valorAdicional;
    public void setValorAdicional(Double valorAdicional){//Método set para mudar
        this.valorAdicional = valorAdicional;
    }    
    public double getValorAdicional(){//Método get para acessar
        return this.valorAdicional;
    }
    public double valorDoIngressoComAdicional(){//Método que retorna o valor do ingresso VIP (com o adicional incluído)
        return getValorEmReaisIngresso()+ getValorAdicional();
    }
}
