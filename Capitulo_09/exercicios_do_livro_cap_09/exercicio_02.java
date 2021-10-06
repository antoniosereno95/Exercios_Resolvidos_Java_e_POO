
package exercicios_do_livro_cap_09;

import java.util.Scanner;
public class exercicio_02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String frase = new String();
        frase = input.nextLine();
        String[] palavras = frase.split(" ");
        for(int i = 0 ; i < palavras.length ; i++){
            System.out.println(palavras[i]);
        }
        
    }
}
