/*Faça um programa que leia um número positivo e maior que zero, calcule e mostre (usando uma função para cada item).
a) O número digitado ao quadrado
b) O número digitado ao cubo
c) A raiz quadrada do número digitado
d) A raiz cúbica do número digitado*/
package POO;
import java.util.Scanner;
public class FixacaoDeFuncoesUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número positivo e maior que zero: ");
        double numeroInformado = sc.nextDouble();
        while(numeroInformado<=0){
            System.out.print("Informe um NÚMERO POSITIVO e MAIOR QUE ZERO: ");
            numeroInformado = sc.nextDouble();
        }
        sc.close();
        System.out.println("Numero: "+numeroInformado);
        System.out.println("Numero ao quadrado: "+numeroAoQuadrado(numeroInformado));
        System.out.println("Numero ao cubo: "+numeroAoCubo(numeroInformado));
        System.out.println("Raiz quadrada do numero: "+raizQuadradaNumero(numeroInformado));
        System.out.println("Raiz cubica do numero: "+raizCubicaNumero(numeroInformado));
    }
    public static double numeroAoQuadrado (double numero){
        return Math.pow(numero,2);
    }
    public static double numeroAoCubo (double numero){
        return Math.pow(numero,3);
    }
    public static double raizQuadradaNumero (double numero){
        return Math.sqrt(numero);
    }
    public static double raizCubicaNumero (double numero){
        return Math.cbrt(numero);
    }   
}