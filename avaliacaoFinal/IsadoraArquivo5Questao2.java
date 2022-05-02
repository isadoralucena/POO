package avaliacaoFinal;
import java.util.Scanner;
public class IsadoraArquivo5Questao2 extends IsadoraArquivo3Questao2{//IsadoraArquivo5Questao2 se refere à classe Funcionario
    Scanner sc = new Scanner(System.in);
    private int ctps;
    int aux;
    private int tituloEleitor;
    private int agencia;
    private String banco;

    public int getCtps() {
        return ctps;
    }

    public void setCtps(int ctps) {
        this.ctps = ctps;
    }

    public int getTituloEleitor() {
        return tituloEleitor;
    }

    public void setTituloEleitor(int tituloEleitor) {
        this.tituloEleitor = tituloEleitor;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public void leituraDeDados(){
        super.leituraDeDados();
        System.out.print("CTPS: ");
        ctps = sc.nextInt();
        setCtps(ctps);
        
        System.out.println("Deseja catalogar seu titulo de eleitor (é opcional)? Digite 1 para sim e 2 para nao");
        aux = sc.nextInt();
        while(aux != 1 && aux!=2){
            System.out.println("Deseja catalogar seu titulo de eleitor (é opcional)? Digite 1 para sim e 2 para nao");
            aux = sc.nextInt();
        }
        if(aux == 1){
            System.out.print("Titulo de eleitor: ");
            tituloEleitor = sc.nextInt();
            setTituloEleitor(tituloEleitor);
        }else{
            System.out.println("Titulo nao cadastrado");
        }
        System.out.print("Agencia: ");
        agencia = sc.nextInt();
        setAgencia(agencia);
        
        System.out.print("Banco: ");
        banco = sc.nextLine();
        setBanco(banco);     
    }
    public void exibicaoDeDados(){
        super.exibicaoDeDados();
        System.out.println("CTPS: "+getCtps());
        if(aux==1){
            System.out.println("Titulo de eleitor: "+getTituloEleitor());   
        }
        System.out.println("Agencia: "+getAgencia());
        System.out.println("Banco: "+getBanco());
    }
}
