/*Exercício 09 — Tabuada com while
Enunciado:

Crie um programa que mostre a tabuada de um número escolhido por você, de 1 até 10.
 */

package dia02;
public class exercicio9 {
    public static void main(String[] args) {

        int numero = 7;
        int multiplicador = 1;


        while( multiplicador <=10 ){
            int resultado = numero * multiplicador;        
        System.out.println(numero+" x "+ multiplicador+" = "+resultado);
        multiplicador++;

        }       
        
        



        
    }

    
}