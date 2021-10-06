
package exercicios_do_livro_cap_04;

import java.util.Scanner;
public class exercicio_02 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double nota1;
        double nota2;
        double media;
        
        nota1 = input.nextDouble();
        nota2 = input.nextDouble();
        
        media = (nota1+nota2)/2;
        
        if(media < 3.0){
            System.out.println("reprovado");
        }else if(media >= 3.0 && media < 7.0){
                    System.out.println("exame");
                      }else if(media >=7.0 && media <=10.0){
                          System.out.println("aprovado");
                      }
                            
                        
}
}