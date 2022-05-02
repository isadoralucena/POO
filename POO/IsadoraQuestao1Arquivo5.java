/*Implemente a classe Funcionario e a classe Gerente.
    a.  crie a classe Assistente, que também é um funcionário, e que possui um número de
matrícula (faça o método GET). Sobrescreva o método exibeDados().
    b.  sabendo que os Assistentes Técnicos possuem um bônus salarial e que os
Assistentes Administrativos possuem um turno (dia ou noite) e um adicional
noturno, crie as classes Tecnico e Administrativo.*/
package POO;
public class IsadoraQuestao1Arquivo5 extends IsadoraQuestao1Arquivo3{//IsadoraQuestao1Arquivo5 se refere à classe AssistenteAdministrativo
    private String turno;
    public String getTurno(){//Método get para acessar
        return this.turno;
    }
    public void setTurno(String turno){//Método set para mudar
        this.turno = turno;
    }
    public void adicionalNoturno(double adicional){//Método sem retorno que recebe um adicional (que só é considerado, caso o turno do AssistenteAdministrativo for noturno)
        if("noturno".equalsIgnoreCase(getTurno())){
            setSalario(getSalario()+adicional);//O salario muda, acrescenta-se nele o adicional (em reais)  
        }
    }
    @Override
    public void exibeDados(){//Sobreescrita do método da superclasse Assistente
        super.exibeDados();//Chamando o método da superclasse, para aproveitar o que já estava nele
    }
}
