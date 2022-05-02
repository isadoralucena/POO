package avaliacaoFinal;
import java.util.Scanner;
public class IsadoraArquivo6Questao2 extends IsadoraArquivo3Questao2{//IsadoraArquivo6Questao2 se refere à classe Fornecedor
    Scanner sc = new Scanner(System.in);
    int aux;
    private int cnpj;

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
    
    public void leituraDeDados(){
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        setNome(nome);
        
        System.out.println("Quer cadastrar CPF ou CNPJ? Bote 1 para CPF ou 2 para CNPJ");
        aux = sc.nextInt();
        while(aux!=1 && aux!=2){
            System.out.println("Quer cadastrar CPF ou CNPJ? Bote 1 para CPF ou 2 para CNPJ");
            aux = sc.nextInt();
        }
        
        if(aux == 1){
            System.out.print("CPF: ");
            int cpf = sc.nextInt();
            setCpf(cpf);
        }else{
            System.out.print("CNPJ: ");
            cnpj = sc.nextInt();
            setCnpj(cnpj);
        }
        
        sc.nextLine();
        
        System.out.print("Telefone: ");
        int telefone = sc.nextInt();
        setTelefone(telefone);
        
        System.out.print("RG: ");
        int rg = sc.nextInt();
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
        
        sc.nextLine();//Limpando o buffer 
    }
    public void exibicaoDeDados(){
        if(aux ==1){
           System.out.println("Cpf: "+getCpf()); 
        }else{
            System.out.println("CNPJ: "+getCnpj());
        }
        System.out.println("Rua: "+endereco1.getRua());
        System.out.println("Bairro: "+endereco1.getBairro());
        System.out.println("Cidade: "+endereco1.getCidade());
        System.out.println("Estado: "+endereco1.getEstado());
        System.out.println("CEP: "+endereco1.getCep());
         System.out.println("Nome: "+getNome());
        System.out.println("Telefone: "+getTelefone());
        System.out.println("RG: "+getRg());
    }
}
