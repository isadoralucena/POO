/*Escreva uma função que recebe, por parâmetro, dois valores X e Z e calcula e retorna Xz . 
(sem utilizar funções ou operadores de potência prontos)*/
package POO;
import java.util.Scanner;
public class PotenciacaoExercicioFuncao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("EU NAO ACEITO VALORES NEGATIVOS! ATENCAO!");
        System.out.print("Digite o valor da base: ");
        int base = sc.nextInt();
        System.out.print("Digite o valor do expoente: ");
        int expoente = sc.nextInt();
        System.out.println("A base "+base+" no expoente "+expoente+" eh: "+calculoPotenciacao(base, expoente));
        sc.close();
    }
    public static int calculoPotenciacao(int base, int expoente){
        int resultado=1;
        for(int i=0; i<expoente;i++){
            resultado *= base;
        }
        return resultado;
    }
}

