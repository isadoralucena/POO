package POO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
public class InterfaceGraficaAula01 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Meu primeiro frame em Java");
        janela.setSize(500,500);        
        janela.setVisible(true);
        
        JButton butao = new JButton("Limpa");
        JPanel painel = new JPanel();
        janela.getContentPane().add (painel);//adiciona o painel na janela
        painel.add(butao);
        
        JTextField texto = new JTextField(10);
        painel.add(texto);
        
        
    } 
}
