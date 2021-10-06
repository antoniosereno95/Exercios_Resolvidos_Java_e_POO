
package exercicios_do_livro_cap_05;

import java.util.Scanner;
public class exercicio_25 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double investimento, juros_pagos =0 , total =0;
        int codigo=1, tipo , tempo=0;
        
        while(codigo > 0){
            System.out.print("codigo de cliente:");
            codigo = input.nextInt();
            if(codigo>0){
            System.out.print("tipo de investimento:");
            tipo = input.nextInt();
            if(tipo >3 || tipo<=0){
                System.out.println("opçao invalida");
            }else if(tipo ==1){
                System.out.println("investimento:");
                investimento = input.nextDouble();
                System.out.println("tempo em meses:");
                tempo = input.nextInt();
                juros_pagos = 1;
                juros_pagos = investimento * tempo * (1.5/100);
                total = investimento + juros_pagos;
                System.out.println("codigo:" + codigo + "\ninvestimento:" + investimento + "\njuros pagos:" + juros_pagos + "\nmontante:" + total);
            }else if(tipo ==2){
                System.out.println("investimento:");
                investimento = input.nextDouble();
                System.out.println("tempo em meses:");
                tempo = input.nextInt();
                juros_pagos = 2;
                juros_pagos = investimento * tempo * (2/100);
                total = investimento + juros_pagos;
                System.out.println("codigo:" + codigo + "\ninvestimento:" + investimento + "\njuros pagos:" + juros_pagos + "\nmontante:" + total);
            }else if(tipo ==3){
                System.out.println("investimento:");
                investimento = input.nextDouble();
                System.out.println("tempo em meses:");
                tempo = input.nextInt();
                juros_pagos = 3;
                juros_pagos = investimento * tempo * (4/100);
                total = investimento + juros_pagos;
                System.out.println("codigo:" + codigo + "\ninvestimento:" + investimento + "\njuros pagos:" + juros_pagos + "\nmontante:" + total);
            }
        }
        }
    }
}
