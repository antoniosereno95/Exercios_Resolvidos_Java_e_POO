
package Exercicios_do_livro_cap_03;

import java.util.Scanner;

public class exercicio_25_de_vdd {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        double hora;
        double minutos;
        double segundos;
         hora = leitor.nextDouble();
         
         minutos = hora * 60;
         
         segundos = minutos*60;
    }
}
