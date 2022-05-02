package POO;
public class IsadoraQuestao2Arquivo5 extends IsadoraQuestao2Arquivo4{//IsadoraQuestao2Arquivo5 se refere à classe RICA
    private double dinheiro;
    public void setDinheiro(Double dinheiro){//Método set para mudar
        this.dinheiro = dinheiro;
    }    
    public double getDinheiro(){//Método get para acessar
        return this.dinheiro;
    }
    public void fazCompras(){
        System.out.println(getNome()+" tem "+getDinheiro()+" reais para fazer compras");
    }
}
