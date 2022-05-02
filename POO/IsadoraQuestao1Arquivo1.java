/*Implemente a classe Funcionario e a classe Gerente.
    a.  crie a classe Assistente, que também é um funcionário, e que possui um número de
matrícula (faça o método GET). Sobrescreva o método exibeDados().
    b.  sabendo que os Assistentes Técnicos possuem um bônus salarial e que os
Assistentes Administrativos possuem um turno (dia ou noite) e um adicional
noturno, crie as classes Tecnico e Administrativo.*/
package POO;
public class IsadoraQuestao1Arquivo1 {//A Classe IsadoraQuestao1Arquivo2 se refere à classe FUNCIONÁRIO   
    private double salario;
    private int cargaHorariaMensal;
    private int horasTrabalhadasMes;
    private double cpf; 
    private String nome;
    private String sobrenome;
    public String getNome(){//Método get para acessar
        return this.nome;
    }
    public String getSobrenome(){//Método get para acessar
        return this.sobrenome;
    }
    public double getCpf(){//Método get para acessar
        return this.cpf;
    }
    public double getSalario(){//Método get para acessar
        return this.salario;
    }
    public int getCargaHorariaMensal(){//Método get para acessar
        return this.cargaHorariaMensal;
    }
    public int getHorasTrabalhadasMes(){//Método get para acessar
        return this.horasTrabalhadasMes;
    }
    public void setSalario(double salario){//Método set para mudar
        this.salario = salario;
    }
    public void setCargaHorariaMensal(int cargaHorariaMensal){//Método set para mudar
        this.cargaHorariaMensal = cargaHorariaMensal;
    }
    public void setHorasTrabalhadasMes(int horasTrabalhadasMes){//Método set para mudar
        this.horasTrabalhadasMes = horasTrabalhadasMes;
    }
    public void setNome(String nome){//Método set para mudar
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome){//Método set para mudar
        this.sobrenome = sobrenome;
    }
    public void setCpf(double cpf){//Método set para mudar
        this.cpf = cpf;
    }
    public void exibeDados(){//Método sem retorno apenas para exibir os valores dos atributos da classe Funcionário
        System.out.println("Salario: "+getSalario());
        System.out.println("Carga horaria mensal: "+getCargaHorariaMensal());
        System.out.println("Horas trabalhadas no mes: "+getHorasTrabalhadasMes());
        System.out.println("CPF: "+getCpf());
        System.out.println("Nome: "+getNome());
        System.out.println("Sobrenome: "+getSobrenome());
    }
}
