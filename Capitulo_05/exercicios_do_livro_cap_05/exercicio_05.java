
package exercicios_do_livro_cap_05;

public class exercicio_05 {
    public static void main(String[] args){
        
        int i , j, conta;
        
        for(i = 0 ; i <=10 ; i ++){
            System.out.print("\n");
            for(j = 0 ; j<=10 ; j++){
                conta = i * j;
                System.out.print( i + " X " + j + " = " + conta + "\n");
            }
        }
    }
}
