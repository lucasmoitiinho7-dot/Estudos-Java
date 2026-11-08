
public class pesquisabinaria{
    public static int pesquisaBinaria(int[] arr,int item){
       
        int baixo = 0;
        int alto = arr.length -1;

        while( baixo <= alto){
            int meio = (baixo + alto) /2;
            int chute = arr[meio];

            if(chute == item){
            return meio;            
        } else if( chute > item){
            alto = meio -1;

        }else{
            baixo = meio + 1;
            
        }
        }return -1;

    } public static void main(String[] args) {

        int[] minhalista ={1, 3, 5, 7, 9, 11,13};

        System.out.println(pesquisaBinaria(minhalista, 3));
        System.out.println(pesquisaBinaria(minhalista, -1));

        
    }
}