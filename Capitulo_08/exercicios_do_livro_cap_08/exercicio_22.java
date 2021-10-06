
package exercicios_do_livro_cap_08;

import java.util.Scanner;
public class exercicio_22 {
    public static void main(String[] args){
        int linha = 10 , coluna = 5 ;
        int[][] a = new int[linha][coluna]; 
        
        int[][] m = LeMatriz(a);
        for(int i = 0 ; i < m.length ;  i++){
            for(int j = 0 ; j < m[i].length ; j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.print("\n");
        } 
        
        int soma = SomaAbaixoLinha6(m);
        
        System.out.println(soma);
    }
    
    public static int[][] LeMatriz(int[][]a){
        Scanner input = new Scanner(System.in);
        for(int i = 0 ; i < a.length ;  i++){
            for(int j = 0 ; j < a[i].length ; j++){
                a[i][j] = input.nextInt();
            }
        }
        return a;
    }
    
    public static int SomaAbaixoLinha6(int[][] b){
        int soma = 0 ;
        for(int i = 6 ; i < b.length ; i++){
            for(int j = 0 ; j < b[i].length ; j++){
                soma += b[i][j];
            }
        }
        return soma;
    }
    
}
