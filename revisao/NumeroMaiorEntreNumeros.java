package revisao;
import java.util.Scanner;
public class NumeroMaiorEntreNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroUm;
        int numeroDois;
        int maior;
        
        System.out.print("Informe o numero um: ");
        numeroUm = sc.nextInt();
        maior = numeroUm;//maior recebe numeroUm
        
        System.out.print("Informe o numero dois: ");
        numeroDois = sc.nextInt();
        sc.close();

        if(numeroUm<numeroDois){
            maior = numeroDois;
            System.out.println("O maior numero entre "+numeroUm+" e "+numeroDois+" eh "+maior);
        }else if(numeroUm != numeroDois){
            System.out.println("O maior numero entre "+numeroUm+" e "+numeroDois+" eh "+maior);
        }else{
            
            System.out.println("Nao existe numero maior entre "+numeroUm+" e "+numeroDois+", porque eles são iguais");
        }
    }
}
