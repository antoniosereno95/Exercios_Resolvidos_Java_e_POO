
package exercicios_do_livro_cap_04;

import java.util.Scanner;
public class exercicio_25 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double horas_extras;
        double horas_faltadas;
        double bonus = 0;
        double h;
      
        horas_extras = input.nextDouble();
        horas_faltadas = input.nextDouble();
        
        h = horas_extras - (2*horas_faltadas/3);
        
        if(h >= 2400){
            bonus = 500;
        }else if(h >= 1800 && h < 2400){
            bonus = 400;
        }else if(h >= 1200 && h < 1800){
            bonus = 300;
        }else if(h>=600 && h<1200 ){
            bonus = 200;
        }else if(h<600){
            bonus = 100;
        }
        
        System.out.println(bonus);
    }
}
