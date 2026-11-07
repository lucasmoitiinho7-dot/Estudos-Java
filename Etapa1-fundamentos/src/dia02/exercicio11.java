//Objetivo: criar um programa que utilize while, do while e for.

package dia02;

public class exercicio11 {
    public static void main(String[] args) {
        
        int numero = 0;
        int multiplicador = 1;

        while(numero<=9){
            numero++;
            System.out.println("Contagem = "+numero);
        }

        do{
            
            System.out.println("Contagem Regressiva = "+numero);
            numero--;            
        }while(numero >=1);


        for(numero = 5;multiplicador<=10;multiplicador++){
            int resultado = numero * multiplicador;
            System.out.println(numero+"x"+multiplicador+"="+resultado);
        }

        
    }

}
