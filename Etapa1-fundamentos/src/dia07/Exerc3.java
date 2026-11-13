import java.util.Scanner;

public class Exerc3 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quant = 0;              //Armazena a quantidade de números desejada.
        do{
        System.out.println("Quantos numeros deseja armazenar: ");            //Solicita a quantidade de números que serão armazenados.
        quant= entrada.nextInt();     
        }while(quant <= 0);
                                             
        int[] numero = new int[quant]; 
        for(int i= 0; i < numero.length;i++){
            System.out.println("Informe um numero: ");              // faz a captação dos numeros , informados pelo usuario
            numero[i]= entrada.nextInt();
        }          
       
        
        int i = 0;
        for (i = 0; i < numero.length; i++) {               //imprime os numeros 
        System.out.println("Numero: "+numero[i]); 
        
       
        }
       //  i = 0;
       // do{
      //      soma = numero[i]+soma;                                   // Realiza a soma dos numeros 
     //      i++;           
      //  }while(i < numero.length);
      ///  System.out.println("A Soma total desses numeros é : " + soma);


        int maior= numero[0];
        int menor= numero[0];
        int soma = numero[0];

        for (i = 1;i < numero.length;i++){           //Realiza a verificação dos maior e menor numero
            if(numero[i] > maior){
                maior = numero[i];            
            }if(numero[i]< menor){
                menor = numero[i];
            }
            soma = soma + numero[i];

        }   
            System.out.println("A soma total desses números é: " + soma);
            System.out.println("O maior numero é :"+maior);
            System.out.println("O menor numero é : "+menor);

            double media = soma/(double) quant;                             // Calcula a média aritmética dos números.
           System.out.println("A media é: "+ media);

           entrada.close();      
        
    }
}
