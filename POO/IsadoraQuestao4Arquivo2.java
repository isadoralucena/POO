/*Crie a classe Imovel, que possui um endereço e um preço.
    a.  crie uma classe Novo, que herda Imovel e possui um adicional no preço. Crie
métodos de acesso e impressão deste valor adicional.
    b.  crie uma classe Velho, que herda Imovel e possui um desconto no preço. Crie
métodos de acesso e impressão para este desconto.*/
package POO;
public class IsadoraQuestao4Arquivo2 extends IsadoraQuestao4Arquivo1{//IsadoraQuestao4Arquivo2 se refere à classe NOVO
    private double adicionalPrecoReais;
    public double getAdicionalPrecoReais(){//Método get para acessar
        return this.adicionalPrecoReais;
    }
    public void setAdicionalPrecoReais(double adicionalPrecoReais){//Método set para mudar
        this.adicionalPrecoReais = adicionalPrecoReais;
    }
    @Override
    public double getPreco(){//Sobrescrita
        return (super.getPreco() + getAdicionalPrecoReais());//Mudando o comportamento do método (adicionando o adicionalPrecoReais)
    }   
}
