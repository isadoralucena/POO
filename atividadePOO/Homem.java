package atividadePOO;
public class Homem extends Primata{
    @Override
    protected void ver(){
        System.out.print("Homem vendo ");
    }
    public static void main(String args[]){
        Mamifero m = new Homem();
        m.andar();
    }
}
