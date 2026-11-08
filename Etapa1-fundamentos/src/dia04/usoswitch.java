package dia04;
import java.util.Scanner;
public class usoswitch {
    public static void main(String[]args){
        Scanner entrada = new Scanner (System.in);

        System.out.println("Selecione uma das opçoes");
        System.out.println( "1. Cadastrar usuario");
        System.out.println( "2. Consultar usario");
        System.out.println( "3. Excluir usuario");
        System.out.println( "4. Sair ");
                             
        switch (entrada.nextInt()) {
            case 1 :
                System.out.println(" 1. Cadastrar usuario");
                
                break;
            case 2 :
                System.out.println("2. Consultar usuario");

                break;
            case 3:
                System.out.println("3.Excluir usuario ");
                break;
                
            case 4:
                System.out.println("4. Sair");

                break;
        
            default:
                System.out.println("Opção invalida");
                break;
              
            } entrada.close();


    }
}
