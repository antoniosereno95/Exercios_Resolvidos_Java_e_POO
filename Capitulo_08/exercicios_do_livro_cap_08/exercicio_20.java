
package exercicios_do_livro_cap_08;

import java.util.Scanner;
public class exercicio_20 {
    public static void main(String[] args){
        double[] respostas = medias();
        System.out.println("A media salarioal: "+respostas[0]+" ;");
        System.out.println("A media de filhos: "+ respostas[1]+" ;");
        System.out.println("O maior salario: "+ respostas[2]+" ;");
        System.out.println("A por centagem de pessoas que tem salario inferior a 380 reais: "+respostas[3]+"% .");
    }
    
    public static double[] medias(){
        Scanner input = new Scanner(System.in);
        double[] medias = new double[4];
        double soma_filhos = 0 ; 
        double soma_sal = 0;
        double salario = 0 ;
        int filhos, cont_pessoas = 0 ,cont_sal_inf_380=0 ;
        double maior_sal = 0;
        while(salario != -1){
          System.out.println("digite o salario da pessoa "+cont_pessoas+" : ");
          salario = input.nextDouble();
          if(salario!= -1){
          soma_sal += salario;
          if(salario < 380.0 ){
              cont_sal_inf_380++;
          }
          if(salario > maior_sal){
              maior_sal = salario;
          }
          System.out.println("digite o numero de filhos da pessoa "+cont_pessoas+" : ");  
          filhos = input.nextInt();
          soma_filhos += filhos;
          
          cont_pessoas++;
          }
        }
        double media_salarial = soma_sal / cont_pessoas;
        double media_filhos = soma_filhos / cont_pessoas;
        double por = cont_sal_inf_380*100 / cont_pessoas;
        
        medias[0] = media_salarial;
        medias[1] = media_filhos;
        medias[2] = maior_sal;
        medias[3] = por;       
        return medias;
    }
}
