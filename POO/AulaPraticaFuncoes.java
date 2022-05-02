/*Escreva um programa que recebe a nota de um aluno e a classifique
como A, B, C, D ou E. Nesse programa, você deve aplicar o conceito de
função. A função que recebe a nota de um aluno como um double e a classifique
e retorne um char de acordo com as seguintes regras
A. Maior ou igual a 9
B. Maior ou igual a 8 e menor que 9
C. Maior ou igual a 7 e menor que 8
D. Maior ou igual a 6 e menor que 7
E. Menor que 6*/
package POO;
import java.util.Scanner;
public class AulaPraticaFuncoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a nota de um aluno: ");
        double nota = sc.nextDouble();
        while((nota<0) || (nota>10)){//Tabela verdade
            System.out.println("A nota precisa estar entre 0 e 10");
            System.out.println("Informe a nota do aluno de novo:");
            nota = sc.nextDouble();
        }
        sc.close();
        System.out.println("A nota "+nota+" foi classificada como "+classificaoDaNota(nota));
        
    }
    public static char classificaoDaNota(double nota){
        char classificacao;
        if(nota>=9){
            classificacao = 'A';
        }else if(nota>=8 && nota<9){
            classificacao = 'B';
        }else if(nota>=7 && nota<8){
            classificacao = 'C';
        }else if(nota>=6 && nota<7){
            classificacao = 'D';
        }else{
            classificacao = 'E';
        }
        return classificacao;
    }
}
