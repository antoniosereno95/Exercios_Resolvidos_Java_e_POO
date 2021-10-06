
package exercicios_do_livro_cap_08;

import java.util.Scanner;
public class exercicio_04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int raio;
        double volume;
        raio = input.nextInt();
        volume = f(raio);
        
        System.out.println(volume);
    }
    public static double f(int r){
        double v;
        v = 4*(Math.pow(r,3))/3;
        return v;
    }
}
