
package exercicios_do_livro_cap_08;

import java.util.Scanner;
public class exercicio_02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int horas, minutos , segundos;
        
        horas = input.nextInt();
        minutos = input.nextInt();
        segundos = input.nextInt();
        
        int resultado;
        resultado = horas_to_segundos(horas,minutos,segundos);
        
        System.out.println(resultado);
    }
    public static int horas_to_segundos(int h, int m , int s){
        int res;
        
        res = h*60*60 + m*60 + s;
        
        return res;
    }
    
}
