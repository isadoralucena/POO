/*Crie uma classe de Teste com o método main. Neste método:
    a.  crie um assistente administrativo e um técnico. Imprima o número de matrícula e o
nome de cada um deles.
    b.  crie um animal do tipo cachorro e faça-o latir. Crie um gato e faça-o miar. Faça os
dois animais caminharem.
    c.  teste (como quiser) as classes Rica, Pobre e Miseravel.
    d.  crie um ingresso. Peça para o usuário digitar 1 para normal e 2 para VIP.
Conforme a escolha do usuário, diga se o ingresso é do tipo normal ou VIP. Se for
VIP, peça para ele digitar 1 para camarote superior e 2 para camarote inferior.
Conforme a escolha do usuário, diga se que o VIP é camarote superior ou inferior.
Imprima o valor do ingresso.
    e.  crie um imóvel. Peça para o usuário digitar 1 para novo e 2 para velho. Conforme a
definição do usuário, imprima o valor final do imóvel.*/
package POO;
import java.util.Scanner;
public class IsadoraQuestao5DeTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //OS TESTES ABAIXOS SE REFEREM À QUESTÃO 1
        /*IsadoraQuestao1Arquivo3 assistente = new IsadoraQuestao1Arquivo3();
            assistente.setSalario(3000);
            assistente.setCargaHorariaMensal(30);
            assistente.setHorasTrabalhadasMes(400);
            assistente.setCpf(13455);
            assistente.setNome("Cansado");
            assistente.setSobrenome("de Exausto");
            assistente.setMatricula(43543);
            assistente.exibeDados();
        
        IsadoraQuestao1Arquivo4 assistenteTecnico = new IsadoraQuestao1Arquivo4();
            assistenteTecnico.setSalario(1000);
            assistenteTecnico.setCargaHorariaMensal(10);
            assistenteTecnico.setHorasTrabalhadasMes(15);
            assistenteTecnico.setCpf(1234);
            assistenteTecnico.setNome("Luiz");
            assistenteTecnico.setSobrenome("Cansado");
            assistenteTecnico.setMatricula(202012);
            assistenteTecnico.bonusSalarial(0.10);
            assistenteTecnico.exibeDados();
        
        IsadoraQuestao1Arquivo5 assistenteAdministrativo = new IsadoraQuestao1Arquivo5();
            assistenteAdministrativo.setSalario(2500);
            assistenteAdministrativo.setCargaHorariaMensal(1000);
            assistenteAdministrativo.setHorasTrabalhadasMes(2000);
            assistenteAdministrativo.setCpf(4321);
            assistenteAdministrativo.setNome("Zezinho");
            assistenteAdministrativo.setSobrenome("Exausto");
            assistenteAdministrativo.setMatricula(20301);
            assistenteAdministrativo.setTurno("noturno");
            assistenteAdministrativo.adicionalNoturno(50);
            assistenteAdministrativo.exibeDados();*/
        
        //OS TESTES ABAIXOS SE REFEREM À QUESTÃO 2 (Animal, gato e cachorro)
        /*IsadoraQuestao2Arquivo1 animal = new IsadoraQuestao2Arquivo1("AnimalFofo");
            IsadoraQuestao2Arquivo2 cachorro = new IsadoraQuestao2Arquivo2();
            cachorro.setNome("Arnaldo");
            IsadoraQuestao2Arquivo3 gato = new IsadoraQuestao2Arquivo3();
            gato.setNome("Ares");
            System.out.println(cachorro.late());
            System.out.println(gato.mia());
            System.out.println(cachorro.caminha());
            System.out.println(gato.caminha());
            System.out.println(animal.caminha());*/
        
        //OS TESTES ABAIXOS SE REFEREM À QUESTÃO 2 (Pessoa, rica, pobre ou miseravel)
        /*IsadoraQuestao2Arquivo5 pessoaRica = new IsadoraQuestao2Arquivo5();
            pessoaRica.setNome("Carminha");
            pessoaRica.setDinheiro(40000.0);
            pessoaRica.fazCompras();

            IsadoraQuestao2Arquivo6 pessoaPobre = new IsadoraQuestao2Arquivo6();
            pessoaPobre.setNome("Ludmilla");
            pessoaPobre.trabalha();

            IsadoraQuestao2Arquivo7 pessoaMiseravel = new IsadoraQuestao2Arquivo7();
            pessoaMiseravel.setNome("Marilia");
            pessoaMiseravel.mendiga();*/
        
        
        //OS TESTES ABAIXO SE REFEREM À QUESTÃO 3
        /*IsadoraQuestao3Arquivo1 ingresso = new IsadoraQuestao3Arquivo1();
            ingresso.setValorEmReaisIngresso(30.0);
            IsadoraQuestao3Arquivo2 ingressoVIP = new IsadoraQuestao3Arquivo2();
            ingressoVIP.setValorAdicional(5.0);
            IsadoraQuestao3Arquivo3 ingressoNormal = new IsadoraQuestao3Arquivo3();

            System.out.println("Deseja que seu ingresso seja normal ou VIP? ");
            System.out.println("________________________");
            System.out.println("|Para VIP - digite 1   |");
            System.out.println("|Para normal - digite 2|");
            System.out.println("________________________");
            int opcao = sc.nextInt();
            while(opcao!=1 && opcao!=2){
                System.out.println("Deseja que seu ingresso seja normal ou VIP? ");
                System.out.println("________________________");
                System.out.println("|Para VIP - digite 1   |");
                System.out.println("|Para normal - digite 2|");
                System.out.println("________________________");
                opcao = sc.nextInt();
            }
            if(opcao==1){
                ingressoNormal.imprimeIngressoNormal();
            }else{
                System.out.println("Já que escolheu ingresso VIP, tem duas opções: ");
                System.out.println("_________________________________________");
                System.out.println("|Para VIP (camarote inferior) - digite 1|");
                System.out.println("|Para VIP (camarote superior) - digite 2|");
                System.out.println("_________________________________________");
                opcao = sc.nextInt();
                if(opcao==1){
                    IsadoraQuestao3Arquivo4 ingressoVIPCamaroteInferior = new IsadoraQuestao3Arquivo4();
                    ingressoVIPCamaroteInferior.setLocalizacaoDoIngresso("Bilheteria sul");
                    ingressoVIPCamaroteInferior.imprimirLocalizaoDoIngresso();
                }else if(opcao==2){
                    IsadoraQuestao3Arquivo5 ingressoVIPCamaroteSuperior = new IsadoraQuestao3Arquivo5();
                    ingressoVIPCamaroteSuperior.setNovoValorAdicional(5.0);
                    System.out.println("Valor do ingresso: "+ingressoVIPCamaroteSuperior.valorDoIngressoComAdicional());      
                }else{
                    System.out.println("Opcao inexistente");
                }
            }*/
        
        //OS TESTES ABAIXO SE REFEREM À QUESTÃO 4
        System.out.println("Deseja um imovel velho ou novo? ");
        System.out.println("_______________________");
        System.out.println("|Para novo  - digite 1|");
        System.out.println("|Para velho - digite 2|");
        System.out.println("_______________________");
        int auxiliar = sc.nextInt();
        if(auxiliar==1){
            IsadoraQuestao4Arquivo2 imovelNovo = new IsadoraQuestao4Arquivo2();
            imovelNovo.setAdicionalPrecoReais(1000);
            imovelNovo.setPreco(5000);
            imovelNovo.setEndereco("Bairro dos Exaustos e rua dos Cansados, n° 011011100101");
            imovelNovo.imprime();
        }else if(auxiliar==2){
            IsadoraQuestao4Arquivo3 imovelVelho = new IsadoraQuestao4Arquivo3();
            imovelVelho.setPreco(5000);
            imovelVelho.setDescontoPrecoReais(250);
            imovelVelho.setEndereco("Bairro dos Exaustos e rua dos Cansados, n° 011011100101");
            imovelVelho.imprime();   
        }else{
            System.out.println("Opcao inexistente");
        }
        sc.close();
    }   
}
