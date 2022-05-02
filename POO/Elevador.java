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
public class Elevador {
    private int andarAtual;//Criando variável inteira privada (fechando o seu acesso em relação a outras classes)
    private int totalDeAndares;//Criando variável inteira privada (fechando o seu acesso em relação a outras classes)
    private int capacidadeDePessoas;//Criando variável inteira privada (fechando o seu acesso em relação a outras classes)
    private int quantidadePessoasAgora;//Criando variável inteira privada (fechando o seu acesso em relação a outras classes)
    public Elevador(){//Os elevadores sempre começam no térreo e vazios
        this.andarAtual = 0;//Inicializando a variável com valor 0
        this.quantidadePessoasAgora = 0;//Inicializando a variável com valor 0
    }
    public int getAndarAtual(){
        return this.andarAtual;
    }
    public int getTotalDeAndares(){
        return this.totalDeAndares;
    }
    public int getCapacidadeDePessoas(){
        return this.capacidadeDePessoas;
    }
    public int getQuantidadePessoasAgora(){
        return this.quantidadePessoasAgora;
    }
    public void setAndarAtual(int andarAtual){
        this.andarAtual = andarAtual;
    }
    public void setTotalDeAndares(int totalDeAndares){
        this.totalDeAndares = totalDeAndares;
    }
    public void setCapacidadeDePessoas(int capacidadeDePessoas){
        this.capacidadeDePessoas = capacidadeDePessoas;
    }
    public void setQuantidadePessoasAgora(int quantidadePessoasAgora){
        this.quantidadePessoasAgora = quantidadePessoasAgora;
    }
    public void acrescentarPessoaNoElevador(){//Método 
        if((quantidadePessoasAgora + 1) <= capacidadeDePessoas){//Condição de existência para acrescentar pessoas
            quantidadePessoasAgora += 1;
        }else{
            System.out.println("Não é possível adicionar mais uma pessoa, a capacidade do elevador está no limite");
        }
    }
    public void removerPessoaNoElevador(){//Método 
        if(quantidadePessoasAgora>0){//Condição de existência para remover pessoas
            quantidadePessoasAgora -= 1;
        }else{
            System.out.println("Não há nenhuma pessoa no elevador para remover");
        }
    }
    public void subirAndar(){//Método 
        if(totalDeAndares > andarAtual){//Condição de existência para subir andares
            andarAtual +=1;
        }else{
            System.out.println("Não há como subir um andar. O elevador está no andar máximo");
        }
    }
    public void descerAndar(){//Método 
        if(andarAtual > 0){//Condição de existência para descer andares
            andarAtual -= 1;
        }else{
            System.out.println("Não há como descer um andar. O elevador está no andar mínimo");
        }
    }
    public void exibicaoDaPosicaoAtual(){//Método exibição
        System.out.println("Andar atual: "+andarAtual);
        System.out.println("Total de andares do prédio: "+totalDeAndares);
        System.out.println("Capacidades de pessoas no elevador: "+capacidadeDePessoas);
        System.out.println("Quantidade de pessoas no elevador agora: "+quantidadePessoasAgora);
    }
    
}
