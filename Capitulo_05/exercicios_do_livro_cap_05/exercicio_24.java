
package exercicios_do_livro_cap_05;

import java.util.Scanner;
public class exercicio_24 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double numero = -1, maior = 0, menor = 1000000000;
        while(numero != 0){
            numero = input.nextDouble();
            if(numero!=0){
            if(numero<0){
                System.out.println("numero invalido");
            }else{
                if(numero < menor){
                    menor = numero;
                }
                if(numero > maior){
                    maior = numero;
                }
            }
            }
        }
        System.out.println("maior numero:" + maior + "\nmenor numero:" + menor);
    }
}
