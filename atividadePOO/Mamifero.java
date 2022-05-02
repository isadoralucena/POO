package atividadePOO;
public class Mamifero {
    protected void andar(){
        System.out.print("Mamifero andando ");
        ouvir();
    }
    protected void ver(){
        System.out.print("Mamifero vendo ");
    }
    protected void ouvir(){
        System.out.print("Mamifero ouvindo ");
        ver();
    }
}
