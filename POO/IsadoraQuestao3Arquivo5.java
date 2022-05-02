/*Crie uma classe chamada Ingresso que possui um valor em reais e um método imprimeValor().
    a.  crie uma classe VIP, que herda Ingresso e possui um valor adicional. Crie um
método que retorne o valor do ingresso VIP (com o adicional incluído).
    b.  crie uma classe Normal, que herda Ingresso e possui um método que imprime:
"Ingresso Normal".
    c.  crie uma classe CamaroteInferior (que possui a localização do ingresso e métodos
para acessar e imprimir esta localização) e uma classe CamaroteSuperior, que é
mais cara (possui valor adicional). Esta última possui um método para retornar o
valor do ingresso. Ambas as classes herdam a classe VIP.*/
package POO;
public class IsadoraQuestao3Arquivo5 extends IsadoraQuestao3Arquivo2{//IsadoraQuestao3Arquivo4 se refere à classe CAMOROTESUPERIOR
    //A Classe CamaroteSuperior tem um valor adicional sobre o valorDoIngressoComAdicional(classe VIP)
     private double novoValorAdicional;
     public void setNovoValorAdicional(Double novoValorAdicional){//Método set para mudar
        this.novoValorAdicional = novoValorAdicional;
    }    
     public double getNovoValorAdicional(){//Método get para acessar
        return this.novoValorAdicional;
     }
     @Override
     public double valorDoIngressoComAdicional(){//Método para retornar o valor do ingresso
        System.out.println("Ingresso VIP camarote inferior");
        return super.valorDoIngressoComAdicional()+getNovoValorAdicional();//Sobreescrita (adicionando um valor adicional sobre o valorDoIngressoComAdicional referente à superclasse VIP)
    }
}
