import java.util.Scanner;

public class test {
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("nota: ");
    float nota = entrada.nextFloat();
    System.out.print("nota2: ");
    float nota2 = entrada.nextFloat();
    entrada.nextLine();
    System.out.print("nome: ");
    String nome = entrada.nextLine();
    entrada.close();

    /*int idade = 30;
    String valor = Integer.toString(idade);

    String idade2 = "30";
    int valor2 = Integer.parseInt (idade2);

    */
    String idade = "30";
    float valor = Float.parseFloat(idade);
    
    System.out.println(nota2+nota);
    System.out.println(nota*nota2);
    System.out.println(nota/nota2);
    System.out.println(nota%nota2);
    System.out.println(nota-nota2);
    System.out.printf("A nota de %s é %.2f",nome ,nota2);
    
    
}  
    
}

