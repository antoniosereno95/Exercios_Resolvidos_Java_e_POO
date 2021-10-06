
package Exercicio_06;

import java.util.Scanner;
public class Main_cadastro_banco {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int VAR = 2;
        
        
        /*
        OQ eu nao consegui fazer nessa questao foi a etapa do 
        criar um novo cadastro toda vez que necessario.
        pois eu so aprendi a criar um vetor de registro de numero limitado.
        no caso desta questao o numero limitador é esse VAR.
        */

        
        //contruir as contas e os clientes.
        Numero_conta  Conta[];// numero do cliente e saldo ...
        Conta = new Numero_conta[VAR];
        for(int i = 0 ; i < VAR ; i ++){
            Conta[i] = new Numero_conta();
        }
        
        Numero_do_cliente Cliente[];//telefone ...
        Cliente = new Numero_do_cliente[VAR];
        for(int i = 0 ; i < VAR ; i++){
            Cliente[i] = new Numero_do_cliente();
        }
        
        //main
        char resp = 'S';
        while(resp == 'S'){
            
            System.out.println("Digite o numero do cliente titular: ");
            int titular = input.nextInt();
            while(titular <= 0){
                System.out.println("erro, tente denovo.");
                titular = input.nextInt();
            }
            
            boolean ok = false;
            int slot = 0;
            for(int i = 0 ; i < VAR ; i++){
                if(titular == Conta[i].getNumero_do_cliente()){
                    ok = true;
                    slot = i;
                }
            }
            if(ok == false){
                System.out.println("conta nao encontrada.");
                System.out.println("deseja cadastrar uma nova conta para este numero de cliente?(S/N)");
                char L;
                L = input.next().charAt(0);
                    while(L != 'S' && L != 'N'){
                        System.out.println("erro, denovo");
                        L = input.next().charAt(0);
                    }
                if(L == 'S'){
                    int slot2 = Integer.MAX_VALUE;
                    for(int i = 0 ; i < VAR ; i++){
                       if(Conta[i].getNumero_do_cliente() == 0){
                           slot2 = i;
                       } 
                    }
                    if(slot2 == Integer.MAX_VALUE){
                        System.out.println("banco de dados cheio, infelizmente nao poderemos proceder com o cadastro");
                    }else{
                        System.out.println("ahcamos um slot vago no banco de dados, slot "+slot2+".");
                        Cliente[slot2].setNumero_do_cliente(titular);
                        Conta[slot2].setNumero_do_cliente(titular);
                        
                        System.out.println("digite o nome para cadastro: ");
                        String n = input.next();
                        Cliente[slot2].setNome(n);
                        
                        System.out.println("digite um telefone para cadastro: ");
                        int t = input.nextInt();
                        Cliente[slot2].setTelefone(t);
                        
                        System.out.println("digite um endereço para cadastro: ");
                        String e = input.next();
                        Cliente[slot2].setEndereço(e);
                        
                        System.out.println("cadastro completo!olha so como ficou:");
                        System.out.println("numero do cliente: "+Cliente[slot2].getNumero_do_cliente()+" ; nome: "+Cliente[slot2].getNome()+" ; telefone: "+Cliente[slot2].getTelefone()+" ; endereço: "+Cliente[slot2].getEndereço()+" ;");
                    }
                    
                }else{
                    System.out.println("ok...");
                    System.out.println("deseja encerrar o programa?(S/N)");
                    resp = input.next().charAt(0);
                    while(resp != 'S' && resp != 'N'){
                        System.out.println("erro, denovo");
                        resp = input.next().charAt(0);
                    }
                }
                
            }else{
                System.out.println("conta encontrada, tudo ok!");
                System.out.println("deseja verificar o saldo da conta?(S/N)");
                char L;
                L = input.next().charAt(0);
                    while(L != 'S' && L != 'N'){
                        System.out.println("erro, denovo");
                        L = input.next().charAt(0);
                    }
                if(L == 'S'){
                    double sald;
                    sald = Conta[slot].getSaldo();
                    System.out.println("o saldo do cliente é de: "+sald);
                }else{
                    System.out.println("ok...");
                    System.out.println("deseja encerrar o programa?(S/N)");
                    resp = input.next().charAt(0);
                    while(resp != 'S' && resp != 'N'){
                        System.out.println("erro, denovo");
                        resp = input.next().charAt(0);
                    }
                }
            }
        }
        
    }
}
