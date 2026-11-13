import java.util.Scanner;

public class exerc1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numero = new int[15];                //Aqui informo que a variavel terá 15 indices

        // int[] numeros = {1, 2,3,4}; Array já informado , Inicialização direta
         

        for(int i=0;i< numero.length;i++){                   /* Informo que o indice inicia em 0, ele vai rodar os numeros e enquanto ainda tiver espaço, adiciona 1 numero ou avança para a prox posição */
            System.out.print("Digite os numero :");
             numero[i]=entrada.nextInt();    //Array solicitado ao usuario.

        }for(int i=0;i< numero.length;i++){
            System.out.print(numero[i]+"-");
            
        }
        entrada.close();


        
    }
}

//Array solicitado com scanner e for
    
    

