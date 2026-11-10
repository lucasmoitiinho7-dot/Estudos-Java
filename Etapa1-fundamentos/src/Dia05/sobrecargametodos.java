package Dia05;

public class sobrecargametodos {
    public static  int calcular(int a , int b){
        return a +b;
    }
    public  static double calcular ( double a , double b){
        return a + b;
    }
    public static int calcular (int a , int b, int c){
        return a+b-c;
    }
}


/* Java permite criar vários métodos com o mesmo nome, desde que tenham parâmetros diferentes
 */