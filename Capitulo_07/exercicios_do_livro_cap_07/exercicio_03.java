
package exercicios_do_livro_cap_07;

import java.util.Scanner;
public class exercicio_03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] a = new int[2][2];
        int maior = 0 , menor = 999999999;
        int l_maior = 0 , c_maior = 0 , l_menor = 0, c_menor = 0;
        
        for(int i = 0; i<a.length ; i++){
            for(int j = 0; j<a[i].length ; j++){
                a[i][j] = input.nextInt();
                if(a[i][j] > maior){
                    maior = a[i][j];
                    l_maior = i;
                    c_maior = j;
                }
                if(a[i][j] < menor){
                    menor = a[i][j];
                    l_menor = i;
                    c_menor = j;
                }
            }
        }
        System.out.println("O "+maior+" é o mair numero da matriz e esta localizado na posiçao ["+l_maior+"]["+c_maior+"].");
        System.out.println("O "+menor+" é o menor numero da matriz e esta localizado na posiçao ["+l_menor+"]["+c_menor+"].");
        
    }
}
