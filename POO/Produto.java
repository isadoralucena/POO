/*Suponha que criamos um registro para armazenar produtos de um supermercado:
Produto{
char nome[80];
double preco;
int quantidade;
};

Implemente duas funções, uma que devolve o vetor ordenado por preços 
e outra que devolve o vetor ordenado pela quantidade de itens no estoque. 
Funções void ordenaPreco(struct Produto vet[], int n) e void ordenaQuant(struct Produto vet[], int n).*/
package POO;
public class Produto{//Criacao do registro produto
    double preco;
    String nome;
    int quantidade;
}