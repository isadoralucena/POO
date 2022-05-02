package projetoFinalPOO;
public class Sala {
    private String nomeDaSala;
    private int ocupacaoMaxima;
    private boolean arCondicionado;
    private boolean televisao;
    private boolean projetor;
    public void setNomeDaSala(String nomeDaSala){//Método set para mudar
        this.nomeDaSala = nomeDaSala;
    }    
    public String getNomeDaSala(){//Método get para acessar
        return this.nomeDaSala;
    }
    public void setOcupacaoMaxima(int ocupacaoMaxima){//Método set para mudar
        this.ocupacaoMaxima = ocupacaoMaxima;
    }    
    public int getOcupacaoMaxima(){//Método get para acessar
        return this.ocupacaoMaxima;
    }
    public void setArCondicionado(boolean arCondicionado){//Método set para mudar
        this.arCondicionado = arCondicionado;
    }    
    public boolean getArCondicionado(){//Método get para acessar
        return this.arCondicionado;
    }
    public void setTelevisao(boolean televisao){//Método set para mudar
        this.televisao = televisao;
    }    
     public boolean getTelevisao(){//Método get para acessar
        return this.televisao;
     }
     public void setProjetor(boolean projetor){//Método set para mudar
        this.projetor = projetor;
    }    
     public boolean getProjetor(){//Método get para acessar
        return this.projetor;
     }     
}
