package POO;
import javax.swing.JOptionPane;
public class InterfaceGraficaJOptionPane {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        String sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome: ");
        
        String nomeCompleto = nome+" "+sobrenome;
        JOptionPane.showMessageDialog(null, "Nome completo: "+nomeCompleto,"Informação", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
