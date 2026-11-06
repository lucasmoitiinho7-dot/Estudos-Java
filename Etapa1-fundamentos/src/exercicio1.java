import java.util.Scanner;
public class exercicio1{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String classificacao;
        String acesso;
        System.out.println("Informe o seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Informe a sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("Qual sua altura :");
        double altura = entrada.nextDouble();

        System.out.println("Possui ingresso? (true/false)");
        boolean possuiIngresso = entrada.nextBoolean();
        System.out.println("Está bloqueado? (true/false)");
        boolean bloqueado = entrada.nextBoolean();

        if (idade >=60){
            classificacao = "Idoso";
        }else if(idade >= 18 && idade <= 59){
            classificacao = "Adulto";
        }else if(idade >=12 && idade <=17){
            classificacao = "Adolecente";
        }else
            classificacao = "Criança";

            if(idade >=18 && possuiIngresso && !bloqueado){
                acesso = "Liberado (a), bem vindo";
            }else
               acesso = "Bloqueado , sinto muito";

                System.out.println("Seu nome é "+ nome + " a sua altura é "+ altura + " e a sua idade é " + idade + " a sua classificação é "+ classificacao + " e seu acesso esta "+ acesso);
                




        entrada.close();

        
    }
}


        

    
