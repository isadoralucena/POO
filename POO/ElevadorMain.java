/*Crie uma classe Elevador para armazenar as informações de um elevador de prédio. 
A classe deve armazenar o andar atual (térreo = 0), 
total de andares no prédio (desconsiderando o térreo), 
capacidade do elevador e 
quantas pessoas estão presentes nele. 
A classe deve também disponibilizar os seguintes métodos:
    *que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre começam no térreo e vazio);
    *para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
    *para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
    *para subir um andar (não deve subir se já estiver no último andar);
    *para descer um andar (não deve descer se já estiver no térreo);
Obs.: (criar os métodos get e set para todos os atributos da classe).*/
package POO;
import java.util.Scanner;//Importação para fazer a leitura do teclado
public class ElevadorMain {//Assinatura da classe
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Instanciando a classe Scanner
        Elevador elevador1 = new Elevador();//Instanciando a classe Elevador como o objeto elevador1
        
        System.out.print("(Desconsidere o térreo) Quantos andares tem o elevador? ");
        int andares = sc.nextInt();
        elevador1.setTotalDeAndares(andares);//Passando a variável andares como valor da variável privada totalDeAndares
        
        System.out.print("Quantas pessoas cabe no elevador? Qual a capacidade limite? ");
        int capacidade = sc.nextInt();
        elevador1.setCapacidadeDePessoas(capacidade);//Passando a variável capacidade como valor da variável privada capacidadeDePessoas
        sc.close();

        //elevador1.descerAndar();//Chamando função
        //elevador1.subirAndar();//Chamando função
        //elevado1.removerPessoaNoElevador();//Chamando função
        //elevador1.acrescentarPessoaNoElevador();//Chamando função
        elevador1.exibicaoDaPosicaoAtual();//Chamando função
    }    
}
