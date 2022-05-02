package provaRecuperacao;
import java.util.InputMismatchException;
import java.util.Scanner;//Importação da classe Scanner
public class DivisaoComExcecao {
    public static void main(String[] args) {//Criando o método main
        Scanner sc = new Scanner(System.in);//Instanciando a classe Scanner para leitura do teclado
        boolean auxiliar = true;
        int divisor = 0;//inicializando
        int dividendo = 0;//inicializando
        double quociente = 0;//inicializando
        do{//Laço de repetição
            try{//bloco em que se espera o erro
                System.out.println("Informe o divisor: ");
                divisor = sc.nextInt();
                System.out.println("Informe o dividendo: ");
                dividendo = sc.nextInt();
                
                quociente = (double) divisor/dividendo;
                auxiliar = false;
            }catch (InputMismatchException excecao1) {//tratando erro
                sc.nextLine();//descartando (limpando o buffers) a entrada errada do usuário
                System.err.println("Não é permitido inserir letras nem números racionais(com vírgula), informe apenas números inteiros");
                excecao1.printStackTrace();
                System.out.println(excecao1.getMessage());//Na exceção1 a mensagem é null
            }catch(ArithmeticException excecao2){//tratando erro
                System.err.println("O número do divisor deve ser diferente de 0");
                excecao2.printStackTrace();
                System.out.println(excecao2.getMessage());//Na excecao2 é "/ by zero"
            }
        }while(auxiliar);
        System.out.println("Resultado da divisão entre "+divisor+" e "+dividendo+" = "+quociente);
        sc.close();
    }    
}
