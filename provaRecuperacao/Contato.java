package provaRecuperacao;
public class Contato {//Criando classe
    private String apelido;
    private String email;
    private String nome;
    private String sobrenome;
    private int tituloEleitoral;
    
    //Construtor inicializando as variáveis
    public Contato(String apelido, String email, String nome, String sobrenome, int tituloEleitoral) {
        this.apelido = apelido;
        this.email = email;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tituloEleitoral = tituloEleitoral;
    }

    public int getTituloEleitoral() {//Método get para acessar
        return tituloEleitoral;
    }

    public void setTituloEleitoral(int tituloEleitoral) {//Método set para mudar
        this.tituloEleitoral = tituloEleitoral;
    }
    
    public String getNome() {//Método get para acessar
        return nome;
    }

    public void setNome(String nome) {//Método set para mudar
        this.nome = nome;
    }

    public String getSobrenome() {//Método get para acessar
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {//Método set para mudar
        this.sobrenome = sobrenome;
    }

    public String getApelido() {//Método get para acessar
        return apelido;
    }

    public void setApelido(String apelido) {//Método set para mudar
        this.apelido = apelido;
    }

    public String getEmail() {//Método get para acessar
        return email;
    }

    public void setEmail(String email) {//Método set para mudar
        this.email = email;
    }
}
