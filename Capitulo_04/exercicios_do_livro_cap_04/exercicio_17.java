
package exercicios_do_livro_cap_04;

import java.util.Scanner;
public class exercicio_17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int s = 4531;
        int senha;
        
        senha = input.nextInt();
        
        if(senha == s){
            System.out.println("senha correta.");
        }else System.out.println("senha incorreta");
    }
}
