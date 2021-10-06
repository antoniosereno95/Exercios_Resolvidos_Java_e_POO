
package exercicios_do_livro_cap_09;

import java.util.Scanner;
public class exercicio_04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String frase = new String();
        frase = input.nextLine();
        frase = frase.trim();
        frase = frase.replaceAll("  ", " ");
        System.out.println(frase);
    }
}
