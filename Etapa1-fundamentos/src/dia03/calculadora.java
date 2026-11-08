import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o primeiro numero");
        double numero1 = entrada.nextDouble();
        System.out.println("Informe o segundo numero");
        double numero2 = entrada.nextDouble();

        entrada.close();
        
        double soma = numero1 +numero2;
        double multiplicacao = numero1 * numero2;
        double subtracao = numero1 -numero2;
        double divisao;
        double resultado;
        if( numero2 !=0){
            resultado = numero1 % numero2;
            divisao = numero1 / numero2;
            System.out.println(numero1+ " / " + numero2 +" = "+divisao);
            System.out.println(numero1+ " % "+ numero2 +" = "+resultado);
        }else{
            System.out.println("Valor invalido");
        }    
        
        
        System.out.println(numero1+ " + "+ numero2 +" = "+soma);
        System.out.println(numero1+ " X "+ numero2 +" = "+multiplicacao);
        System.out.println(numero1+ " - "+ numero2 + " = "+subtracao);        
        
    }
}
