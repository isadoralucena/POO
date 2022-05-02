/*Faça uma função que leia um número não determinado de valores positivos 
e retorne a média aritmética dos mesmos

LÓGICA UTILIZADA: foi criar uma função para ler a quantidade de números positivos que o leitor desejar
e calcular a média desses números; obviamente, criando condições para a aceitação de apenas valores positivos
e determinação de pelo menos dois valores para o cálculo aritmético*/
package POO;
import java.util.Scanner;//Importação para fazer a leitura do teclado
public class QuestaoNumeroTres {//Assinatura da classe
    public static void main(String[] args) {
        System.out.println("Media Aritmetica = "+leituraEMediaAritmetica());//Chamando a função leituraEMediaAritmetica e exibindo o que ela retorna          
    }
    public static float leituraEMediaAritmetica(){//Função/método que retorna um valor float e serve para ler e calcular a media aritmetica de valores positivos
        Scanner sc = new Scanner(System.in);//Instanciando a classe Scanner
        float resultado = 0;//Inicializando a variável resultado para que ela possa ser usada dentro do loop for
        
        System.out.print("Deseja realizar a media aritmetica de quantos numeros? ");
        int tamanhoDaMedia = sc.nextInt();
        
        while(tamanhoDaMedia <=1){//Estrutura de repetição para só aceitar a média aritmetica de dois números ou mais
            System.out.println("Deseja realizar a media aritmetica de quantos numeros? Obs.: Informe um numero maior que 1");
            tamanhoDaMedia = sc.nextInt();
        }
        
        float [] vetorDosNumerosDaMedia = new float[tamanhoDaMedia];//Criando um vetor 
        System.out.println("Informe valores positivos para o calculo da media aritmetica de "+tamanhoDaMedia+" numeros");
        
        for(int i=0; i<tamanhoDaMedia;i++){//Loop para ler os valores da média
            System.out.print("Valor["+(i+1)+"] = ");
            vetorDosNumerosDaMedia[i] = sc.nextFloat();
            
            while(vetorDosNumerosDaMedia[i]<=0){//Estrutura de repetição para só aceitar valores positivos 
                System.out.println("Os valores para o calculo da media aritmetica precisam ser POSITIVOS. Obs.: como zero não é positivo, ele não está incluso");
                System.out.print("Valor["+(i+1)+"] = ");
                vetorDosNumerosDaMedia[i] = sc.nextFloat();
            }
        }
        sc.close();
        for(int j=0; j<tamanhoDaMedia;j++){//Loop para somar os valores positivos do vetorDosNumerosDaMedia
            resultado += vetorDosNumerosDaMedia[j];
        }
        
        resultado = resultado/tamanhoDaMedia;
        return resultado;//Retornando a média aritmetica
    }
}
