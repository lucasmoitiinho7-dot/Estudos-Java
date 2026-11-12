package dia06;

import java.util.Scanner;


public class exercicio4 {
    public static double soma(double a, double b){
        return a + b;
    }
    public static double subtracao(double a, double b){
        return a-b;
    }
    public static double multiplicacao(double a, double b){
        return a*b;
    }
    public static double divisao(double a , double b){
        return a/b; 
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);   
        System.out.println("Calculadora");
        System.out.println("1.Soma");
        System.out.println("2.Subtração");
        System.out.println("3.Multiplicação");
        System.out.println("4.Divisão");

        switch (entrada.nextInt()) {
            case 1:{
                System.out.print("Numero A: ");
                double a = entrada.nextDouble();
                System.out.print("Numero B: ");
                double b = entrada.nextDouble();
                

                double resultado = soma(a, b);
                System.out.println(resultado);                                
                break;
                }
                case 2:{
                    System.out.print("Numero A: ");
                    double a =entrada.nextDouble();
                    System.out.print("Numero B: ");
                    double b = entrada. nextDouble();

                    double resultado = subtracao(a, b);
                    System.out.println(resultado);
                    break;
                }
                case 3:{
                    System.out.print("Numero A: ");
                    double a = entrada.nextDouble();
                    System.out.print("Numero B: ");
                    double b = entrada.nextDouble();

                    double resultado = multiplicacao(a, b);
                    System.out.println(resultado);
                    break;
                }
                case 4:{
                    System.out.print("Numero A: ");
                    double a = entrada.nextDouble();
                    System.out.print("Numero B: ");
                    double b = entrada.nextDouble();

                    if(b != 0){
                        double resultado = divisao(a, b);
                        System.out.println(resultado);
                    }else{
                        System.out.println("Valor incorreto  ");
                    }
                    break;

                }
                default:
                System.out.println("Valor Incorreto chegou aqui");
                break;

               
                
            
        }entrada.close(); 
        
    }
    
}
