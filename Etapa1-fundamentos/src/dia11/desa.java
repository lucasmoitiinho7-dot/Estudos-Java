package dia11;

public class desa {
    public static void main(String[] args) {
        String a = new String("Java");
        String b = new String("Java");

        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}

// Pergunta: por que o primeiro resultado é diferente do segundo, mesmo as duas variáveis contendo exatamente o texto "Java"?
//O == faz a comparação da letra a e b
// já o equals() realiza a comparação dos textos da string