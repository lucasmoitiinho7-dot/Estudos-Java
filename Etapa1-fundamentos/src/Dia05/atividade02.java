package Dia05;

public class atividade02 {    
    public static int multiplicar(int numero1 , int numero2){
     int resultado = numero1 * numero2;
     return resultado;   
       

    }
    public static void main (String[]args){
       int total = multiplicar(25, 40);
        System.out.println(total);
        
    

    }
}
/*
Crie um método chamado multiplicar().
1. Ele deve receber dois números inteiros.
2. Deve multiplicar os dois números.
3. Deve retornar o resultado.
4. No main, armazene o resultado em uma variável e imprima. */