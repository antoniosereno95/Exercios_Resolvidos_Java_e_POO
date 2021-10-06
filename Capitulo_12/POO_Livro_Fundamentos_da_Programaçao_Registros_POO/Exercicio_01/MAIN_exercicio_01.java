
package POO_cap_12.Exercicio_01;
import POO_cap_12.Exercicio_01.CARRO;
import java.util.Scanner;

public class MAIN_exercicio_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int c = 2;
        
        CARRO CARROS[];
        CARROS = new CARRO[c];
        for(int i = 0 ; i < c ; i++){
            CARROS[i] = new CARRO();
        }
        
        int ano_atual;
        System.out.println("digite o ano atual:");
        ano_atual = input.nextInt();
        
        for(int i = 0 ; i < c ; i++){
            CARROS[i].Setter_ano_atual(ano_atual);
        }
        
        for(int i = 0 ; i < c ; i++){
            System.out.println("digite o ano de fabricaçao do veiculo "+(i+1)+" :");
            int ano = input.nextInt();
            CARROS[i].Setter_ano_fabricacao(ano);
            
            System.out.println("digite a placa do veiculo "+(i+1)+" :");
            String placa = input.next();
            CARROS[i].Setter_placa(placa);
        }
        double b;
        for(int i = 0 ; i < c ; i++){
            b = CARROS[i].Imposta_a_pagar();
            System.out.println("\n"+b); 
        }
            
        
        
    }
}
