
package exercicios_do_livro_cap_08;

import java.util.Scanner;
public class exercicio_25 {
    public static void main(String[] args){
        int aluno = 10, nota = 5;
        double[][] a = new double[aluno][nota];
        
        double[][] matriz_curricular = RecebeMatriz(a);
        
        double[] media_aritimetrica = MediaA(matriz_curricular);
        
        for(int i = 0 ; i < media_aritimetrica.length ; i++){
            System.out.print("A media do aluno "+matriz_curricular[i][0]+" foi: "+media_aritimetrica[i]+"\n");
        }
        System.out.print("\n");
        
        int cont_rec = Recuperaçao(media_aritimetrica);
        System.out.println("A quantidade de alunos em recuperaçao é: "+cont_rec);
        
    }
    
    public static double[][] RecebeMatriz(double[][] a){
        Scanner input = new Scanner(System.in);
        for(int i = 0 ; i < a.length ; i++){
            System.out.println("Digite os codigos do aluno " +(i+1)+ " :");
            a[i][0] = input.nextDouble();
        }
        for(int i = 0 ; i < a.length ; i++ ){
            for(int j = 1 ; j < a[i].length ; j++ ){
                System.out.println("digite as notas do aluno "+a[i][0]+", nota"+j+" : ");
                a[i][j] = input.nextDouble();
            }
        }
        return a;
    }
    
    public static double[] MediaA(double[][] a){
        double[] soma = new double[a.length];
        double[] media = new double[a.length];
        for(int i = 0 ; i < a.length ; i++){
           for(int j = 1 ; j < a[i].length ; j++){
               soma[i] += a[i][j];
           }
        }
        for(int i = 0 ; i < media.length ; i++){
            media[i] = soma[i] / 4;
        }
        return media;
    }
    
    public static int Recuperaçao(double[] a){
        int cont = 0;
        for(int i = 0 ; i < a.length ; i ++){
            if(a[i] <= 6.0){
               cont++; 
            }  
        }
        return cont;
    }
    
}
