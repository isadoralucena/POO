/*Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. 
Cada objeto dessa classe deve guardar os seguintes 
dados do aluno: matrícula, nome, 2 notas de prova e 1 nota de trabalho. 
Escreva os seguintes métodos para esta classe:
media calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
final calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final)*/
package POO;
//import java.util.Scanner;
public class AlunosMain {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        
        Alunos aluno1 = new Alunos();
        
        aluno1.nota1=10;
        aluno1.nota2=7;
        aluno1.notaDoTrabalho=9;
        
        System.out.println("O aluno precisa de "+aluno1.finalDoAluno());
    }
}

    