package Dia05;

public class atividade04 {
    public static int calcularArea(int lado ){
        return lado * lado;
        
    }
    public static int calcularArea(int base, int altura){
        return base * altura;
    }
    public static double calcularArea(double raio){
        return Math.PI * raio* raio;
        //return Math.PI * Math.pow(raio, 2); pode se usar dessa maneira tbm
    }   //System.out.printf("%.2f%n", calcularAreaCirculo(5)); // 78,54   O %.2f arredonda para 2 casas, e o %n pula a linha.
}
