/*Crie uma classe para representar uma pessoa, 
com os atributos privados de nome, data de nascimento e altura. 
Crie os métodos públicos necessários para sets e gets 
e também um método para imprimir todos dados de uma pessoa. 
Crie um método para calcular a idade da pessoa*/
package POO;
public class PessoaMain {
    public static void main(String[] args) {
        Pessoa pessoa1= new Pessoa();
        pessoa1.setNome("Mainara");
        pessoa1.setAltura(1.73f);
        
        pessoa1.imprimirDados();
        System.out.println("Utilizando o getNome: "+pessoa1.getNome());
        System.out.println("Utilizando o getAltura: "+pessoa1.getAltura());
    }   
}
