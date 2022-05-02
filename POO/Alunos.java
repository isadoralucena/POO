/*Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. 
Cada objeto dessa classe deve guardar os seguintes 
dados do aluno: matrícula, nome, 2 notas de prova e 1 nota de trabalho. 
Escreva os seguintes métodos para esta classe:
media calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
final calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final)*/
package POO;
public class Alunos {
    int matricula;//Variável global
    String nome;//Variável global
    float nota1;//Variável global
    float nota2;//Variável global
    float notaDoTrabalho;//Variável global

//Método da classe Alunos
float mediaDoAluno (){//Não precisa de parâmetros
    float media = (float) (((nota1*2.5) + (nota2*2.5) + (notaDoTrabalho*2))/7);
    return media;
}
//Método da classe Alunos
float finalDoAluno (){
    float media = mediaDoAluno();
    if(media<7){
        float quantoPrecisa = 7 - media;
        return quantoPrecisa;
    }else{
        return 0;
    }
}
}
