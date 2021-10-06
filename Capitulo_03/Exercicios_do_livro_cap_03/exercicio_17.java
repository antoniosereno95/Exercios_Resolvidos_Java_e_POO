
package Exercicios_do_livro_cap_03;
import java.lang.Math;
import java.util.Scanner;
public class exercicio_17 {
    public static void main(String[] args){
        
        Scanner leitor = new Scanner(System.in);
        double r;
        double comprimento;
        double area;
        double volume;
        
        r = leitor.nextInt();
        
        comprimento = 6.28 * r;
        
        area = 3.14 * Math.pow(r,2);
        
        volume = 0.75 * 3.14 * Math.pow(r,3);
        
        System.out.println(comprimento +"\n"+ area +"\n"+ volume);
        
    }   
}
