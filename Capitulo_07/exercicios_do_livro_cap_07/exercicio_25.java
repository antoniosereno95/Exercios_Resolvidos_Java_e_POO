
package exercicios_do_livro_cap_07;

import java.util.Scanner;
public class exercicio_25 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int linha = 5 , coluna = 10;
        int[][] a = new int[linha][coluna];
        int[] v = new int[10];//preços.
        int[] q = new int[10];//quantidade por armazem.
        int[] qp = new int[10];//quantidade total de cada produto.
        int maior = 0 , maior_produto;
        int menor = 999999999;
        int[] custo = new int[5];
        //recebo preço.
        for(int i = 0 ; i < a.length ; i++){
            v[i] = input.nextInt();
        }
        // recebo matriz de armazem por quantidade de cada produto.
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                a[i][j] = input.nextInt();
                q[i] += a[i][j];
                qp[j] += a[i][j];
                if(a[i][j] > maior){
                    maior = a[i][j];
                    maior_produto = j;
                }
                if(a[i][j] < menor){
                    menor = a[i][j];
                }
            }
        }
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                custo[i] += v[j] * a[i][j];
            }
        }
        
        //falta a parte de dar print em tudo mas eu to suaveee,
        //sao 00:00 de sabado, boa noitxerere.
        
        
        
    }
}
