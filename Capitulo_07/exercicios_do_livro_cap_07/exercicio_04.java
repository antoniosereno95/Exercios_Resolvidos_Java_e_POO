
package exercicios_do_livro_cap_07;

import java.util.Scanner;
public class exercicio_04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int T_turma = 3;
        String[] nome = new String[T_turma];
        double[][] a = new double[T_turma][5];
        double med_classe = 0;
        double soma_classe = 0;
        
        for(int i = 0; i< nome.length ; i++){
            nome[i]= input.nextLine();
        }
        for(int i = 0; i < a.length ; i++){
            System.out.println("notas do aluno "+nome[i]+" : ");
            for(int j = 0; j < a[i].length ; j++){
                a[i][j] = input.nextDouble();
                soma_classe += a[i][j]; 
            }
            System.out.print("\n");
        }
        med_classe = soma_classe / T_turma;
      
        String[] situaçao = new String[T_turma];
        double soma_a = 0 ;
        double[] media_a = new double[T_turma];
        for(int i = 0; i < a.length ; i++){
            System.out.print(" o aluno "+nome[i]+" teve notas ");
            for(int j = 0; j < a[i].length ; j++){
                System.out.print(a[i][j]+" ");
                soma_a += a[i][j];
            }
            media_a[i] = soma_a / 5;
            
            if(media_a[i] >= 7.0){
                    situaçao[i] = "aprovado";
                }else if(media_a[i] >= 3.0 && media_a[i] < 7.0){
                    situaçao[i] = "exame";
                }else if(media_a[i] < 3.0){
                    situaçao[i] = "reprovado";
                }
            
            System.out.print("e teve media igual a "+media_a[i]+" e portanto esta com status semestral: "+situaçao[i]);
            soma_a = 0;
            System.out.print("\n");
        }
        
        System.out.println("A media da turma é "+med_classe);
    }
}
