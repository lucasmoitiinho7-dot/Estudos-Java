package dia06;

import java.util.Scanner;

public class exercicio3 {
    public static double soma(double a, double b){
        return a+b;
    }
    public static double subtracao(double a, double b){
        return a-b;
    }
    public static double multiplicação(double a, double b){
        return a*b;
    }
    public static double divisao(double a, double b){               
        return a/b;
    }

    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("A: ");
        double a = entrada.nextDouble();
        System.out.print("B: ");
        double b = entrada.nextDouble();
        entrada.close();

        double resultado = soma(a, b);
        System.out.println(resultado);

        double resultado2 = subtracao(a, b);
        System.out.println(resultado2);

        double resultado3 = multiplicação(a, b);
        System.out.println(resultado3);

        if(b != 0){
            double resultado4 = divisao(a, b);
            System.out.println(resultado4);            
            }else{
                System.out.println("Numero invalido");
            }

        
                

        }
    }
    

/*
Crie uma classe chamada Calculadora com quatro métodos:
1. somar
2. subtrair
3. multiplicar
4. dividir
Todos devem receber dois double e retornar um double.

No main, chame os quatro métodos e imprima os resultados.

Uma observação: na divisão, trate o caso em que o segundo número é zero. */