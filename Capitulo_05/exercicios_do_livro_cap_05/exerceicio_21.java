
package exercicios_do_livro_cap_05;

import java.util.Scanner;
public class exerceicio_21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int candidato;
        double por_nulo =0 , por_branco =0;
        int i ,cont_votos=0 , cont1 = 0 , cont2 =0 , cont3 = 0 ,cont4=0 , contn=0 , contb = 0;
        
        i=1;
        while( i == 1 ){
            candidato = input.nextInt();
            if(candidato == 0){
                i=0;
            }else{ 
                cont_votos++;
                        if(candidato == 1){
                            cont1++;
                        }
                        if(candidato == 2){
                            cont2++;
                         }
                        if(candidato == 3){
                            cont3++;
                        }
                        if(candidato == 4){
                            cont4++;
                        }
                        if(candidato == 5){
                            contn++;
                        }
                        if(candidato == 6){
                            contb++;
                        }
                        if(candidato > 6){
                            System.out.println("numero invalido");
                        }
                    }
            
                }
        
        por_nulo = contn*100 / cont_votos;
        por_branco = contb*100 / cont_votos;
        
        System.out.println("\ncandidato 1:" + cont1 +"\ncandidato 2:" + cont2 + "\ncandidato 3:" + cont3 + "\ncandidato 4:" + cont4 + "\nvotos nulos: "+ contn + "\nvotos em branco:" + contb + "\nporcentagem de votos nulos:"+ por_nulo + "\nporcentagem de votos brancos:" + por_branco);
        
    }
}
