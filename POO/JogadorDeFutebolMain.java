/*Crie uma classe para representar um jogador de futebol, 
com os atributos nome, posição, data de nascimento, nacionalidade, altura e peso. 
Crie os métodos públicos necessários para sets e gets 
e também um método para imprimir todos os dados do jogador. 
Crie um método para calcular a idade do jogador 
e outro método para mostrar quanto tempo falta para o jogador se aposentar. 
Para isso, considere que os jogadores da posição de defesa se aposentam em média aos 40 anos, 
os jogadores de meio-campo aos 38 
e os atacantes aos 35. */
package POO;
import java.text.SimpleDateFormat;//Importação para converter informações do tipo String para data do tipo Date, permitindo seguir um formato
import java.util.Scanner;//Importação para fazer a leitura do teclado
import java.text.ParseException;
public class JogadorDeFutebolMain {//Assinatura da classe
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);//Instanciando a classe Scanner
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");//Instanciando a classe SimpleDateFormat
        JogadorDeFutebol jogador1 = new JogadorDeFutebol();//Instanciando a classe JogadorDeFutebol
        
        System.out.print("Nome do jogador: ");
        String nome = sc.nextLine();
        jogador1.setNome(nome);
        
        System.out.print("Posicao do jogador (defesa, atacante ou meio-campo): ");
        String posicao = sc.nextLine();
        jogador1.setPosicao(posicao);
        
        System.out.print("Nacionalidade do jogador: ");
        String nacionalidade = sc.nextLine();
        jogador1.setNacionalidade(nacionalidade);
        
        System.out.print("Peso do jogador: ");
        float peso = sc.nextFloat();
        jogador1.setPeso(peso);
        
        System.out.print("Altura do jogador: ");
        float altura = sc.nextFloat();
        jogador1.setAltura(altura);
        
        sc.nextLine();//Limpando o buffer (leitura consecutiva de strings e valores numéricos)
        
        System.out.print("Data de nascimento no formato dd/MM/yyyy: ");
        String auxiliar = sc.nextLine();
        jogador1.setDataDeNascimento(formato.parse(auxiliar));//Transformando a string auxiliar no tipo Date, e passando seu valor para a variável privada dataDeNascimento
        
        jogador1.imprimirDados();//Chamando a função
        sc.close();
    }   
}
