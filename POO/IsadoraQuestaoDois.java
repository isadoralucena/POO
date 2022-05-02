/*Suponha que criamos um registro para armazenar Datas:
Data{
int dia;
int mes;
int ano;
}
Implemente um algoritmo que receba um vetor de Datas como parâmetro 
e que retorne as datas em ordem cronológica (crie uma função com cabeçalho: void ordena(Data vet[], int tam).
Dica: Ordene o vetor separadamente por cada um dos campos*/
package POO;
import java.util.Scanner;//Importação para fazer a leitura do teclado
public class IsadoraQuestaoDois {//Assinatura da classe
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Instanciando a classe Scanner
        System.out.print("Quantas datas quer cadastrar? ");
        int numeroDeDatas = sc.nextInt();
        Data [] datas = new Data[numeroDeDatas];
        
        for(int i=0;i<numeroDeDatas;i++){//Estrutura de repetição para ler o vetor
            datas[i]=new Data();//Referenciando as posições do vetor ao registro Data
            System.out.print("Dia " +(i+1)+": ");//Lendo os dias das datas
            datas[i].dia = sc.nextInt();
            System.out.print("Mes " +(i+1)+": ");//Lendo os meses das datas
            datas[i].mes = sc.nextInt();
            System.out.print("Ano " +(i+1)+": ");//Lendo os anos das datas
            datas[i].ano = sc.nextInt();
        }
        ordena(datas, numeroDeDatas);//Chamando a função/método ordena
        sc.close();
    }
    public static void ordena(Data[]datas, int tamanho){//Função/método ordenar os dias, meses e anos
        int auxiliar;
 
        //Ordenando os dias com for aninhado
        for (int i=0;i<tamanho;i++){
            for (int j=0;j<tamanho;j++){
                if(datas[i].dia<datas[j].dia){
                    auxiliar = datas[i].dia;
                    datas[i].dia = datas[j].dia;
                    datas[j].dia = auxiliar;
                }
            }
        } 
        System.out.println("Dias ordenados: ");
        for(int k=0;k<tamanho;k++){//Estrutura de repeticao para imprimir as quantidades ordenadas 
            System.out.println("Dia : "+datas[k].dia);
        }
        
        //Ordenando os meses com for aninhado
        for (int i=0;i<tamanho;i++){ 
            for (int j=0;j<tamanho;j++){
                if(datas[i].mes<datas[j].mes){
                    auxiliar = datas[i].mes;
                    datas[i].mes = datas[j].mes;
                    datas[j].mes = auxiliar;
                }
            }
        }  
        System.out.println("Meses ordenados: ");
        for(int k=0;k<tamanho;k++){//Estrutura de repeticao para imprimir as quantidades ordenadas 
            System.out.println("Mes : "+datas[k].mes);
        }
        
        //Ordenando os anos com for aninhado
        for (int i=0;i<tamanho;i++){ 
            for (int j=0;j<tamanho;j++){
                if(datas[i].ano<datas[j].ano){
                    auxiliar = datas[i].ano;
                    datas[i].ano = datas[j].ano;
                    datas[j].ano = auxiliar;
                }
            }
        }  
        System.out.println("Anos ordenados: ");
        for(int k=0;k<tamanho;k++){//Estrutura de repeticao para imprimir as quantidades ordenadas 
            System.out.println("Mes : "+datas[k].ano);
        }
    }
}
