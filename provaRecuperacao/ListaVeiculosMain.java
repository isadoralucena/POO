package provaRecuperacao;
import java.util.Scanner;//Importando a classe Scanner para leitura do teclado
public class ListaVeiculosMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Instanciando a classe Scanner
        ListaVeiculos v1 = new ListaVeiculos();//Criando objeto
        int i = 0;
        while(i == 0){
            System.out.println("Digite 1 para adicionar");
            System.out.println("Digite 2 para remover");
            System.out.println("Digite 3 para exibir");
            System.out.println("Digite 0 para sair");// i = 1
            int opcao = sc.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Digite 1 para adicionar veiculo terrestre");
                    System.out.println("Digite 2 para adicionar veiculo aquatico");
                    System.out.println("Digite 3 para adicionar veiculo aereo");
                    int resposta = sc.nextInt();
                    if(resposta == 1){
                        VeiculoTerrestre vei1 = new VeiculoTerrestre();
                        System.out.print("Capacidade de pessoas: ");
                        vei1.setCapacidadeDePessoas(sc.nextInt());
                        System.out.print("Altura do veiculo: ");
                        vei1.setAltura(sc.nextDouble());
                        System.out.print("Largura do veiculo: ");
                        vei1.setLargura(sc.nextDouble());
                        System.out.print("Tem seguro? Digite true para sim e false para nao: ");
                        vei1.setSeguroDoVeiculo(sc.nextBoolean());
                        sc.nextLine();
                        System.out.print("Nome do motorista: ");
                        vei1.setMotorista(sc.nextLine());
                        v1.inserirVeiculo(vei1);
                    }else if(resposta ==2){
                        VeiculoAquatico vei2 = new VeiculoAquatico();
                        System.out.print("Capacidade de pessoas: ");
                        vei2.setCapacidadeDePessoas(sc.nextInt());
                        System.out.print("Altura do veiculo: ");
                        vei2.setAltura(sc.nextDouble());
                        System.out.print("Largura do veiculo: ");
                        vei2.setLargura(sc.nextDouble());
                        System.out.print("Tem seguro? Digite true para sim e false para nao: ");
                        vei2.setSeguroDoVeiculo(sc.nextBoolean());
                        sc.nextLine();
                        System.out.print("Nome do comandante: ");
                        vei2.setComandante(sc.nextLine());
                        v1.inserirVeiculo(vei2);
                    }else if (resposta == 3){
                        VeiculoAereo vei3 = new VeiculoAereo(); 
                        System.out.print("Capacidade de pessoas: ");
                        vei3.setCapacidadeDePessoas(sc.nextInt());
                        System.out.print("Altura do veiculo: ");
                        vei3.setAltura(sc.nextDouble());
                        System.out.print("Largura do veiculo: ");
                        vei3.setLargura(sc.nextDouble());
                        System.out.print("Tem seguro? Digite true para sim e false para nao: ");
                        vei3.setSeguroDoVeiculo(sc.nextBoolean());
                        sc.nextLine();
                        System.out.print("Nome do piloto: ");
                        vei3.setPiloto(sc.nextLine());
                        v1.inserirVeiculo(vei3);
                 
                    }else{
                        System.out.println("Opcao invalida");
                    }
                    break;
                case 2: 
                    System.out.println("Digite 1 para remover veiculo aquatico");
                    System.out.println("Digite 2 para remover veiculo aereo");
                    System.out.println("Digite 3 para remover veiculo terrestre");
                    int auxi = sc.nextInt();
                    if(auxi>0 && auxi<4){
                        v1.removerVeiculo(auxi);//POLIMORFISMO
                        break;
                    }
                    System.out.println("Opcao invalida");
                    break;
                case 3:
                    System.out.println("Digite 1 para exibir a lista de veiculos aquaticos");
                    System.out.println("Digite 2 para exibir  lista de veiculos aereos");
                    System.out.println("Digite 3 para exibir  lista de veiculos terrestres");
                    int auxili = sc.nextInt();
                    if(auxili>0 && auxili<4){
                        v1.exibicaoListaVeiculos(auxili);//POLIMORFISMO
                        break;
                    }
                    break;
                case 0:
                    i=1;
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;              
            }
        }
        sc.close();
    }   
}
