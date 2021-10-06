
package exercicios_do_livro_cap_04;

import java.util.Scanner;
public class exercicio_19 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double altura;
        char sexo;
        double peso_ideal;
        
        System.out.print("sexo(h/m): ");
        sexo = input.next().charAt(0);
        
        System.out.print("altura(em metros): ");
        altura = input.nextDouble();
        
        if(sexo == 'm'){
            peso_ideal = (62.1*altura) - 44.7;
        }else{
            peso_ideal = (72.7*altura) - 58;
        }
        System.out.println(peso_ideal);
        
    }
}
