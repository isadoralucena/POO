package provaRecuperacao;
import java.util.ArrayList;//Importando classe
import java.util.List;//Importando classe
import java.util.Scanner;//Importando a classe Scanner para leitura do teclado
public class ListaVeiculos {//Criando classe
    /*Foi usado polimorfismo de modo que um mesmo elemento tenha diferentes diferentes/ diferentes jeitos/diferentes comportamentos.
      Permitindo que classes pertencentes a uma mesma linha de herança possuiessem comportamentos diferentes para o mesmo método*/
    Scanner sc = new Scanner(System.in);//Instanciando a classe Scanner
    List <VeiculoTerrestre> veiculoT = new ArrayList<VeiculoTerrestre>();//Criando uma lista de veiculos terrestres
    List <VeiculoAquatico> veiculoAq = new ArrayList<VeiculoAquatico>();//Criando uma lista de veiculos aquaticos
    List <VeiculoAereo> veiculoAe = new ArrayList<VeiculoAereo>();//Criando uma lista de veiculos aereos
    
    public void inserirVeiculo(VeiculoTerrestre veiculoTerrestre){
            veiculoT.add(veiculoTerrestre);   
    }
    public void inserirVeiculo(VeiculoAquatico veiculoAquatico){
            veiculoAq.add(veiculoAquatico);
    }
    public void inserirVeiculo(VeiculoAereo veiculoAereo){
        veiculoAe.add(veiculoAereo);
    }
    public void removerVeiculo(int tipo){//Criando método para remover elementos de acordo com seu indice nas listas criadas
        if(tipo ==1){
            System.out.println("A lista tem "+veiculoAq.size()+" itens, deseja remover qual? ");
            int aux = sc.nextInt();
            veiculoAq.remove(aux-1);
            System.out.println("O elemento de índice "+aux+" foi removido");
        }else if(tipo ==2){
            System.out.println("A lista tem "+veiculoAe.size()+" itens, deseja remover qual? ");
            int aux = sc.nextInt();
            veiculoAe.remove(aux-1);
            System.out.println("O elemento de índice "+aux+" foi removido");
        }else{
            System.out.println("A lista tem "+veiculoT.size()+" itens, deseja remover qual? ");
            int aux = sc.nextInt();
            veiculoT.remove(aux-1);
            System.out.println("O elemento de índice "+aux+" foi removido");
        }
    }
    public void exibicaoListaVeiculos(int tipo){//Criando método para exibir as listas criadas
        if(1 == tipo){
            if(veiculoAq.isEmpty()){
                System.out.println("Não há nada para remover");
            }else{
                for(int i=0;i<veiculoAq.size();i++){
                    System.out.println("Posição "+(i+1)+": "+veiculoAq.toString());
                }
            }
        }else if(tipo ==2){
            if(veiculoAe.isEmpty()){
                System.out.println("Não há nada para remover");
            }else{
                for(int i=0;i<veiculoAe.size();i++){
                    System.out.println("Posição "+(i+1)+": "+veiculoAe.toString());
                }
            }
        }else{
            if(veiculoT.isEmpty()){
                System.out.println("Não há nada para remover");
            }else{
                for(int i=0;i<veiculoT.size();i++){
                    System.out.println("Posição "+(i+1)+": "+veiculoT.toString());
                }
            }
        }   
    }
}

