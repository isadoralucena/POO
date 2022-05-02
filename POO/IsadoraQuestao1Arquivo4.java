/*Implemente a classe Funcionario e a classe Gerente.
    a.  crie a classe Assistente, que também é um funcionário, e que possui um número de
matrícula (faça o método GET). Sobrescreva o método exibeDados().
    b.  sabendo que os Assistentes Técnicos possuem um bônus salarial e que os
Assistentes Administrativos possuem um turno (dia ou noite) e um adicional
noturno, crie as classes Tecnico e Administrativo.*/
package POO;
public class IsadoraQuestao1Arquivo4 extends IsadoraQuestao1Arquivo3{//IsadoraQuestao1Arquivo4 se refere à classe AssistenteTecnico
    public void bonusSalarial(double bonusSalarial){//Método sem retorno que recebe um bonusSalarial
        setSalario(getSalario() +(getSalario()*bonusSalarial));//O salario muda, acrescenta-se nele o bonusSalarial (em porcentagem) 
    }
    @Override
    public void exibeDados(){//Sobreescrita do método da superclasse Assistente
        super.exibeDados();//Chamando o método da superclasse, para aproveitar o que já estava nele
    }
}
