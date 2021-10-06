
package exercicios_do_livro_cap_07;

import java.util.Scanner;
public class exercicio_02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] a = new int[2][4];
        int cont1=0, cont2=0 , par=0 , contpar=0 , media = 0;
        int i , j;
        for( i = 0 ; i < a.length ; i++){
            for( j = 0 ; j < a[i].length ; j++){
              a[i][j] = input.nextInt();
              
                if(a[i][j] >= 12){ 
                    if(a[i][j] <= 20){
                        if(i==0){cont1++;}
                        if(i==1){cont2++;}
                    }
                }
                if(a[i][j]%2==0){
                  par += a[i][j];
                  contpar++;
                 }
            }
        }
        for( i = 0 ; i < a.length ; i++){
            for( j = 0 ; j < a[i].length ; j++){
              System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
        media = par / contpar;
        System.out.println("na linha 1 temos "+cont1+" numeros entre 12 e 20 e na linha 2 temos "+cont2+" numeros dentro do mesmo intervalo.");
        System.out.println("A media de todos os numeros pares da matriz é: "+media);
        
    }
}
