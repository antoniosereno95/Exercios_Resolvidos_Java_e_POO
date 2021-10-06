
package exercicios_do_livro_cap_05;

import java.util.Scanner;
public class exercicio_15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i , contsim =0, contnao=0 , cont_m_sim=0 , cont_h=0 , cont_h_nao=0;
        char sexo , resp;
        double por = 0;
        
        for(i = 0; i<10 ; i++){
            sexo = input.next().charAt(0);
            resp = input.next().charAt(0);
            
            if(sexo =='h' || sexo =='H'){
                cont_h++;
                if(resp =='n' || resp =='N'){
                    cont_h_nao++;
                }
            }
            if(sexo =='m' || sexo =='M'){
                if(resp == 's' || resp=='S'){
                    cont_m_sim++;
                }
            }
            if(resp =='s' ||  resp=='S'){
                contsim++;
            }
            if(resp =='n' || resp =='N'){
                contnao++;
            }
        }
        
        por = (double)cont_h_nao * 100 / (double)cont_h;
        
        System.out.println("resp sim: " + contsim + "\nresp nao: " + contnao + "\nmulheres resp sim: " + cont_m_sim + "\nporcentagem de homens resp nao: " + por);
    }
}
