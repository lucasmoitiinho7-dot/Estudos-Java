package dia06;

public class sobrecarga {
    public static int somar( int a , int b){
        return a +b ;  
    }

    public static  int somar (int a, int b, int c){
        return a + b+ c;    
    }

    public static double somar ( double a, double b){
        return a +b;

    }
}

/*Isso é chamado de sobrecarga de métodos.

O Java permite que você tenha vários métodos com o mesmo nome, desde que suas listas de parâmetros sejam diferentes.
Observe as diferenças

Método	Parâmetros
somar	2 inteiros
somar	3 inteiros
somar	2 doubles

*/