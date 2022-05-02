/*Escreva um programa que armazene os dados relacionados a um filme (nome, autor, ano, preço) 
em uma estrutura de dados do tipo registro. 
Crie uma função para ler os dados desse tipo de registro. 
Crie uma função main para imprimir os dados de 3 diferentes filmes.

LÓGICA UTILIZADA: foi criar um registro para armazenar os diferentes tipos de dados relacionados a um filme e 
criar uma função específica para ler esses dados, e outra para imprimí-los.*/
package POO;
import java.util.Scanner;//Importação para fazer a leitura do teclado
public class QuestaoNumeroDois {//Assinatura da classe
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Instanciando a classe Scanner
        
        System.out.print("Voce deseja catalogar quantos filmes? ");
        int numeroDeFilmes = sc.nextInt();
        while(numeroDeFilmes <=0){//Estrutura de repetição para só aceitar a catalogação de 1 ou mais filmes
            System.out.println("Voce deseja catalogar quantos filmes? Obs.: só é possível catalogar 1 ou mais filmes");
            numeroDeFilmes = sc.nextInt();
        }
        
        
        DadosDoFilme [] filme = new DadosDoFilme[numeroDeFilmes];//Instanciando a classe DadosDoFilme como um vetor de objeto, chamado de filme
        
        //Um array de tipos primitivos guarda valores, um array de objetos guarda referências
        /*filme[0] = new DadosDoFilme();//Referenciando as posições do vetor ao registro DadosDoFilme 
        filme[1] = new DadosDoFilme();
        filme[2] = new DadosDoFilme();*/
        
        leitura(filme, numeroDeFilmes);//Chamando a função/método leitura
        exibicao(filme, numeroDeFilmes);//Chamando a função/método exibicao
        
        /*for(int i=0;i<filme.length;i++){
            filme[i]=new DadosDoFilme();//Referenciando as posições do vetor ao registro DadosDoFilme
            //filme[i].nomeDoFilme = sc.nextLine();
            //filme[i].autorDoFilme = sc.nextLine();
            //filme[i].anoDoFilme = sc.nextInt();
            //filme[i].precoDoFilme = sc.nextFloat();
            //sc.nextLine();//Esvaziando o buffer (na leitura consecutiva de valores numéricos e String deve-se esvaziar o buffer do teclado)
        for(int j=0;j<filme.length;j++){
            System.out.println("|-------|");
            System.out.println("|Filme "+j);
            System.out.println("|-------|");
            System.out.println("Nome do filme: "+filme[j].nomeDoFilme);
            System.out.println("Autor do filme: "+filme[j].autorDoFilme);
            System.out.println("Ano do filme: "+filme[j].anoDoFilme);
            System.out.println("Preco do filme: R$"+filme[j].precoDoFilme);
        }*/
        sc.close();
    } 
    public static void leitura(DadosDoFilme[]filme, int numeroDeFilmes){//Função/método para ler o vetor de objeto criado
        Scanner sc = new Scanner(System.in);//Instanciando a classe Scanner
        
        if(numeroDeFilmes==1){//Estrutura de condição
          System.out.println("Para catatolgar "+numeroDeFilmes+" filme informe");  
        }else{
            System.out.println("Para catatolgar "+numeroDeFilmes+" filmes informe");
        }
        
        for(int i=0;i<numeroDeFilmes;i++){//Função/método para exibir o vetor de objeto criado      
            filme[i]=new DadosDoFilme();//Referenciando as posições do vetor ao registro DadosDoFilme
            System.out.print("Filme " +(i+1)+", nome: ");
            filme[i].nomeDoFilme = sc.nextLine();
            System.out.print("Filme " +(i+1)+", autor: ");
            filme[i].autorDoFilme = sc.nextLine();
            System.out.print("Filme " +(i+1)+", ano: ");
            filme[i].anoDoFilme = sc.nextInt();
            System.out.print("Filme " +(i+1)+", preço: R$");
            filme[i].precoDoFilme = sc.nextFloat();
            sc.nextLine();//Esvaziando o buffer (na leitura consecutiva de valores numéricos e String deve-se esvaziar o buffer do teclado)
            sc.close();
        }
    }
    public static void exibicao(DadosDoFilme[]filme, int numeroDeFilmes){//
        for(int j=0;j<numeroDeFilmes;j++){//Loop para exibir a catalogação dos filmes
            System.out.println("|-------|");
            System.out.println("|Filme "+(j+1));
            System.out.println("|-------|");
            System.out.println("Nome do filme: "+filme[j].nomeDoFilme);
            System.out.println("Autor do filme: "+filme[j].autorDoFilme);
            System.out.println("Ano do filme: "+filme[j].anoDoFilme);
            System.out.println("Preco do filme: R$"+filme[j].precoDoFilme);
        } 
    }
}
    
