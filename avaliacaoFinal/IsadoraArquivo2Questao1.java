/*Implemente uma classe chamada IsadoraArquivo1Questao1, que deva conter pelo menos cinco atributos 
e pelo menos dois métodos que não seja get e set. 
Explique com suas palavras, nos comentários, 
a importância de utilizarmos os métodos get e set 
e qual o princípio do POO utilizado nesta questão.*/
package avaliacaoFinal;
import java.text.SimpleDateFormat;//Importação para converter informações do tipo String para data do tipo Date, permitindo seguir um formato
import java.util.Scanner;//Importação para fazer a leitura do teclado
import java.text.ParseException;
public class IsadoraArquivo2Questao1 {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);//Instanciando a classe Scanner
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");//Instanciando a classe SimpleDateFormat
        IsadoraArquivo1Questao1 pessoa1 = new IsadoraArquivo1Questao1();//Instanciando a classe JogadorDeFutebol
        
        System.out.print("Nome da pessoa: ");
        String nome = sc.nextLine();
        pessoa1.setNome(nome);
        
        System.out.print("Nacionalidade da pessoa: ");
        String nacionalidade = sc.nextLine();
        pessoa1.setNacionalidade(nacionalidade);
        
        System.out.print("Genero da pessoa: ");
        String genero = sc.nextLine();
        pessoa1.setGenero(genero);
      
        
        System.out.print("Altura da pessoa: ");
        float altura = sc.nextFloat();
        pessoa1.setAltura(altura);
        
        sc.nextLine();//Limpando o buffer (leitura consecutiva de strings e valores numéricos)
        
        System.out.print("Data de nascimento no formato dd/MM/yyyy: ");
        String auxiliar = sc.nextLine();
        pessoa1.setDataDeNascimento(formato.parse(auxiliar));//Transformando a string auxiliar no tipo Date, e passando seu valor para a variável privada dataDeNascimento
        sc.close();
        pessoa1.imprimirDados();//Chamando a função
        pessoa1.lonjuraParaSeAposentar();
    }   
}
