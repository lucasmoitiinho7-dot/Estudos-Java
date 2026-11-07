package dia02;

public class exercicio06soma {
    public static void main(String[] args) {


        int numero =5;
        int soma =0;
  

        do{
            
            int resultado = numero + soma;                
            System.out.println(numero+"+"+soma+"="+resultado);
            soma++;           
        }while(soma <=10);

        System.out.println("Total: "+soma);


    
    }
}





//Versao que acumula os numeros de 1 ate 5

/*package dia02;

//public class exercicio06soma {
    public static void main(String[] args) {

        int numero = 1;
        int soma = 0;

        do {
            soma = numero + soma;
            System.out.println("Soma de 1 até 5 = " + soma);
            numero++;
        } while (numero <= 5);

        System.out.println("Total: " + soma);
    }
} */