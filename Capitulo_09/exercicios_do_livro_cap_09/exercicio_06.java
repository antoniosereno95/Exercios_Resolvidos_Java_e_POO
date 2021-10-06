
package exercicios_do_livro_cap_09;

import java.util.Scanner;
public class exercicio_06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String a = new String();
        a = input.nextLine();
        
        StringBuilder b = new StringBuilder();
        for (char c : a.toCharArray()) {
            b.append(c).append(c);
        }
        String resultado =  b.toString();
        
        System.out.println(resultado);
        // peguei a resposta do forum la, ficou meia entendida.
    }
}
