/*Crie a classe Imovel, que possui um endereço e um preço.
    a.  crie uma classe Novo, que herda Imovel e possui um adicional no preço. Crie
métodos de acesso e impressão deste valor adicional.
    b.  crie uma classe Velho, que herda Imovel e possui um desconto no preço. Crie
métodos de acesso e impressão para este desconto.*/
package POO;
public class IsadoraQuestao4Arquivo1 {//IsadoraQuestao4Arquivo1 se refere à classe IMOVEL
    private String endereco;
    private double preco;
    public String getEndereco(){//Método get para acessar
        return this.endereco;
    }
    public void setEndereco(String endereco){//Método set para mudar
        this.endereco = endereco;
    }
    public double getPreco(){//Método get para acessar
        return this.preco;
    }
    public void setPreco(double preco){//Método set para mudar
        this.preco = preco;
    }
    public void imprime(){//Método para imprimir
        System.out.println("Endereco do imovel: "+getEndereco());
        System.out.println("Preco do imovel: R$"+getPreco());
    }
}
