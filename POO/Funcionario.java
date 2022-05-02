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
public class Funcionario extends PessoaFisica{
    private String matricula;
    private float salarioBase;
    private int cargaHorariaMensal;
    private int horasTrabalhadasMes;
    protected int calculaBonus(){
        return 0;
    }
    public float calculaSalarioBruto(){
        if(horasTrabalhadasMes <= cargaHorariaMensal){
            float salarioFinal = salarioBase * horasTrabalhadasMes / cargaHorariaMensal;
            return salarioFinal;
        }else{
            return 0.00f;
        }
    }
    public String toString(){
        return "Nome: "+this.getNome()+" "+this.getSobrenome() + 
        "\nCpf: "+this.getCpf()+"\nMatricula: "+this.getMatricula()+"\nPais: "+this.getPais()+
        "\nData do cadastro: "+this.getDataCadastro()+"\nSalarioBruto: "+calculaSalarioBruto();
    }
    public String getMatricula(){
        return this.matricula;
    }
    public float getSalarioBase(){
        return this.salarioBase;
    }
    public int getCargaHorarioMensal(){
        return this.cargaHorariaMensal;
    }
    public int getHorasTrabalhadasMes(){
        return this.horasTrabalhadasMes;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }
    public void setCargaHorariaMensal(int cargaHorariaMensal) {
        this.cargaHorariaMensal = cargaHorariaMensal;
    }
    public void setHorasTrabalhadasMes(int horasTrabalhadasMes) {
        this.horasTrabalhadasMes = horasTrabalhadasMes;
    }
}
