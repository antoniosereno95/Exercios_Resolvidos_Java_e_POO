
package Exercicios_do_livro_cap_03;

import java.util.Scanner;

public class exercicio_22 {
    
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        double lados;
        double diagonais;
        lados = leitor.nextInt();
        diagonais = lados*((lados - 3)/2);
        System.out.println(diagonais);
    }
}
