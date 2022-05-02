package POO;
public class PessoaJuridica extends Cliente{
    private String razaoSocial;
    private String nomeFantasia;
    private String sigla;
    private int cnpj;

    public String getRazaoSocial(){
        return this.razaoSocial;
    }
    public String getNomeFantasia(){
        return this.nomeFantasia;
    }
    public String getSigla(){
        return this.sigla;
    }
    public int getCnpj(){
        return this.cnpj;
    }
    public void setRazaoSocial(String razaoSocial){
        this.razaoSocial = razaoSocial;
    }
    public void setNomeFantasia(String nomeFantasia){
        this.nomeFantasia = nomeFantasia;
    }
    public void setSigla(String sigla){
        this.sigla = sigla;
    }
    public void setCnpj(int cnpj){
        this.cnpj = cnpj;
    }
}