
package exercicios_do_livro_cap_06;

import java.util.Scanner;

public class exercicio_22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] a = new int[3];
        int cont = -1;
        
        for(int i=0 ; i < a.length;i++){
            a[i] = input.nextInt();
            if(a[i] <= 0 ){
                cont++;
            }
        }
        
        int[] b = new int[cont];
        int j = 0;
        for(int i=0 ; i < a.length;i++){
            if(a[i] <= 0 ){
                i++;
            }else{
                b[j] = a[i];
                if( j < (cont-1) ){
                    j++;
                }
            }
        }
        
        for(int i=0 ; i < b.length;i++){
            System.out.print(b[i]+" ");
        }
        System.out.print("\n");
    }
}
