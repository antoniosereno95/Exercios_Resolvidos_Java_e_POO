
package exercicios_do_livro_cap_06;

import java.util.Scanner;
public class exercicio_13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nome[] = new String[8];
        double[] notas = new double[8];
        double media =0 , soma=0;
        
        for(int i = 0 ; i< nome.length ; i++){
            System.out.print("Digite o nome do "+(i+1)+" aluno: ");
            nome[i]= input.nextLine();
            }
       for(int i = 0 ; i< nome.length ; i++){   
            System.out.print("Digite a nota do "+nome[i]+": ");
            notas[i]= input.nextDouble();
            soma += notas[i];
        }
        media = soma/8;
        System.out.print("Relatorios de notas");
        for(int i =0 ; i< nome.length ; i++){
            System.out.print("\n"+nome[i]+ " "+ notas[i]);
        }    
        System.out.println("Media da classe = "+media);
    }
}
