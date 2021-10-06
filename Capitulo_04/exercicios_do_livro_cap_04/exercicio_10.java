
package exercicios_do_livro_cap_04;
import java.util.Scanner;
public class exercicio_10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double fab;
        double novo_p = 0;
        
        fab = input.nextDouble();
        
        if(fab <= 12000.0){
            novo_p = fab  + fab*5/100; 
        }else if(fab>12000.0 && fab <=25000.0){
            novo_p = fab + fab*10/100 + fab*15/100;
        }else if(fab>25000.0){
            novo_p = fab + fab*15/100 + fab*20/100;
        }
        System.out.println(novo_p);
                
    }
}
