/*Escreva um modelo Empregado que represente um empregado de uma empresa qualquer. 
Considere que os atributos nome, departamento, horasTrabalhadasNoMês e salárioPorHora 
devam ser representados, e que ao menos as operações mostraDados e 
calculaSalarioMensal sejam implementadas.*/
package POO;
public class EmpregadoMain {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado();
        empregado1.nome = "Glaucyrlei";
        empregado1.departamento = "TI";
        empregado1.horasTrabalhadasNoMes = 2800;
        empregado1.salarioPorHora = 5;
        
        empregado1.mostrarDados();//Chamando a função
        empregado1.calcularSalarioMensal();//Chamando a função
    }
}
