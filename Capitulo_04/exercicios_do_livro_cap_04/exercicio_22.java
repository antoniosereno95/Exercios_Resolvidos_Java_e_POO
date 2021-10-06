
package exercicios_do_livro_cap_04;

import java.util.Scanner;
public class exercicio_22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int idade;
        double peso;
        int grupo = 0;
        
        idade = input.nextInt();
        peso = input.nextDouble();
        
        if(idade < 20){
            if(peso<=60){
                grupo = 9;
            }else if(peso>60 && peso <=90){
                grupo = 8;
            }else if(peso > 90){
                grupo = 7;
            }
            
        }else if(idade >= 20 && idade <=50){
            if(peso<=60){
                grupo = 6;
            }else if(peso>60 && peso <=90){
                grupo = 5;
            }else if(peso > 90){
                grupo = 4;
            }
            
        }else if(idade > 50){
            if(peso<=60){
                grupo = 3;
            }else if(peso>60 && peso <=90){
                grupo = 2;
            }else if(peso > 90){
                grupo = 1;
            }
            
        }
        
        System.out.println("o grupo de risco dessa pessoa eh: " + grupo);
    }
}
