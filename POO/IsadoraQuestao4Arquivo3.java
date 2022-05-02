/*Crie a classe Imovel, que possui um endereço e um preço.
    a.  crie uma classe Novo, que herda Imovel e possui um adicional no preço. Crie
métodos de acesso e impressão deste valor adicional.
    b.  crie uma classe Velho, que herda Imovel e possui um desconto no preço. Crie
métodos de acesso e impressão para este desconto.*/
package POO;
public class IsadoraQuestao4Arquivo3 extends IsadoraQuestao4Arquivo1{//IsadoraQuestao4Arquivo3 se refere à classe VELHO
    private double descontoPrecoReais;
    public double getDescontoPrecoReais(){//Método get para acessar
        return this.descontoPrecoReais;
    }
    public void setDescontoPrecoReais(double descontoPrecoReais){//Método set para mudar
        this.descontoPrecoReais = descontoPrecoReais;
    }
    @Override
    public double getPreco(){//Sobrescrita
        return (super.getPreco() - getDescontoPrecoReais());//Mudando o comportamento do método (adicionando o descontoPrecoReais)
    }   
}
