
package exercicios_do_livro_cap_05;

import java.util.Scanner;
public class exercicio_12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numero, i , j , gatilho = 0, conta_primo = 0;
        for(i=0;i<10;i++){
            numero = input.nextInt();
                for(j=numero-1 ; j>=2 ; j--){
                    if(numero%j==0){
                        gatilho = 2;
                    }
                    }
                if(gatilho==0 || numero == 1){
                    conta_primo++;
                }
            
        }
        
        System.out.println(conta_primo);
    }
}
