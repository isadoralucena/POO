/*Implementar uma classe Lampada que deve possuir como características 
tipo (led, fluorescente,...), 
voltagem, cor, marca, preço, potência, status(boolean). 
Nesta classe devem ser implementados os métodos construtores, getters, setters, toString, ascender e apagar. 
Em uma outra classe chamada LampadaTeste devem ser criados dois objetos do tipo Lampada, 
atribuir valores e exibir os dados deste objeto. 
O programa deverá informar também qual das duas lâmpadas possui maior potência e também 
qual das lâmpadas é a mais cara.*/
package POO;
import java.util.Scanner;
public class LampadaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lampada lampada1 = new Lampada();
        Lampada lampada2 = new Lampada();
        
        System.out.print("Tipo: ");
        String tipo = sc.nextLine();
        lampada1.setTipoDaLampada(tipo);
        
        System.out.print("Cor: ");
        String cor = sc.nextLine();
        lampada1.setCor(cor);
        
        System.out.print("Marca: ");
        String marca = sc.nextLine();
        lampada1.setMarca(marca);
        
        System.out.print("Preco: ");
        float preco = sc.nextFloat();
        lampada1.setPreco(preco);
        
        System.out.print("Voltagem: ");
        int voltagem = sc.nextInt();
        lampada1.setVoltagem(voltagem);
        
        System.out.print("Potencia: ");
        int potencia = sc.nextInt();
        lampada1.setPotencia(potencia);
        
        System.out.print("Status da lampada (true para acesa e false para desligada): ");
        boolean status = sc.nextBoolean();
        lampada1.setStatusDaLampada(status);
        
        sc.nextLine();
        
        System.out.print("Tipo: ");
        String tipo2 = sc.nextLine();
        lampada2.setTipoDaLampada(tipo2);
        
        System.out.print("Cor: ");
        String cor2 = sc.nextLine();
        lampada2.setCor(cor2);
        
        System.out.print("Marca: ");
        String marca2 = sc.nextLine();
        lampada2.setMarca(marca2);
        
        System.out.print("Preco: ");
        float preco2 = sc.nextFloat();
        lampada2.setPreco(preco2);
        
        System.out.print("Voltagem: ");
        int voltagem2 = sc.nextInt();
        lampada2.setVoltagem(voltagem2);
        
        System.out.print("Potencia: ");
        int potencia2 = sc.nextInt();
        lampada2.setPotencia(potencia2);
        
        System.out.print("Status da lampada (true para acesa e false para desligada): ");
        boolean status2 = sc.nextBoolean();
        lampada2.setStatusDaLampada(status2);
        
        if(lampada1.getPreco()==lampada2.getPreco()){
            System.out.println("As duas lampadas tem o mesmo preco");
        }else if((lampada2.getPreco()) < (lampada1.getPreco())){
            System.out.println("A lampada mais cara é a 1, custando R$"+lampada1.getPreco());
        }else{
            System.out.println("A lampada mais cara é a 2, custando R$"+lampada2.getPreco());
        }
        
        if(lampada1.getPotencia()==lampada2.getPotencia()){
            System.out.println("As duas lampadas tem a mesma potencia");
        }else if((lampada2.getVoltagem()) < (lampada1.getVoltagem())){
            System.out.println("A lampada com maior potencia é a 1, sendo"+lampada1.getPotencia());
        }else{
            System.out.println("A lampada com maior potencia é a 2, sendo "+lampada2.getPotencia());
        }
        
        System.out.println(lampada1.toString());
        System.out.println("----------------------------------------------");
        System.out.println(lampada2.toString());
        sc.close();
    } 
}
