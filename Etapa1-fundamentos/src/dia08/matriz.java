package dia08;

import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


       
        int [][] matriz = new int [2][2];
        System.out.println("Informe o numeros da matriz: ");
        for(int i = 0;i < matriz.length;i++){
            for(int j = 0; j< matriz[i].length;j++){                
                matriz[i][j] = entrada.nextInt();
            }

        }
        int soma = 0;
        
        for(int i = 0; i < matriz.length; i++){                                  // Se quisermos somar as colunas precismos inverter o possicionamendos o [i] e do [j] , ambos invertem de posição.
            int somalinha =0;
            for(int j = 0; j < matriz[i].length; j++){  
                                             
                 soma += matriz [i][j];

                 somalinha += matriz [i][j];                 


        System.out.printf("%5d", matriz[i][j]);
        
    }
        System.out.println(" Soma de cada Linha : " + somalinha); 
        System.out.println();
}    
        System.out.println(" Soma total: " + soma); 
        
    }
}
