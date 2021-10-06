
package exercicios_do_livro_cap_07;


import java.util.Scanner;
public class exercicio_16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] a = new int[5][5];
        int[] linha = new int[5];
        int[] coluna = new int[5];
        
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                a[i][j] = input.nextInt();
                linha[i] += a[i][j];
                coluna[j] += a[i][j];
            }
        }
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
        
        System.out.print("\n");
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(linha[i]+" ");
        }
        System.out.print("\n");
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(coluna[i]+" ");
        }
        System.out.print("\n");
    
    }
}
