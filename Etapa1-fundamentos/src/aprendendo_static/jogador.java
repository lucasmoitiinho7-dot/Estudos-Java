package aprendendo_static;

import java.util.Scanner;

public class jogador {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o nome do jogador");
        String nome = entrada.nextLine();

        entrada.close();

        System.out.printf("Seu nome é %s sua mana inicial é %d",nome,dados.manaBase);
        System.out.println();
      
    }
    
}
