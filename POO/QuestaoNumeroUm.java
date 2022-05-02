/*Defina uma estrutura de dados para agrupar e representar os dados de um automóvel 
(marca do fabricante, modelo, ano de fabricação e quantidade máxima de passageiros).

LÓGICA UTILIZADA: foi a de fazer um registro para agrupar 
os diferentes tipos de variáveis relacionadas ao automóvel*/
package POO;
import java.util.Scanner;//Importação para fazer a leitura do teclado
public class QuestaoNumeroUm {//Assinatura da classe
    public static void main(String[] args) {//Método/função main
        //Não há registros/structs em Java, mas dá para simulá-los usando classes públicas
        Scanner sc = new Scanner(System.in);//Instanciando a classe Scanner
        DadosDoAutomovel automovelUm = new DadosDoAutomovel();//Instanciando a classe DadosDoAutomovel
        
        System.out.print("Informe a marca do automovel: ");//Fazendo uma pergunta para o usuário
        automovelUm.marcaDoFabricante = sc.nextLine();//Armazenando a resposta do usuáro na variável marcaDoFabricante que foi criada no registro DadosDoAutomovel 
        
        System.out.print("Informe o modelo do automovel: ");//Fazendo uma pergunta para o usuário
        automovelUm.modeloDoAutomovel = sc.nextLine();//Armazenando a resposta do usuáro na variável modeloDoAutomovel que foi criada no registro DadosDoAutomovel
        
        System.out.print("Informe o ano de fabricacao do automovel: ");//Fazendo uma pergunta para o usuário
        automovelUm.anoDeFabricacao = sc.nextInt();//Armazenando a resposta do usuáro na variável anoDeFabricacao que foi criada no registro DadosDoAutomovel
        
        System.out.print("Informe a quantidade maxima de passageiros: ");//Fazendo uma pergunta para o usuário
        automovelUm.quantidadeMaximaDePassageiros = sc.nextInt();//Armazenando a resposta do usuáro na variável quantidadeMaximaDePassageiros que foi criada no registro DadosDoAutomovel
        
        sc.close();

        //Imprimindo
        System.out.println("|------------------|");
        System.out.println("|Dados do automóvel|");
        System.out.println("|------------------|");
        System.out.println("Marca do Fabricante: "+automovelUm.marcaDoFabricante);//Concatenando
        System.out.println("Modelo do automovel: "+automovelUm.modeloDoAutomovel);//Concatenando
        System.out.println("Fabricacao do automovel: "+automovelUm.anoDeFabricacao);//Concatenando
        System.out.println("Quantidade maxima de passageiros: "+automovelUm.quantidadeMaximaDePassageiros);//Concatenando
    }
}
