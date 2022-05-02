package POO;
import java.util.Date;
import java.text.SimpleDateFormat;//Permite converter informações do tipo String para data do tipo Date, permitindo seguir um formato
import java.util.Calendar;
import java.util.Scanner;
import java.text.ParseException;
public class TesteComData {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");//Se colocar alguma letra dessa diferente de como está aí, minúscula ou maiúsucla, já da erro (é case-sensitive) 
        
        System.out.print("Digite uma data (dia/mes/ano): ");//dd/MM/yyyy
        String auxiliar = sc.nextLine();
        sc.close();
        Date data = formato.parse(auxiliar);//Transformando a string auxiliar no tipo data
        
        Calendar cal = Calendar.getInstance();//A classe Calendar é abstrata, por isso não pode ser instanciada. Para obter um calendário é necessário usar o método estático getInstance()
        cal.setTimeInMillis(data.getTime());//Convertendo o tipo data para o tipo Calendar utilizando o atributo getTime
        
        System.out.println("Dia: "+cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Mes: "+(cal.get(Calendar.MONTH)+1)); 
        System.out.println("Ano: "+cal.get(Calendar.YEAR));
      
    }    
}
