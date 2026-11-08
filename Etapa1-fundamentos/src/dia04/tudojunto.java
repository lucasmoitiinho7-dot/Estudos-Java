package dia04;
import java.util.Scanner;
public class tudojunto {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);  
                
        System.out.println("""
    Menu Calculadora
    1. Soma
    2. Subtração
    3. Multiplicação
    4. Divisão
    """);
        
    
    switch (entrada.nextInt()){
        case 1:{
            System.out.println("Informe o primeiro numero :");
            double n1= entrada.nextDouble();            
            System.out.println("Informe o segundo numero: ");
            double n2 = entrada.nextDouble();            
            double soma = n1 + n2;
            System.out.println(n1+" + "+n2+" = "+soma);
            
            break;
        }
        case 2:{
            System.out.println("Informe o primeiro numero:");
            double n1= entrada.nextDouble();            
            System.out.println("Informe o segundo numero");
            double n2 = entrada.nextDouble();
            double subtr = n1 - n2;
            System.out.println(n1+" - "+n2+" = "+subtr);

            break;
        }            
        case 3:{
            System.out.println("Infome o primeiro numero: ");
            double n1= entrada.nextDouble();
            System.out.println("Informe o segundo numero: ");
            double n2= entrada.nextDouble();
            double multiplicacao = n1 * n2;
            System.out.println(n1+" x "+n2+" = "+multiplicacao);

            break;  
        }        
        case 4:{
            System.out.println("Informe o primeiro numero:");
            double n1= entrada.nextDouble();
            System.out.println("Informe o segundo numero :");
            double n2 = entrada.nextDouble();
            if(n2 !=0){
                double divisao = n1 / n2;
                System.out.println(n1+ " / "+n2+" = "+divisao);
            }else{
                System.out.println("Valor invalido");
            }           

            break;
        }
        default:
            System.out.println("Valor invalido");
            break;

    }entrada.close();


    
        

    }
}
