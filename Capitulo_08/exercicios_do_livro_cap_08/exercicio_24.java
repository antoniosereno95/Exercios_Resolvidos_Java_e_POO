
package exercicios_do_livro_cap_08;

import java.util.Scanner;
public class exercicio_24 {
    public static void main(String[] args){
        double[] t = new double[12];
        //a quetao manda nao se preocupar com temperaturas repetidas.
        double[] temperatura = RecebeTemperatura(t);
        
        double maior_temp = MaiorTemperatura(temperatura);
        
        int maior_mes = MaiorMes(temperatura , maior_temp);
        
        String nome_mes = NomeMes(maior_mes);
        
        System.out.println("A maior temperatura "+maior_temp+" ocorreu no mes "+nome_mes+" .");
    }
    public static double[] RecebeTemperatura(double[] a){
        Scanner input = new Scanner(System.in);
        double[] t = new double[a.length];
        for(int i = 0 ; i < t.length ; i++){
            t[i] = input.nextDouble();
        }      
        return t;
    } 
    public static double MaiorTemperatura(double[] a){
        double maior = 0;
        for(int i = 0 ; i <a.length ; i++){
            if(a[i] > maior){
                maior = a[i];
            }
        }
        return maior;
    }
    public static int MaiorMes(double[] a, double b){
        int mes = 0;
        for(int i = 0 ; i < a.length ; i ++){
            if(b == a[i]){
                mes = i;
            }
        }
        return mes;
    }
    public static String NomeMes(int a){
        String nome = null;
        if(a == 0){
            nome = "janeiro";
        }else if(a == 1){
            nome = "fevereiro";
        }else if(a == 2){
            nome = "março";
        }else if(a == 3){
            nome = "abril";
        }else if(a == 4){
            nome = "maio";
        }else if(a == 5){
            nome = "junho";
        }else if(a == 6){
            nome = "julho";
        }else if(a == 7){
            nome = "agosto";
        }else if(a == 8){
            nome = "setembro";
        }else if(a == 9){
            nome = "outubro";
        }else if(a == 10){
            nome = "novembro";
        }else if(a == 11){
            nome = "dezembro";
        }
        
        return nome;
    }
}
