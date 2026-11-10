package Dia05;

public class atividade03 {
   public static  boolean verificarIdade(int idade){
    if(idade >=18){
        return true;        
    }else{
        return false;
    }

   }
    public static void  main (String[] args){
        boolean resultado = verificarIdade(35);
        System.out.println(resultado);


    }

    }


    /*
    Crie um método chamado verificarIdade().
1. Receba uma idade como parâmetro.
2. Retorne um boolean.
3. Se a idade for maior ou igual a 18, retorne true.
4. Caso contrário, retorne false. */