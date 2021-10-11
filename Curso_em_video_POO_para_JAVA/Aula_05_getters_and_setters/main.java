
package Aula_05_getters_and_setters;

import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int var_c = 2;
        //construir as pessoas
        Conta_corrente[] Conta;
        Conta = new Conta_corrente[var_c];
        for( int i = 0 ; i < var_c ; i++ ){
            Conta[i] = new Conta_corrente();
        }
        
        //rotina do main
        int opçao1 = 0 , opçao2 = 0;
        while(opçao1 != 4){
            Menu_1();
            System.out.println("escolha sua opçao: ");
            opçao1 = input.nextInt();
            if(opçao1 == 1){
                //Entrar na conta
                System.out.println("digite seu cpf:");
                int cpf1 = input.nextInt();
                while(cpf1 <= 0){
                    System.out.println("o cfp deve ser maior e diferente de zero, tente novamente.");
                    cpf1 = input.nextInt();
                }
                boolean achou = false;
                int slot = 0;
                for(int i = 0 ; i < var_c ; i++){
                    if(Conta[i].getCpf() == cpf1){
                        achou = true;
                        slot = i;
                    }
                }
                if(achou == true){
                    //pede senha
                    System.out.println("digite sua senha:");
                    int s = input.nextInt();
                    boolean senha_ok = false;
                    if(Conta[slot].getSenha() == s){
                        senha_ok = true;
                        System.out.println("entrando na sua conta...");
                        System.out.println("\n");
                    }else{
                        System.out.println("senha incorreta voce tem mais 1 tentativa.");
                        System.out.println("digite novamente sua senha: ");
                        s = input.nextInt();
                        if(s == Conta[slot].getSenha() ){
                            senha_ok = true;
                        }else{
                            System.out.println("senha incorreta, voltando ao menu principal.");
                            senha_ok = false;
                        }
                    }
                    //rotina da conta logada.
                    if( senha_ok == true ){
                        while(opçao2 != 4){
                            Menu_2();
                            System.out.println("digite sua opçao: ");
                            opçao2 = input.nextInt();
                            if(opçao2 == 1){
                                //Saldo da conta
                                System.out.println("saldo da conta: "+Conta[slot].getSaldo_conta());
                            }else if(opçao2 == 2){
                                //Deposito
                                System.out.println("digite o valor a ser depositado e o deposite no caixa via carta lacrada: ");
                                double dep = input.nextDouble();
                                Conta[slot].Deposito(dep);
                            }else if(opçao2 == 3){
                                //Saque
                                System.out.println("digite o valor a ser sacado:");
                                double saq = input.nextDouble();
                                Conta[slot].Saque(saq);
                            }else if(opçao2 == 4){
                                System.out.println("Voltando ao menu principal.");
                            }
                        }
                        //fim da rotina da conta logada.
                    }
                }else{
                    System.out.println("CPF nao cadastrado, tente novamente.");
                }
                //fim opçao 1
            }else if(opçao1 == 2){
                //cadastro de conta.
                int slot = 0;
                boolean espaço_conta = false;
                for(int i = 0 ; i < var_c ; i++ ){
                    if(Conta[i].getCpf() == 0){
                        slot = i;
                        espaço_conta = true;
                    }
                }
                if(espaço_conta == true ){
                    System.out.println("ok, vamos começar o cadastrp da sua nova conta:");
                    System.out.println("digite seu cpf:");
                    int cp = input.nextInt();
                    boolean repetido = false;
                    for(int i = 0; i < var_c ; i++){
                        if(Conta[i].getCpf() == cp){
                            repetido = true;
                        }
                    }
                    if(repetido == false){
                        Conta[slot].setCpf(cp);
                        System.out.println("digite seu nome:");
                        String n = input.next();
                        Conta[slot].setNome(n);
                        System.out.println("digite sua senha:");
                        int se = input.nextInt();
                        Conta[slot].setSenha(se);
                        System.out.println("conta cadastrada ocm sucesso!, voltando ao menu principal.");
                    }else{
                        System.out.println("cpf ja existente, voltando ao menu principal.");
                    }
                    //fim da opçao 2
                }else{
                    System.out.println("Desculpe, nao temos mais espaço em novvo banco de dados, tente mais tarde.");
                }
                //fim da opçao 2
            }else if(opçao1 == 3){
                //Trocar senha
                System.out.println("digite seu cpf:");
                int cp = input.nextInt();
                boolean achou = false;
                int slot = 0;
                for(int i = 0 ; i < var_c ; i++){
                    if(Conta[i].getCpf() == cp){
                        achou = true;
                        slot = i;
                    }
                }
                if(achou == true){
                    System.out.println("digite sua senha antiga:");
                    int se = input.nextInt();
                    boolean senha_ok = false;
                    if(Conta[slot].getSenha() == se){
                        senha_ok = true;
                    }else{
                        System.out.println("senha incorreta voce tem mais uma chance.");
                        System.out.println("digite sua senha antiga:");
                        se = input.nextInt();
                        if(Conta[slot].getSenha() == se){
                            senha_ok = true;
                        }
                    }
                    if(senha_ok == true){
                        System.out.println("ok, digite sua nova senha agora:");
                        int sn = input.nextInt();
                        Conta[slot].setSenha(sn);
                        System.out.println("nova senha cadastrada com sucesso, vontando ao menu principal.");
                    }
                }else{
                    System.out.println("cpf nao encontrado, voltando ao menu principal.");
                }
                //fim da opçao 3
            }else if(opçao1 == 4){
                System.out.println("Fechando o programa, ate mais.");
            }
        }
        //fim da rotina main
    }
    public static void Menu_2(){
        System.out.println("1. Saldo da conta");
        System.out.println("2. Deposito");
        System.out.println("3. Saque");
        System.out.println("4. Voltar para o menu principal.");
    }
    public static void Menu_1(){
        System.out.println("1. Entrar na conta");
        System.out.println("2. Cadastrar conta");
        System.out.println("3. Trocar senha");
        System.out.println("4. Sair");
    }
}
