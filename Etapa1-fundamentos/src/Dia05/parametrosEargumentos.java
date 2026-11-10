package Dia05;

public class parametrosEargumentos {
    public static void soma(int numero1, int numero2){
        int resultado = numero1 + numero2;
        System.out.println(resultado);


    }
    public static void main (String[] args){

        soma(10, 30);
        soma(50 , 40);
        soma(35,55);
        soma(135,44);
        
    }
}
/*
Com a criação de paramentros e argumentos, podemos criar uma soma como exemplo reutilizavel, sem precisarmos deixar os numeros fixos dentro do metodo.
podendo assim enviar dados na mesma chamada

 */