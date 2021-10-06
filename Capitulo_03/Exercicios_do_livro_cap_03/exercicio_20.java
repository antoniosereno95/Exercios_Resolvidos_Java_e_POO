
package Exercicios_do_livro_cap_03;

import java.util.Scanner;
import java.lang.Math;

public class exercicio_20 {
    
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        double angulo;
        double angulo_graus;
        double distancia;
        double escada;
        
        angulo_graus = leitor.nextInt();
        distancia = leitor.nextInt();
        angulo = Math.toRadians(angulo_graus);
        //hipotenusa = cateto adj sobre o coseno do angulo.
        escada = distancia / Math.cos(angulo);
        System.out.println(escada);
    }
}
