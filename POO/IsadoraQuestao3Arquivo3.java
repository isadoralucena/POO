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
public class IsadoraQuestao3Arquivo3 extends IsadoraQuestao3Arquivo1{//IsadoraQuestao3Arquivo3 se refere à classe NORMAL
    public void imprimeIngressoNormal(){//Método que imprime "Ingresso normal"
        System.out.println("Ingresso normal");
    }
}
