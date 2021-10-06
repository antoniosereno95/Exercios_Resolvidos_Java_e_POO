
package exercicios_do_livro_cap_04;

import java.util.Scanner;
public class exercicio_01 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;
        
        nota1 = input.nextDouble();
        nota2 = input.nextDouble();
        nota3 = input.nextDouble();
        nota4 = input.nextDouble();
        
        media = (nota1 + nota2 + nota3 + nota4)/4;
        
        if(media >= 7.0){System.out.println("aprovado");
        }else {System.out.println("reprovado");}
        
    }
    
}
