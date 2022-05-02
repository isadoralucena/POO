/*Crie uma classe para representar uma pessoa, 
com os atributos privados de nome, data de nascimento e altura. 
Crie os métodos públicos necessários para sets e gets 
e também um método para imprimir todos dados de uma pessoa. 
Crie um método para calcular a idade da pessoa*/
package POO;
public class Pessoa {
    //os atributos não podem ser acessados de fora da classe por meio da palavra-chave private
    //private é um modificador de acesso (também chamado de modificador de visibilidade).
    //marcando um atributo como privado, fechamos o seu acesso em relação a todas as outras classes
    /*Um atributo público pode ser modificado a partir de qualquer ponto do programa 
        e a classe não tem nenhum controle sobre as alterações em seu conteúdo, portanto não pode garantir sua validade*/
    private String nome;
    private float altura;
    //private também pode ser usado a fim de modificar o acesso a um método
    //O modificador private faz com que ninguém consiga modificar e tampouco ler o atributo em questão.
    //Da mesma maneira que temos o private , temos o modificador public, que permite a todos acessarem um determinado atributo ou método
    
    /*É muito comum que os atributos sejam private (para protegê-los), e quase todos os métodos
        sejam public (não é uma regra). Desta forma, toda conversa de um objeto com outro é feita por troca
        de mensagens, isto é, acessando seus métodos*/
    
    /*A fim de permitir o acesso aos atributos (já que eles são private ) de uma maneira controlada, a
        prática mais comum é criar dois métodos, um que retorna o valor, e outro o qual muda o valor.
        A convenção para esses métodos é de colocar a palavra get ou set antes do nome do atributo.
        Get = retorna um valor, set = modifica um valor não retornando nada */
    //Getters e setters são usados para as classes terem acesso a atributos privados, por isso, são métodos públicos
    //A utilização da cláusula THIS faz referência ao atributo da classe dentro da qual se está trabalhando. Usa-se quando existe duas variáveis iguais
    
    public String getNome(){
        return this.nome;
    }
    public float getAltura(){
        return this.altura;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setAltura(float altura){
        this.altura=altura;
    }
    
    public void imprimirDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Altura: "+altura);
    }
    
}
