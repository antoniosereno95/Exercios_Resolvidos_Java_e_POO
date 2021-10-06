
package exercicios_do_livro_cap_05;

import java.util.Scanner;
public class exercicio_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a , b , c , d ;
        int a_c =0 , b_c= 0 , c_c= 0 , d_c= 0;
        int i;
        
        for(i=0 ; i < 4 ; i++){
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();
            d = input.nextInt();
            
            System.out.println(" "+a+" "+b+" "+c+" "+d+"\n");
            // A maior
            if(a>b && a>c && a>d){
                a_c = a;
                if(b>c && b>d && c>d){
                   b_c = b;
                   c_c = c;
                   d_c = d;
                }
                if(b>c && b>d && d>c){
                   b_c = b;
                   c_c = d;
                   d_c = c;
                }
                if(c>b && c>d && b>d){
                   b_c = c;
                   c_c = b;
                   d_c = d;
                }
                if(c>b && c>d && d>b){
                   b_c = c;
                   c_c = d;
                   d_c = b;
                }
                if(d>b && d>c){
                    b_c = d;
                    if(b>c){
                        c_c = b;
                        d_c = c;
                    }else{
                        c_c = c;
                        d_c = b;
                    }
                }
            }
            // B maior
            if(b>a && b>c && b>d){
                a_c = b;
                if(a>c && a>d){
                    b_c = a;
                    if(c>d){
                        c_c = c;
                        d_c = d;
                    }else {
                        c_c = d;
                        d_c = c;
                    }
                }
                if(c>a && c>d){
                    b_c = c;
                    if(a>d){
                        c_c = a;
                        d_c = d;
                    }else{
                        c_c = d;
                        d_c = a;
                    }
                }
                if(d>a && d>c){
                    b_c = d;
                    if(a>c){
                        c_c = a;
                        d_c = c;
                    }else{
                        c_c = c;
                        d_c = a;
                    }
                }
            }    
            //C maior
            if(c>a && c>b && c>d){
                a_c = c;
                if(a>b && a>d){
                    b_c = a;
                    if(b>d){
                        c_c = b;
                        d_c = d;
                    }else{
                        c_c = d;
                        d_c = c;
                    }
                }
                if(b>a && b>d){
                    b_c = b;
                    if(a>d){
                        c_c = a;
                        d_c = d;
                    }else{
                        c_c = d;
                        d_c = a;
                    }
                }
                if(d>b && d>a){
                    b_c = d;
                    if(a>b){
                        c_c = a;
                        d_c = b;
                    }else{
                        c_c = b;
                        d_c = a;
                    }
                }
            }
            //D maior
            if(d>a && d>b && d>c){
                a_c = d;
                if(a>b && a>c){
                    b_c = a;
                    if(b>c){
                        c_c = b;
                        d_c = c; 
                    }else{
                        c_c = c;
                        d_c = b;
                    }
                }
                if(b>a && b>c){
                    b_c = b;
                    if(a>c){
                        c_c = a;
                        d_c = c;
                    }else {
                        c_c = c;
                        d_c = a;
                    }
                }
                if(c>a && c>b){
                    b_c = c;
                    if(a>b){
                        c_c = a;
                        d_c = b;
                    }else {
                        c_c = b;
                        d_c = a;
                    }
                }
            }
            System.out.println("em ordem decrescente: " + "\n" + a_c + " " + b_c + " " + c_c + " " + d_c + "\n");
            
            System.out.println("em ordem crescente: " + "\n" + d_c + " " + c_c + " " + b_c + " " + a_c + "\n");
        
        }// fim do for
    }
}
