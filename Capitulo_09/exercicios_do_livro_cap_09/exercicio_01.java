
package exercicios_do_livro_cap_09;

import java.util.Scanner;
public class exercicio_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String a = new String();
        a = input.nextLine();
        a = a.toUpperCase();
        System.out.println(a+"\n");
        String invertida = new StringBuilder(a).reverse().toString();
        System.out.println(invertida+"\n");
        
            invertida = invertida.replaceAll("A", "#");
            invertida = invertida.replaceAll("E", "#");
            invertida = invertida.replaceAll("I", "#");
            invertida = invertida.replaceAll("O", "#");
            invertida = invertida.replaceAll("U", "#");
            
        System.out.println(invertida+"\n");
    }
}
