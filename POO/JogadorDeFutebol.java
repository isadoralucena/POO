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
import java.util.Date;//Importação da classe Date, para criar uma variável do tipo date
import java.util.Calendar;//Importação da classe Calendar para transformar a variável do tipo date em uma do tipo Calendar 
public class JogadorDeFutebol {
    private String nome;//Criando variável string privada (fechando o seu acesso em relação a outras classes)
    private String posicao;//Criando variável string privada (fechando o seu acesso em relação a outras classes)
    private String nacionalidade;//Criando variável string privada (fechando o seu acesso em relação a outras classes)
    private float altura;//Criando variável float privada (fechando o seu acesso em relação a outras classes)
    private float peso;//Criando variável float privada (fechando o seu acesso em relação a outras classes)
    private Date dataDeNascimento;//Criando variável date privada (fechando o seu acesso em relação a outras classes)
    Calendar cal = Calendar.getInstance();//A classe Calendar é abstrata, por isso não pode ser instanciada. Para obter um calendário é necessário usar o método estático getInstance()
    public String getNome(){
        return this.nome;
    }
    public String getPosicao(){
        return this.posicao;
    }
    public String getNacionalidade(){
        return this.nacionalidade;
    }
    public float getAltura(){
        return this.altura;
    }
    public float getPeso(){
        return this.peso;
    }
    public Date getDataDeNascimento(){
        return this.dataDeNascimento;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPosicao(String posicao){
        this.posicao = posicao;
    }
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }
    public void setDataDeNascimento(Date dataDeNascimento){
        this.dataDeNascimento = dataDeNascimento;
    }
    public int calcularIdade(){
        cal.setTime(dataDeNascimento);//Transformando a data do tipo date em calendar
        int idade = 2022 - (cal.get(Calendar.YEAR));
        return idade;
    }
    public int calcularAposentadoria(){
        int idade = calcularIdade();//Chamando a função e colocando seu retorno na variável idade
        if(posicao.equals("defesa")){
            return 40 - idade;
	}
        else if(posicao.equals("meio-campo")){
            return 38 - idade;
	}
	else if(posicao.equals("atacante")) {
            return 35 - idade;
	}
	else{
            System.out.println("Posicao diferente de 'defesa, meio-campo e atacante'. Não há como calcular a data de aposentadoria");
            return 0;
	}
    }   
    public void imprimirDados(){ 
        cal.setTime(dataDeNascimento);//Transformando a data do tipo date em calendar
        System.out.println("Nome: "+nome);
        System.out.println("Posicao: "+posicao);
        System.out.println("Nacionalidade: "+nacionalidade);
        System.out.println("Altura: "+altura);
        System.out.println("Peso: "+peso);
        System.out.println("Data de nascimento: "+cal.get(Calendar.DATE)+"/"+(cal.get(Calendar.MONTH)+1)+"/"+cal.get(Calendar.YEAR));
        System.out.println("Idade aproximada: "+calcularIdade());
        System.out.println("Tempo que falta para se aposentar de acordo com a idade do jogador e sua posicao: "+calcularAposentadoria());
    }
}
