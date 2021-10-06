
package exercicios_do_livro_cap_07;

import java.util.Scanner;
public class exercicio_23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] a = new int[3][4];
        int cont_par = 0 , soma_impares = 0 ,soma = 0 , media = 0 , cont = 0;
        
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                a[i][j] = input.nextInt();
                if(a[i][j]%2 == 0){
                  cont_par++;
                }
                if(a[i][j]%2 != 0){
                  soma_impares += a[i][j];
                }
                soma += a[i][j];
                cont++;
            }
        }
        media = soma/cont;
    
        System.out.println(cont_par+"\n"+soma_impares+"\n"+media);
    
    }
}
