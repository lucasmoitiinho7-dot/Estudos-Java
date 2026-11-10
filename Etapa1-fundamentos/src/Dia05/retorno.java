package Dia05;

public class retorno {
    public static int soma(int numero1, int numero2) {
        int resultado = numero1 + numero2;
        return resultado;
        
    }
    
    public static void main(String[]args){
        int total = soma (10,30);
        int total2 = soma (35,44);
        System.out.println(total2);
        System.out.println(total);

    }
}
/*Incluindo o return no metodo, eu tiro o void, e ele passa a receber o valores,

 */