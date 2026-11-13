import java.util.Scanner;

public class exerc2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        int [] numero = new int [8];
        

        for(int i= 0; i < numero.length;i++){           
            System.out.print("Digite os numeros: ");
             numero[i]=entrada.nextInt();
        }
        int maior = numero[0];
        int menor= numero[0];
        for(int i= 1; i< numero.length;i++){            
            if(numero[i]> maior){
                maior = numero[i];            
            }if(numero[i]<menor){
                menor = numero[i];
            }

            

        }
        System.out.println("O maior n° é : "+ maior);
        System.out.println("O menor n° é : "+ menor);
        entrada.close();
    }
        
}
