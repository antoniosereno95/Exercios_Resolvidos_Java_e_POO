
package exercicios_do_livro_cap_07;

import java.util.Scanner;
public class exercicio_09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int linha = 5 , coluna=5 ;
        int[][] a = new int[linha][coluna];
        int numero;
        
        System.out.println("matriz a");
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("numero:");
        numero = input.nextInt();
        
        System.out.println("matriz numero*a:");
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                a[i][j] = numero * a[i][j];
                
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
        
        
    }  
}
