/*/*Elabore um programa contendo uma função que receba três notas de um aluno como parâmetros e uma letra. 
Se a letra for A, a função deverá calcular a média aritmética das notas do aluno; 
se for P, deverá calcular a média ponderada, com pesos 5, 3 e 2. 
A média calculada deverá ser devolvida ao programa principal para ser mostrada.*/
package POO;
import java.util.Scanner;
public class FixacaoDeFuncoesDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float [] notasDoAluno = new float[3];
        for(int i=0; i<notasDoAluno.length;i++){
            System.out.print("Informe a nota "+(i+1)+" do aluno: ");
            notasDoAluno[i]=sc.nextFloat();
            while(notasDoAluno[i]<0){
                System.out.println("Obs.: não existe notas negativas");
                System.out.print("Informe a nota "+(i+1)+" do aluno: ");
                notasDoAluno[i]=sc.nextFloat();
            }
        }
        System.out.println("Voce deseja calcular a media aritmetica ou a media ponderada dessas notas?");
        System.out.println("Digite 'A' para media aritmetica e 'P' para media ponderada");       
        String opcao = sc.next();
        while(!(opcao.equalsIgnoreCase("A") == true) && !(opcao.equalsIgnoreCase("P") == true)){//Tabela verdade (a repetição só roda se a condição for verdadeira)
            System.out.println("Digite 'A' para media aritmetica e 'P' para media ponderada");       
            opcao = sc.next();
        }
        if(opcao.equalsIgnoreCase("A") == true){
            System.out.println("A media aritmetica das notas do aluno é: "+mediaAritmeticaDasNotas(notasDoAluno));
        }else{
            System.out.println("A media ponderada das notas do aluno é: "+mediaPonderadaDasNotas(notasDoAluno));
        } 
        sc.close();
    }
    public static float mediaAritmeticaDasNotas(float notasDoAluno[]){
        float resultado=0;//Inicializando a variável resultado para que ela possa ser usada dentro do loop for
        for(int i=0;i<notasDoAluno.length;i++){
            resultado += notasDoAluno[i];
        }
        resultado = resultado/3;
        return resultado;
    }
    public static float mediaPonderadaDasNotas(float notasDoAluno[]){
        float resultado = ((notasDoAluno[0]*5)+(notasDoAluno[1]*3)+(notasDoAluno[2]*2))/(5+3+2);
        return resultado;
    }
}
