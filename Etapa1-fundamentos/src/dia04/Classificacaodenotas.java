
package dia04;
import java.util.Scanner;

public class Classificacaodenotas { 
    public static void main(String[] args) {
        Scanner  entrada = new Scanner (System.in);

        System.out.println("Insira uma nota de 0 a 10");
        double nota = entrada.nextDouble();

        if(nota !=0 ||nota >10){
            System.out.println("Nota Invalida");    
        }else if(nota <=4.9){
            System.out.println("Reprovado");

        }else if( nota <= 6.9){
            System.out.println("Recuperação");

        }else if(nota <= 8.9){
            System.out.println("bom");
        }else{
            System.out.println("Excelente");
        }

        entrada.close();


        
    }
    
}
