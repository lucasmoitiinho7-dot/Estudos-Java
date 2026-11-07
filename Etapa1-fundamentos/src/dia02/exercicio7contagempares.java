package dia02;

public class exercicio7contagempares {
    public static void main(String[] args) {
        
        int numero = 1;

        while( numero <=15){
            boolean par = numero % 2 == 0;                       
            if(par == true){
                System.out.println("Par: "+numero);
            }else{
                System.out.println("impar: "+numero);
            }                      
            numero++;
                                        
        }  
    }
}

// Verificando se o numero é par ou impar