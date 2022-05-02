package POO;
import java.util.Scanner;//Importação para fazer a leitura do teclado
public class LeituraEndereco {//Assinatura da classe
    public static void main(String[] args) {//Método main
        Scanner sc = new Scanner(System.in);
        Endereco endUm = new Endereco();
        
        System.out.print("Digite onde vc mora (rua): ");//Mensagem para interagir com o usuário
        endUm.rua = sc.nextLine();//Armazenamento da variável rua que foi criada no registro Endereco
        
        System.out.print("Digite onde vc mora (numero): ");//Mensagem para interagir com o usuário
        endUm.numero = sc.nextInt();//Armazenamento
        
        System.out.print("Digite onde vc mora (bairro): ");//Mensagem para interagir com o usuário
        endUm.bairro = sc.nextLine();//Armazenamento
        
        System.out.print("Digite onde vc mora (cidade): ");//Mensagem para interagir com o usuário
        endUm.cidade = sc.nextLine();//Armazenamento
        
        System.out.print("Digite onde vc mora (CEP): ");//Mensagem para interagir com o usuário
        endUm.cep = sc.nextLine();//Armazenamento
        
        System.out.println("|--------|");
        System.out.println("|Endereco|");
        System.out.println("|--------|");
        System.out.println("Rua: "+endUm.rua);//Mensagem para exibir
        System.out.println("Numero: "+endUm.numero);//Mensagem para exibir
        System.out.println("Bairro: "+endUm.bairro);//Mensagem para exibir
        System.out.println("Cidade: "+endUm.cidade);//Mensagem para exibir
        System.out.println("CEP: "+endUm.cep);//Mensagem para exibir   
        sc.close();
    }
}
