/*Implemente a classe Funcionario e a classe Gerente.
    a.  crie a classe Assistente, que também é um funcionário, e que possui um número de
matrícula (faça o método GET). Sobrescreva o método exibeDados().
    b.  sabendo que os Assistentes Técnicos possuem um bônus salarial e que os
Assistentes Administrativos possuem um turno (dia ou noite) e um adicional
noturno, crie as classes Tecnico e Administrativo.*/
package POO;
public class IsadoraQuestao1Arquivo3 extends IsadoraQuestao1Arquivo1{//IsadoraQuestao1Arquivo3 se refere à classe ASSISTENTE
    private double matricula;
    public double getMatricula(){//Método get para acessar
        return this.matricula;
    }
    public void setMatricula(double matricula){//Método set para mudar
        this.matricula = matricula;
    }
    @Override
    public void exibeDados(){//Sobreescrita do método da superclasse Funcionário
        super.exibeDados();//Chamando o método da superclasse, para aproveitar o que já estava nele
        System.out.println("Matricula: "+getMatricula());//Criando novo comportamento para o método
    }  
}
