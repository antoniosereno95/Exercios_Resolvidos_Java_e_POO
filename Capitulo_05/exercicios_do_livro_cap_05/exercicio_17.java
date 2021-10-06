
package exercicios_do_livro_cap_05;

import java.util.Scanner;
public class exercicio_17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int canal, pessoas = 0;
        int   contp = 0 ;     
        double por4 , por5 , por7, por12;
        int contp4=0 , contp5=0 , contp7 =0 , contp12=0;
        canal = 1;
        while(canal != 0){
            canal = input.nextInt();
            if(canal != 0){
                pessoas = input.nextInt();
            }
            if(canal == 4){
               
                contp4 = contp4 + pessoas; 
                contp = contp + pessoas;
            }
            if(canal == 5){
                
                contp5 = contp5 + pessoas; 
                contp = contp + pessoas;
            }
            if(canal == 7){
                
                contp7 = contp7 + pessoas;
                contp = contp + pessoas;
            }
            if(canal == 12){
                
                contp12 = contp12 + pessoas;
                contp = contp + pessoas;
            }
            
            if(canal == 0){    
                canal = 0;
            }else if(canal != 4 || canal != 5 || canal != 7 || canal != 12 ){
                canal = 1;
            }
        }
        
        por4 = contp4 *100 / contp;
        por5 = contp5 *100 / contp;       
        por7 = contp7 *100 / contp;
        por12 =contp12 *100 / contp;
        
        System.out.println("4: " + por4 + "\n5: " + por5 + "\n7: " + por7 + "\n12: " + por12);
    }
}
 
