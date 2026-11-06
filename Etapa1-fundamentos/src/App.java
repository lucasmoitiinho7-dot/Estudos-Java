import java.util.Scanner;
public class App {
        public static void main(String[] args) throws Exception {
            Scanner entrada = new Scanner(System.in);
            //cadastro e entrada de dados
            System.out.print("Digite seu nome : ");
            String nome = entrada.nextLine();
            System.out.print("Digite a sua idade: ");             
            int idade = entrada.nextInt();
            System.out.print("Digite a sua altura: ");     
            double altura = entrada.nextDouble();
            //
            boolean possuiIngresso = true;
            boolean bloqueado = false;

            if (idade>=18 && possuiIngresso && !bloqueado){
                System.out.println("Entrada liberada");
            }else{
                System.out.println("bloqueado");
            }



            //Operações matematicas
            int numero1 = 40;
            double numero2 = 10;
            int numero3 = 10;
            // implementação do uso de if else if e else
            if (idade>=60){
                System.out.println("Você é Idoso");
            }else if(idade >=18){
                System.out.println("Adulto");
            }else if(idade >=12){
                System.out.println("Adolecente");
            }else{
                System.out.println("Criança");
            }
                       

            entrada.close();
             // Primeiro teste: Hello World        
            System.out.println("Hello World!");        
            System.out.println("Meu nome é "+nome + " Tenho "+idade+" anos " + "e tenho "+altura+" de altura" );
            System.out.println(numero1+numero2);
            System.out.println(numero1 - numero2);
            System.out.println(numero1*numero2);
            System.out.println(numero1/numero2); 
            System.out.println(numero1 % numero2);   
            System.out.print((double)numero3);            
            

    
        
    }
}


