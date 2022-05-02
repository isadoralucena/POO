package avaliacaoFinal;
import java.util.Scanner;
public abstract class IsadoraArquivo3Questao2 extends IsadoraArquivo1Questao2{//IsadoraArquivo3Questao2 se refere à classe Associados
    Scanner sc = new Scanner(System.in);
    private String nome;
    private int cpf;
    private int telefone;
    private int rg;
    IsadoraArquivo2Questao2 endereco1 = new IsadoraArquivo2Questao2();
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getCpf(){
        return this.cpf;
    }
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    public int getTelefone(){
        return this.telefone;
    }
    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
    public int getRg(){
        return this.rg;
    }
    public void setRg(int rg){
        this.rg = rg;
    }
    public void leituraDeDados(){
        System.out.print("Nome: ");
        nome = sc.nextLine();
        setNome(nome);
        
        System.out.print("CPF: ");
        cpf = sc.nextInt();
        setCpf(cpf);
        
        sc.nextLine();
        
        System.out.print("Telefone: ");
        telefone = sc.nextInt();
        setTelefone(telefone);
        
        System.out.print("RG: ");
        rg = sc.nextInt();
        setRg(rg);
        
        System.out.print("Numero: ");
        int numero = sc.nextInt();
        endereco1.setNumero(numero);
        
        System.out.print("Rua: ");
        String rua = sc.nextLine();
        endereco1.setRua(rua);
        
        sc.nextLine();
        
        System.out.print("Bairro: ");
        String bairro = sc.nextLine();
        endereco1.setBairro(bairro);
        
        System.out.print("Cidade: ");
        String cidade = sc.nextLine();
        endereco1.setCidade(cidade);
        
        System.out.print("Estado: ");
        String estado = sc.nextLine();
        endereco1.setEstado(estado);
        
        System.out.print("CEP: ");
        int cep = sc.nextInt();
        endereco1.setCep(cep);
        
        sc.nextLine();
    }
    public void exibicaoDeDados(){
        System.out.println("Rua: "+endereco1.getRua());
        System.out.println("Bairro: "+endereco1.getBairro());
        System.out.println("Cidade: "+endereco1.getCidade());
        System.out.println("Estado: "+endereco1.getEstado());
        System.out.println("CEP: "+endereco1.getCep());
        System.out.println("Nome: "+getNome());
        System.out.println("Cpf: "+getCpf());
        System.out.println("Telefone: "+getTelefone());
        System.out.println("RG: "+getRg());
    }
}
