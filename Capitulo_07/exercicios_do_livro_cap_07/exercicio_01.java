
package exercicios_do_livro_cap_07;

import java.util.Scanner;
public class exercicio_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int linha = 3 , coluna = 5;
        int[][] a = new int[linha][coluna];
        int i , j;
        int cont=0;
        
        //pega os numero e armazena na matriz percorenco o caminho linha coluna
        //que é o mesmo percurso que a gente faz quando vai ler.
        for(i=0; i < a.length ; i++){
            for(j = 0 ; j <a[i].length ; j++){
                System.out.print("digite o numero que fica na linha " + (i+1)+" e na coluna "+(j+1)+" : ");
                a[i][j] = input.nextInt();
                if(a[i][j]>=15 && a[i][j]<=20){
                    cont++;
                }
            }
        }
        //aqui ele printa a matriz do jeito que ela foi digitada.
        for(i=0; i < a.length ; i++){
            for(j = 0 ; j <a[i].length ; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
        
        System.out.println("\n"+cont);
    }
}
