package dia06;

public class exercicio2 {
    public static double conversor (int a){
        return a;
    }
        public static int conversor (double a){
            return (int) a;
        }

        public static double conversor (int a, double b){
            return ( a +  b);
        }

        public static void main(String[] args) {
            
            double armz2 = conversor(250);
            System.out.println(armz2);  



            int armz1 = conversor((double)25);
            System.out.println(armz1);

            double armz3 = conversor(25, 26.3);            
            System.out.println(armz3);

            
            
        }
        
                   



    }


/*
Crie uma classe com o nome Conversor e três métodos chamados converter:
1. Recebe um int e retorna esse número convertido para double.
2. Recebe um double e retorna esse número convertido para int.
3. Recebe um int e um double e retorna a soma dos dois como double. */