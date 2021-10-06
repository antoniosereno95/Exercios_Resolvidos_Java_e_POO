
package Exercicios_do_livro_cap_03;

import java.util.Scanner;
public class exercicio_11 {
    
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        float d_maior;
        float d_menor;
        float area;
        d_maior = leitor.nextInt();
        d_menor = leitor.nextInt();
        area = (d_maior*d_menor)/2;
        System.out.println(area);
    }
    
}
