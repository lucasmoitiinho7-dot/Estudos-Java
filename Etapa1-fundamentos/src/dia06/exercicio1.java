package dia06;

public class exercicio1 {
    public static int calcular (int a , int b){
        return  a+b;
    }

    public static int calcular (int a, int b, int c){
        return a+b+c;

    }
    public double calcular( double a, double b){
        return a*b;
    }
    public static  void main(String[] args) {
        
        int a = 25;
        int b = 33;
        int c = 25;
        
        int resultado = calcular(a , b);
        System.out.println(a+"+"+b+"="+resultado); 
        
        int resultado2 = calcular(a, b, c);
        System.err.println(resultado2);

                     //ou

        double resultado3 = calcular(25,35);
        System.out.println(resultado3);
                    
    }
        
    /*
    Crie uma classe chamada Sobrecarga.

Dentro dela, crie três métodos chamados calcular:
1. Um que receba dois números inteiros e retorne a soma.
2. Um que receba três números inteiros e retorne a soma.
3. Um que receba dois números double e retorne a multiplicação.
Depois, no main, faça uma chamada para cada método e imprima os resultados. */

        
    
}
