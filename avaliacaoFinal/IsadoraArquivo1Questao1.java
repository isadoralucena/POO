/*Implemente uma classe chamada IsadoraArquivo1Questao1, que deva conter pelo menos cinco atributos 
e pelo menos dois métodos que não seja get e set. 
Explique com suas palavras, nos comentários, 
a importância de utilizarmos os métodos get e set 
e qual o princípio do POO utilizado nesta questão.*/
package avaliacaoFinal;
import java.util.Date;//Importação da classe Date, para criar uma variável do tipo date
import java.util.Calendar;//Importação da classe Calendar para transformar a variável do tipo date em uma do tipo Calendar 
public class IsadoraArquivo1Questao1 {
    private String genero;
    private int idade;
    private String nome;
    private String nacionalidade;
    private Date dataDeNascimento;
    private float altura;
    Calendar cal = Calendar.getInstance();//A classe Calendar é abstrata, por isso não pode ser instanciada. Para obter um calendário é necessário usar o método estático getInstance()
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getGenero(){
        return this.genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getNacionalidade(){
        return this.nacionalidade;
    }
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    public float getAltura(){
        return this.altura;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    public Date getDataDeNascimento(){
        return this.dataDeNascimento;
    }
    public void setDataDeNascimento(Date dataDeNascimento){
        this.dataDeNascimento = dataDeNascimento;
    }
    public int calcularIdade(){
        cal.setTime(dataDeNascimento);//Transformando a data do tipo date em calendar
        setIdade((2022 - (cal.get(Calendar.YEAR))));
        return getIdade();
    }
    public void imprimirDados(){ 
        cal.setTime(dataDeNascimento);//Transformando a data do tipo date em calendar
        System.out.println("Nome: "+getNome());
        System.out.println("Genero: "+getGenero());
        System.out.println("Nacionalidade: "+getNacionalidade());
        System.out.println("Altura: "+getAltura());
        System.out.println("Data de nascimento: "+cal.get(Calendar.DATE)+"/"+(cal.get(Calendar.MONTH)+1)+"/"+cal.get(Calendar.YEAR));
        System.out.println("Idade aproximada: "+calcularIdade());
    }
    //Considerando (de modo bem genérico) que a partir dos 61 anos e 6 meses mulheres podem pedir aposentadoria
    //E que homens podem pedir aos 65 anos
    public void lonjuraParaSeAposentar(){
        calcularIdade();
        if(getIdade() <= 30){
            System.out.println("Ainda falta muito tempo para se aposentar");
        }else if(getIdade() <= 59){
                System.out.println("Falta uns anos ainda para se aposentar, mas está mais perto do que longe");
        }else if(getIdade() >= 60){
            if(getGenero().equalsIgnoreCase("feminino") || getGenero().equalsIgnoreCase("mulher")){
                System.out.println("A partir dos 61 anos e 6 meses dá para solicitar aposentadoria");
            }else if(getGenero().equalsIgnoreCase("masculino") || getGenero().equalsIgnoreCase("homem")){
                System.out.println("A partir dos 65 anos dá para solicitar aposentadoria");
            }else{
                System.out.println("Infelizmente seu gênero ainda não foi cadastrado no sistema. Por enquanto temos que: ");
                System.out.println("Homens se aposentam aos 65 anos");
                System.out.println("Mulheres aos 61 anos e 6 meses");
            }
        }
    }
}
