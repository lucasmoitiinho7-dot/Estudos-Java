import java.util.Scanner;

public class Ideia {

    public static int soma(int[] numero){
        int soma = 0;                                                   //criado o metodo soma para gerir as somas do codigo, i for percorre toda a array
        for(int i= 0; i < numero.length;i++){
            soma += numero[i];
        }
        return soma;
                

    }
    public static int maior(int[] numero){
        int maior = numero[0];
        for(int i = 1;i<numero.length;i++){
            if(numero[i]>maior){
                maior=numero[i];
            }    
        }
        return maior;
    
    }
    public static int menor(int[] numero){
        int menor= numero[0];
        for(int i=1;i<numero.length;i++){
            if(numero [i]<menor){
                menor= numero[i];
            }
        }
        return menor;
    }
    public static double media(int[]numero){
        int total = soma (numero);
        double media = total/ (double)numero.length;
        return media;
    }
    public static boolean localizar(int[] numero, int busca){
        boolean encontrado = false;

        for(int i=0;i<numero.length;i++){
            if( numero[i]== busca){            
            encontrado = true;
            break;
            }
        }         
        return encontrado;
    }

    public static int pares(int[]numero){
        int pares = 0;
        for(int i = 0; i < numero.length; i++){
            if(numero[i]%2==0){
                pares++;
            }
        }
        return pares;
    }
    public static int impares(int[]numero){
        int impares = 0;
        for(int i = 0;i<numero.length;i++){
            if(numero[i]%2 !=0){
                impares++;
            }
        }
        return impares;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);                                     // usado para informar comos os dados entraram no sistema
        int quant = 0;

        do{
        System.out.println("Quanto numeros deseja armazenar: ");                       // do while, protege a inclusão de numeros menores que 0, falta a proteção contra letras, porem ainda nao sei fazer
        quant = entrada.nextInt();
        }while(quant<=0);

        int[] numero = new int[quant];
        for(int i = 0; i< numero.length;i++){                                              // the array containing the previous informations has been cretaed.
            System.out.println("Informe um numero: ");
            numero[i]=entrada.nextInt();
        }

        int i = 0;
        for(i=0;i< numero.length;i++){                                                  // the command iterates through all the number and prints them
            System.out.println("Numero: "+numero[i]);
            
        }
        int opcao = 0;
        do{
        System.out.println("MENU");
        System.out.println("1.Numero maior");
        System.out.println("2.Numero menor");
        System.out.println("3.Soma");
        System.out.println("4.Media");
        System.out.println("5.Busca");
        System.out.println("6. Pares");
        System.out.println("7.Impares");
        System.out.println("0.Sair");
                                  
                      
        opcao =(entrada.nextInt());
        switch (opcao) {
        
            case 1:{
                int resultado = maior(numero);
                System.out.println("O maior numero é: "+resultado);
                break;
            }
            case 2:{
               int resultado = menor(numero);
                System.out.println("O menor numero é:" +resultado);
                break;
            }
            case 3:{
                int total = soma(numero);
                System.out.println("A soma total é : "+total);
                break;
            }
            case 4:{
                double resultado = media(numero);
                System.out.println("Média: " + resultado);
                break;
            }
            case 5:{                               
                System.out.println("Qual numero deseja procurar: ");
                int busca = entrada.nextInt();  
                
                boolean encontrado = localizar(numero, busca);
                if(encontrado){
                    System.out.println("Encontrado na posição: " + i);
                }else{
                    System.out.println("Numero não encontrado");
                }                                                                                                  
                break;
            }
                
            case 6:{
                int quantidade = pares(numero);                               
                System.out.println("Quantidade de pares: "+quantidade);
                break;
            }
            case 7:{
                int quantidade = impares(numero);
                System.out.println("Quantidade de impares:"+quantidade);
                break;
            }
            case 0:
                System.out.println("Encerrando o programa: ");
                break;

            default:
                    System.out.println("Valor invalido");
            
                break;

            }
        

            
        }while(opcao!=0);
        entrada.close();
    }
}




