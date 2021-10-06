
package exercicios_do_livro_cap_08;

import java.util.Scanner;
public class exercicio_17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a , b;
        a = input.nextInt();
        b = input.nextInt();
        
        int mdc = max_div_comum(a,b);
        System.out.println("o maximo divisor comum de "+a+" e "+b+" é: "+mdc);
    }
    public static int max_div_comum(int a , int b){
        int mdc = 0, maior = 0;
        if(a > b){
            maior = a;
        }else {maior = b;}
        for(int i = 1 ; i < maior ; i ++){
            if(a%i==0 && b%i==0){
                mdc = i;
            }
        }
        return mdc;
    }
    
}
