package provaRecuperacao;
import java.util.Scanner;//Importando a classe Scanner para leitura do teclado 
public class Aplicacao {//Criando a classe Aplicacao
    public static void main(String[] args){//Criando o método main
    Scanner sc = new Scanner(System.in);//Instanciando a classe Scanner
    Funcionario f1 = new Gerente();//Criando objeto
    f1.setNome("Geraldo");//Atribuindo valores
    f1.setSalario(1000);//Atribuindo valores
    
    Funcionario f2 = new Programador();//Criando objeto
    f2.setNome("Paulo");//Atribuindo valores na variavel private
    f2.setSalario(1300);//Atribuindo valores na variavel private
    
    System.out.println("--------------------------------");
    System.out.println("|Digite 1 para imprimir dados  |");
    System.out.println("|Digite 2 para aumentar salario|");
    System.out.println("--------------------------------");
    int resp = sc.nextInt();
    System.out.println("---------------------------");
    System.out.println("|Digite 1 para gerente    |");
    System.out.println("|Digite 2 para programador|");
    System.out.println("---------------------------");
    int resp2 = sc.nextInt();
    if(resp == 1){//imprimir dados
        if(resp2 ==1){//gerente
            imprimirDados(f1);
        }else{//programador
            imprimirDados(f2);
        }
    }else{//aumentar salario
        if(resp2 == 1){
            aumentarSalario(f1);
        }else{
            aumentarSalario(f2);
        }
    }
    sc.close();  
    }
    public static void imprimirDados(Funcionario f1){//Criando método
        System.out.println("Nome: "+f1.getNome());//Exibindo o atributo privado
        System.out.println("Salario: "+f1.getSalario());//Exibindo o atributo privado
    }
    public static void aumentarSalario(Funcionario f2){//Criando método
            f2.aumentaSalario();
            System.out.println("Nome do gerente: "+f2.getNome());//Exibindo o atributo privado
            System.out.println("Salario do gerente: "+f2.getSalario());//Exibindo o atributo privado
    }
}

