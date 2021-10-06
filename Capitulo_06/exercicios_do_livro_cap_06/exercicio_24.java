
package exercicios_do_livro_cap_06;

import java.util.Scanner;
public class exercicio_24 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int[] a = new int[15];
        int cont=0 , numb = 0 , k=2;
        for(int i=0 ; i < a.length;i++){
            a[i] = input.nextInt();
            numb = a[i];
            if(numb == 1){
                k=1;
            }else if(numb == 2 || numb == 3){
                cont++;
            }else{
                for(int j = 3; j < numb ; j ++){
                    if(numb%j == 0 ){
                       k=1; //chave
                    }
                }
                if( k == 2 ){
                    cont++;
                }else{
                    k = 2;
                }
            }
        }
        
        int[] res = new int[cont];
        int l = -1;
        k = 2;
        for(int i=0 ; i < a.length;i++){
            numb = a[i];
            if(numb == 1){
                k=1;
            }else if(numb == 2 || numb == 3){
                l++;
                res[l] = numb;
            }else{
                for(int j = 3; j < numb ; j ++){
                    if(numb%j == 0 ){
                       k=1; //chave 
                    }
                }
                if( k == 2 ){
                    l++;
                    res[l] = numb;
                }else{
                    k = 2;
                }
            }
        }
        
        for(int i=0 ; i < res.length ; i++){
            System.out.print(res[i]+" ");
        }
        System.out.print("\n");
    } 
}
