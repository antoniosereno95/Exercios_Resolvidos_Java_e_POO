
package exercicios_do_livro_cap_08;


public class exercicio_18 {
    public static void main(String[] args){
        int[] primos = primos();
        for(int i = 0 ; i <primos.length ; i++){
            System.out.print(primos[i]+" ");
        }
        System.out.print("\n");   
        
    }
    public static int[] primos(){
        int[] primos = new int[3];
        int numero = 100;
        int chave = 0;
        int k = 0, l = 0;
        
        while(l < 3){
            for(int j = (numero - 1) ; j > 1 ; j--){
                if(numero%j == 0){
                    chave = 1;
                }
            }
            if(chave == 0){
                primos[k] = numero;
                if(k < 2){k++;}
                l++;
                }
            numero++;
            chave = 0;
        }
        
        return primos;
    }

}
