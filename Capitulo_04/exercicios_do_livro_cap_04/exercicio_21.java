
package exercicios_do_livro_cap_04;

import java.util.Scanner;
public class exercicio_21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double preço;
        int pro;
        String regiao = null;
        
        preço = input.nextDouble();
        pro = input.nextInt();
        
        if(pro ==1){
            regiao = new String("sul");
        }else if(pro ==2){
            regiao = new String("norte");
        }else if(pro ==3){
            regiao = new String("leste");
        }else if(pro ==4){
            regiao = new String("oeste");
        }else if(pro==5 || pro==6){
            regiao = new String("nordeste");
        }else if(pro==7 || pro==8 || pro==9){
            regiao = new String("sudeste");
        }else if(pro>=10 && pro <=20){
            regiao = new String("centro-oeste");
        }else if(pro>=21 && pro<=30){
            regiao = new String("nordeste");
        }
        
        System.out.println(regiao);
    }
}
