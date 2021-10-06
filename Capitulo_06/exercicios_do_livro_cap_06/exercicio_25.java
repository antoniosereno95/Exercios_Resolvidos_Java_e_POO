
package exercicios_do_livro_cap_06;

import java.util.Scanner;
public class exercicio_25 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Double[] a = new Double[3];
        double maior = 0;
        
        for(int i=0 ; i < a.length;i++){
            a[i] = input.nextDouble();
            if(a[i] > maior){
                maior = a[i];
            }
        }
        
        for(int i=0 ; i < a.length; i++){
            a[i] = a[i]/maior;
        }
        
        for(int i=0 ; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.print("\n");
        
    }
}
