
package exercicios_do_livro_cap_08;

import java.util.Scanner;
public class exercicio_21 {
    public static void main(String[] args){
       int linha = 3 , coluna = 3;
       int[][] a = new int[linha][coluna];
       int maior_numero;
       
       int[][] matriz = RecebeMatriz(a);
       for(int i = 0 ; i < matriz.length ; i++){
            for(int j = 0 ; j < matriz[i].length ; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.print("\n");
        }
       
       maior_numero =  MaiorAcimaDiagonalPrincipal(matriz);
       System.out.println("\n"+maior_numero);
      
    }
    
    public static int[][] RecebeMatriz(int[][]m){
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[m.length][m.length];
        for(int i = 0 ; i < matriz.length ; i++){
            for(int j = 0 ; j < matriz[i].length ; j++){
                matriz[i][j] = input.nextInt();
            }
        }
        return matriz;
    }
    
    public static int MaiorAcimaDiagonalPrincipal(int[][]m){
        int maior = 0;
        for(int i = 0 ; i < m.length ; i++){
            for(int j = 0 ; j < m[i].length ; j++){
                if(i <= j){
                    if(m[i][j] > maior){
                        maior = m[i][j];
                    }
                }
            }
        }
        return maior;
    }
    
}
