/*Enunciado:

Crie um programa que some todos os números de 1 até 100 utilizando while.
 */

package dia02;

public class exercicio10 {
    public static void main(String[] args) {
        
        int numero = 1;
        int soma = 0;

        while( numero <=100){
            soma = numero + soma;
            numero++;
            
        }System.out.println(soma);
        
    }
    
}
