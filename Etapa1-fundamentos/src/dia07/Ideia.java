import java.util.Scanner;

public class Ideia {

    public static int soma(int[] numero){
        int soma = 0;
        for(int i= 0; i < numero.length;i++){
            soma += numero[i];
        }
        return soma;
                

    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quant = 0;

        do{
        System.out.println("Quanto numeros deseja armazenar: ");
        quant = entrada.nextInt();
        }while(quant<=0);

        int[] numero = new int[quant];
        for(int i = 0; i< numero.length;i++){
            System.out.println("Informe um numero: ");
            numero[i]=entrada.nextInt();
        }

        int i = 0;
        for(i=0;i< numero.length;i++){
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
                int maior = numero[0];
                for(i = 1;i<numero.length;i++){
                    if(numero[i]>maior){
                        maior=numero[i];
                                               
                    }
                }
                System.out.println("O maior numero é: "+maior);
                break;
            }
            case 2:{
                int menor = numero[0];
                for(i=1;i<numero.length;i++){
                    if(numero[i]<menor){
                        menor = numero[i];
                        
                    }
                }
                System.out.println("O menor numero é:" +menor);
                break;
            }
            case 3:{
                int total = soma(numero);
                System.out.println("A soma total é : "+total);
                break;
            }
            case 4:{
                int total = soma(numero);
                double media = total / (double) numero.length;
                System.out.println("Média: " + media);
                break;
            }
            case 5:
                
                System.out.println("Qual numero deseja procurar: ");
                int busca = entrada.nextInt();

                boolean encontrado = false;

                for(i=0;i<numero.length;i++){
                    if(numero[i]==busca){
                    System.out.println("Encontrado na posição: " + i);
                    encontrado = true;
                    }                    
                }
                if(!encontrado){
                    System.out.println("Numero não encontrado!");
                }
                break;
                
            case 6:{
                int pares = 0;
                for(i = 0; i < numero.length; i++){
                if(numero[i]%2==0){
                    pares++;
                }
                }
                System.out.println("Quantidade de pares: "+pares);
                break;
            }
            case 7:{
                int impares=0;
                for( i = 0;i<numero.length;i++){
                if(numero[i]%2 !=0){
                    impares ++;                    
                }            
                }
                System.out.println("Quantidade de impares:"+impares);
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




