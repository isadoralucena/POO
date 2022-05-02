package provaRecuperacao;
public class Programador extends Funcionario{//Criando a classe Programador que herda Funcionario
    @Override
    public void aumentaSalario(){//Sobrescrevendo método
        setSalario(getSalario()*1.20);
    }
}
