package POO;
public class IsadoraQuestao2Arquivo1 {//IsadoraQuestao2Arquivo1 se refere à classe ANIMAL
    private String nome;
    private String raca;
    public void setNome(String nome){//Método set para mudar
        this.nome = nome;
    }    
    public String getNome(){//Método get para acessar
        return this.nome;
    }
    public void setRaca(String raca){//Método set para mudar
        this.raca = raca;
    }    
    public String getRaca(){//Método get para acessar
        return this.raca;
    }
    public IsadoraQuestao2Arquivo1(){//Construtor padrão da classe
    }
    public IsadoraQuestao2Arquivo1(String nome){//Construtor específico, será util ao instanciar um animal já com o nome definido
        this.nome = nome;
    }
    public String caminha(){
        return getNome()+ " caminhou";
    }
}
