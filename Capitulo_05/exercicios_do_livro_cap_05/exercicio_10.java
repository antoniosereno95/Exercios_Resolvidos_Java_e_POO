
package exercicios_do_livro_cap_05;

import java.util.Scanner;
public class exercicio_10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i , numero , soma_par=0 , soma_impar=0;
        for(i=0;i<10;i++){
            numero = input.nextInt();
            
            if(numero%2 == 0){
                soma_par = soma_par + numero;
            }else {
                soma_impar = soma_impar + numero;
            }
        }
        System.out.println(soma_par + "  " + soma_impar);
    }
}
