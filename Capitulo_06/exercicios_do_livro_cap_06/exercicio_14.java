
package exercicios_do_livro_cap_06;

import java.util.Scanner;
public class exercicio_14 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String[] nome = new String[6];
    Double[] nota1 = new Double[6];
    Double[] nota2 = new Double[6];
    Double[] media = new Double[6];
    String[] situaçao = new String[2];
    double por_a = 0 , por_r = 0 ,soma_media=0 , media_classe;
    int cont_a =0 , cont_r = 0;
    
    for(int i = 0 ; i < nome.length ; i++){
        System.out.print("digite o nome do  aluno " + (i+1) +" :");
        nome[i] = input.nextLine();
    }
    
    for(int i = 0 ; i < nome.length ; i++){
        System.out.print("digite a primeira nota do " + nome[i] +" :");
        nota1[i] = input.nextDouble();
        System.out.print("digite a segunda nota do " + nome[i] +" :");
        nota2[i] = input.nextDouble();
    }
    
    for(int i = 0 ; i < nome.length ; i++){
           media[i] = (nota1[i] + nota2[i])/2;
           soma_media += media[i];
           
           if(media[i] >= 7.0 ){
               cont_a++;
               situaçao[i] = "aprovado";
           }else{
               situaçao[i] = "reprovado";
               cont_r++;
           }
    }
    
    por_a = cont_a*100/6;
    por_r = cont_r*100/6;
    media_classe = soma_media/6;
    
    for(int i = 0 ; i < nome.length ; i++){
        System.out.print("aluno: "+nome[i]+" --- "+"prova1: "+nota1[i]+" --- "+"prova2: "+nota2[i]+" --- "+"media: "+media[i]+" --- "+"situaçao: "+situaçao[i]+".\n");
    }
    
}
}
