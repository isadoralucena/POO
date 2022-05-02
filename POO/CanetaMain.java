/*Implementar uma classe Caneta que deve possuir como características
marca, cor e tamanho. 
Nesta classe devem ser implementados os métodos construtores, getters, setters e toString. 
Em uma outra classe chamada CanetaTeste deverá ser criado um objeto do tipo Caneta, 
atribuir valores e exibir os dados deste objeto.
Aqui vocês devem pesquisar sobre toString. */
package POO;
public class CanetaMain {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta("marca","cor","tamanho");
        caneta1.setMarca("bic");
        caneta1.setCor("azul");
        caneta1.setTamanho("10cm");
        
        String resultado = caneta1.toString();
        System.out.println(resultado);
    }  
}
