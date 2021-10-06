
package exercicios_do_livro_cap_05;

import java.util.Scanner;
public class exercicio_20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double m_ari , m_pon , nota1 , nota2 , nota3;
        int escolha , p1, p2 ,p3 ;
      
        System.out.println("Menu de opçoes:\n1.Media aritmetrica\n2.Media ponderada\n3.Sair");
        escolha = input.nextInt();
        switch(escolha){
            case 1:
                nota1 = input.nextDouble();
                nota2 = input.nextDouble();
                m_ari = (nota1 + nota2)/2;
                System.out.println(m_ari);
                
            case 2:
                nota1 = input.nextDouble();
                p1 = input.nextInt();
                nota2 = input.nextDouble();
                p2 = input.nextInt();
                nota3 = input.nextDouble();
                p3 = input.nextInt();
                m_pon = ((nota1*p1)+(nota2*p2)+(nota3*p3))/(p1+p2+p3);
                System.out.println(m_pon);
                
            case 3:
                break;
                
        }
    }
}
