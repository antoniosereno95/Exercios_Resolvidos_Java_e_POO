
package exercicios_do_livro_cap_08;

import java.util.Scanner;
public class exercicio_23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int lado1 = 0 , lado2 = 0 , lado3 = 0 ;
        String triangulo = null;
        String tipo = null;
        while(lado1 == 0){
            System.out.println("lado 1:");
            lado1 = input.nextInt();
        }
        while(lado2 == 0){
            System.out.println("lado 2:");
            lado2 = input.nextInt();
        }
        while(lado3 == 0){
            System.out.println("lado 3:");
            lado3 = input.nextInt();
        }
        
        triangulo = EhTriangulo(lado1,lado2,lado3);
        tipo = Tipo(lado1,lado2,lado3);
        if(triangulo == "um triangulo"){
        System.out.println("Os lados digitados formao "+triangulo+" de tipo "+tipo+" .");
        }else{
            System.out.println("Os lados digitados formao "+triangulo);
        }
    }
    
    public static String EhTriangulo(int a , int b, int c){
        String triangulo ;
        
        int chave_1 , chave_2 , chave_3;
        if(a <= b+c){
            chave_1 = 1;
        }else{chave_1 = 0; }
        if(b <= a+c){
            chave_2 = 1;
        }else{chave_2 = 0; }
        if(c <= a+b){
            chave_3 = 1;
        }else{chave_3 = 0; }
        
        if(chave_1 == 1 && chave_2 == 1 && chave_3 == 1){
          triangulo = "um triangulo";  
        }else{ triangulo = "um NAO triangulo"; }
        
        return triangulo;
    }
    
    public static String Tipo(int a , int b , int c){
        String tipo = null ;
        
        if( a == b || a == c || b == c ){
            if( a == b && b == c ){
                tipo = "equilatero";
            }else{
            tipo = "isoceles"; 
            }
        }
        if( a != b && a != c && b != c ){
           tipo = "escaleno"; 
        }
        
        return tipo;
    }
}
