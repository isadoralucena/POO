package revisao;
import java.util.Scanner;
public class AreaDoTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base;
        int altura;
        int area;
        System.out.print("Informe a altura: ");
        altura= sc.nextInt();
        
        System.out.print("Informe a base: ");
        base= sc.nextInt();
        sc.close();

        area = (base*altura)/2;
        System.out.println("Area do triangulo: "+area);
    }
}
