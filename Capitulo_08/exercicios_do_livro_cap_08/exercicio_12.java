
package exercicios_do_livro_cap_08;

import java.util.Scanner;
public class exercicio_12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x , z , resp;
        x = input.nextInt();
        z = input.nextInt();
        resp = f(x,z);
        System.out.println(resp);
    }    
    public static int f(int x ,  int z){
        int k = 1;
        for(int i = 0; i < z ;i++ ){
            k *= x; 
        }
        return k;
    }
}
