package dia02;

public class exercicio8 {
    public static void main(String[] args) {
        
        int numero = 1;
        int par = 0;
        int impar = 0;

        while(numero <=3865){
            if(numero % 2 == 0){
                par++;
            }else{
                impar++;
            }
            numero ++;       
                     
        }
        System.out.println("temos "+par+" numeros, pares");
        System.out.println("temos "+impar+" numeros, impares");      
    }
}

/* Por que o system ta fora do bloco do while ? Por que se ele ficar dentro do bloco ele vai imprimir o dados dos incrementadores e não é o queremos nesse programa
com eles foram imprimi os acumuladores que é oq o exercicio pede

o numero++ fica fora do if e else, pq independente do numero ser par ou impar ele sera incrementado com isso o novo numero é verificado no while tanto sequencia até cumprir a condição.
 */