package POO;
public class PessoaFisica extends Cliente{
   private String nome;
   private String sobrenome;
   private String cpf; 
   public String getNome(){
        return this.nome;
    }
    public String getSobrenome(){
        return this.sobrenome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
}

