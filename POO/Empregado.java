/*Escreva um modelo Empregado que represente um empregado de uma empresa qualquer. 
Considere que os atributos nome, departamento, horasTrabalhadasNoMês e salárioPorHora 
devam ser representados, e que ao menos as operações mostraDados e 
calculaSalarioMensal sejam implementadas.*/
package POO;
public class Empregado {
    String nome;
    String departamento;
    float horasTrabalhadasNoMes;
    float salarioPorHora;
    
    void mostrarDados(){
        System.out.println("O nome do empregado eh: "+nome);
        System.out.println("O departamento do empregado eh: "+departamento);
        System.out.println("O empregado trabalhou "+horasTrabalhadasNoMes+" horas nesses mes");
        System.out.println("O salario por hora do empregado eh R$"+salarioPorHora);
    }
    void calcularSalarioMensal(){
        float salario = (float) ((horasTrabalhadasNoMes * salarioPorHora)*99.2);//99.2 é a porcentagem de desconto dos 8% pro FGTS
        System.out.println("O salario do empregado "+nome+" eh "+salario+" reais");
    }
}
