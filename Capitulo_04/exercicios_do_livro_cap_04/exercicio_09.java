
package exercicios_do_livro_cap_04;

import java.util.Scanner;
import java.lang.Math;
public class exercicio_09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double saldo;
        double credito;
        saldo = input.nextDouble();
        
        if(saldo<=200.0){
            credito = saldo*10/100;
            System.out.println(saldo + "  " + credito);
        }else if(saldo>200.0 && saldo<=300.0){
            credito = saldo*20/100;
            System.out.println(saldo + "  " + credito);
        }else if(saldo>300.0 && saldo<=400.0){
            credito = saldo*25/100;
            System.out.println(saldo + "  " + credito);
        }else if(saldo>400.0){
            credito = saldo*30/100;
            System.out.println(saldo + "  " + credito);
        }
        
    }
}
