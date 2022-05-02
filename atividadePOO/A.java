package atividadePOO;
public class A {
    public int x;
    public static void main(String[]args){
        A ob1 = new A();
        ob1.x = 10; 
        A ob2 = ob1;
        ob2.x = 3;
        A ob3 = new A();
        ob2 = ob3;
        ob3.x = 20;
        System.out.print(ob1.x+" e "+ob2.x);//3 e 20
    }
}
