package provaRecuperacao;
public class Gerente extends Funcionario{//Criando a classe Gerente que herda Funcionario
    @Override
    public void aumentaSalario(){//Sobrescrevendo método
        setSalario(getSalario()*1.10);
    }
}
