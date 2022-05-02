package POO;
import javax.swing.JOptionPane;
public class InterfaceGraficaJOptionPane2{
    public static void main(String[] args) throws NumberFormatException{
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
        
        int soma = num + num2;
        JOptionPane.showMessageDialog(null, "Resultado da soma: "+soma,"Resultado", JOptionPane.INFORMATION_MESSAGE);
    } 
}
