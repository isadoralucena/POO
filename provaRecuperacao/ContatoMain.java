package provaRecuperacao;
import javax.swing.JButton;//Importando classe
import java.awt.Dimension;//Importando classe
import java.awt.event.ActionEvent;//Importando classe
import javax.swing.JFrame;//Importando classe
import javax.swing.JLabel;//Importando classe
import javax.swing.JOptionPane;//Importando classe
import javax.swing.JPanel;//Importando classe
import javax.swing.JTextField;//Importando classe

public class ContatoMain {//Criando classe
        public static Contato contato;
	public static void main(String[] args) {//Criando método main
		JFrame frame = new JFrame();//Criando janela
		JPanel panel = new JPanel();//Criando painel
		
		Dimension inputs = new Dimension(100, 20);
		
		JLabel lblName = new JLabel("Nome:");//Criando label
		JTextField nome=  new JTextField();//Criando caixa de entrada de texto
		nome.setPreferredSize(inputs);
		
		JLabel lblEmail = new JLabel("Sobrenome:");//Criando label
		JTextField email=  new JTextField();//Criando caixa de entrada de texto
		email.setPreferredSize(inputs);
		
		JLabel lblSObrenome = new JLabel("Apelido:");//Criando label
		JTextField sobrenome=  new JTextField();//Criando caixa de entrada de texto
		sobrenome.setPreferredSize(inputs);
		JLabel lblApelido = new JLabel("Email:");//Criando label
		JTextField apelido=  new JTextField();//Criando caixa de entrada de texto
		apelido.setPreferredSize(inputs);
		JLabel lblTitulo = new JLabel("Titulo:");//Criando label
		JTextField titulo=  new JTextField();//Criando caixa de entrada de texto
		titulo.setPreferredSize(inputs);
		JButton salvar = new JButton("cadastrar");//Criando label
		
		salvar.addActionListener((ActionEvent e) -> {//Lambda
                    int salvaTitulo;
                    try {//Bloco que pode gerar uma excecao
                        salvaTitulo = Integer.parseInt(titulo.getText());
                    }catch(NumberFormatException f) {//Tratando a exceção
                        salvaTitulo = 0;
                        f.getMessage();
                    }
                    contato = new Contato(apelido.getText(), email.getText().isEmpty()?"vazio":email.getText(), nome.getText(), sobrenome.getText(),salvaTitulo);
                    JOptionPane.showMessageDialog(null, "Nome: "+contato.getNome()+""
                            + "\nApelido: "+contato.getApelido()+"\nSobrenome: "+contato.getSobrenome()+""
                                    + "\nEmail: "+contato.getEmail()+"\nTitulo: "+contato.getTituloEleitoral());
                    System.exit(0);
                });
		
		panel.add(lblName);
		panel.add(nome);
		panel.add(lblEmail);
		panel.add(email);
		panel.add(lblSObrenome);
		panel.add(sobrenome);
		panel.add(lblApelido);
		panel.add(apelido);
		panel.add(lblTitulo);
		panel.add(titulo);
		panel.add(salvar);
		
		frame.add(panel);//Adicionando o painela na janela
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
}