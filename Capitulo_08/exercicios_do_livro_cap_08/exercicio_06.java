
package exercicios_do_livro_cap_08;

import java.util.Scanner;
public class exercicio_06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double h ; // em metros
        char s; // (h ou m)
        double peso_i;
        h = input.nextDouble();
        s = input.next().charAt(0);
        
        peso_i = f(h,s);
        System.out.println(peso_i);
    }
    public static double f(double h , char m ){
        double peso = 0;
        if(m == 'm'){
            peso = 62.1*h - 44.7;
                    
        }else if(m == 'h'){
            peso = 72.7*h - 58;
            
        }
        peso = Math.ceil(peso);
        return peso;
    }
    
}
