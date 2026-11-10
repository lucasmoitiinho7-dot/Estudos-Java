package Dia05;

public class escobo {
    
    public static void exemplo(){
        int numero = 20;
        System.out.println(numero);
    }
    public static void outroExemplo(){
        int numero = 20;
        System.out.println(numero);
    }

}

/*
Podemos ter variáveis com o mesmo nome em métodos diferentes porque cada uma pertence ao seu próprio escopo.

Entretanto, a variável numero criada em exemplo() não pode ser acessada diretamente em outroExemplo(). */
