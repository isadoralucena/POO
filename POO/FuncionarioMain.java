/*Crie uma classe chamada Funcionario que herde da classe PessoaFisica da questão 1. 
Essa classe deverá ter como atributos privados a matrícula, 
o salário base do funcionário, a carga horária mensal (quantidade de horas mensais) 
e a quantidade de horas trabalhadas no mês. 
A classe deverá ainda ter um método protegido chamado calculaBonus que deverá 
simplesmente retornar o valor 0. Esse método terá um propósito maior adiante. 
Além disso, a classe terá um método público chamado calculaSalarioBruto que não terá nenhum parâmetro e 
deverá ser capaz de calcular e retornar o salário bruto através da 
seguinte equação: salarioBase × quantidadeHorasTrabalhadas ÷ cargaHorariaMensal + calculaBonus(). 
Por fim, crie métodos get e set para os atributos. 
Note que a quantidade de horas trabalhadas não poderá superar a carga horária mensal 
e nem ser inferior a 0. Garanta isso dentro da classe.*/
package POO;
public class FuncionarioMain {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();

        f.setNome("Bixin");
        f.setSobrenome("de óculos");
        f.setCpf("400.289.220-22");
        f.setPais("Noruega");
        f.setDataCadastro("02/13/1980");
        f.setMatricula("23293892030-8");
        f.setSalarioBase(1200.0f);
        f.setCargaHorariaMensal(90);
        f.setHorasTrabalhadasMes(86);

        System.out.println(f.toString());
    }  
}
