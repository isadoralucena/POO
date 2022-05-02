/*Suponha que criamos um registro para armazenar produtos de um supermercado:
Produto{
char nome[80];
double preco;
int quantidade;};

Implemente duas funções, uma que devolve o vetor ordenado por preços 
e outra que devolve o vetor ordenado pela quantidade de itens no estoque. 
Funções void ordenaPreco(struct Produto vet[], int n) e void ordenaQuant(struct Produto vet[], int n)*/
package POO;
import java.util.Scanner;//Importação para fazer a leitura do teclado
public class IsadoraQuestaoUm {//Assinatura da classe
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Instanciando a classe Scanner
        System.out.print("Quantos produtos quer cadastrar? ");
        int numeroDeProdutos = sc.nextInt();//Leitura
        
        Produto [] produtos = new Produto[numeroDeProdutos];//Instanciando a classe Produtos como um vetor de objeto, chamado de produtos
                
        for(int i=0;i<numeroDeProdutos;i++){//Estrutura de repetição para ler o vetor de objeto
            produtos[i]=new Produto();//Referenciando as posições do vetor ao registro Produto
            System.out.print("Nome " +(i+1)+": ");//Lendo o nome dos produtos
            produtos[i].nome = sc.next();
            System.out.print("Preco " +(i+1)+": R$");//Lendo o preço dos produtos
            produtos[i].preco = sc.nextDouble();
            System.out.print("Quantidade " +(i+1)+": ");//Lendo as quantidades dos produtos
            produtos[i].quantidade = sc.nextInt();
            sc.nextLine();//Esvaziando o buffer (na leitura consecutiva de valores numéricos e String deve-se esvaziar o buffer do teclado)
        }
        ordenaPreco(produtos, numeroDeProdutos);//Chamando a função/método ordenaPreco
        ordenaQuantidade(produtos, numeroDeProdutos);//Chamando a função/método ordenaQuantidade
        sc.close();
    }
    public static void ordenaPreco(Produto [] produtos, int numeroDeProdutos){//Função/método para ordenar os precos dos produtos
  
        for (int i=0;i<numeroDeProdutos;i++){//Ordenando com for aninhado
            for (int j=0;j<numeroDeProdutos;j++){
                if(produtos[i].preco<produtos[j].preco){
                    double aux = produtos[i].preco;
                    produtos[i].preco = produtos[j].preco;
                    produtos[j].preco = aux;
                }
            }
        }
        
        System.out.println("Precos dos produtos ordenados: ");
        for(int k=0;k<numeroDeProdutos;k++){//Estrutura de repeticao para imprimir os precos ordenados 
            System.out.println("Preco : "+produtos[k].preco);
        }
    }
    public static void ordenaQuantidade(Produto [] produtos, int numeroDeProdutos){//Função/método para ordenar as quantidades dos produtos
        
        for (int i=0;i<numeroDeProdutos;i++){//Ordenando com for aninhado
            for (int j=0;j<numeroDeProdutos;j++){
                if(produtos[i].quantidade<produtos[j].quantidade){
                    int aux = produtos[i].quantidade;
                    produtos[i].quantidade = produtos[j].quantidade;
                    produtos[j].quantidade = aux;
                }
            }
        }
        
        System.out.println("Quantidades ordenadas dos produtos: ");
        for(int k=0;k<numeroDeProdutos;k++){//Estrutura de repeticao para imprimir as quantidades ordenadas 
            System.out.println("Quantidade : "+produtos[k].quantidade);
        }
    }
}
