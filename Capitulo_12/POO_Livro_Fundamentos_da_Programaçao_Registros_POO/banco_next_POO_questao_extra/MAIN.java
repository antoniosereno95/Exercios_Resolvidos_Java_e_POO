
package banco_next_POO;
import java.util.Scanner;
import java.util.Random;
public class MAIN {
    //variaveis globais
    static final int index_conta = 3;
    static final int index_cliente = 3;
    static Conta[] contas ;
    static Cliente[] clientes ;
    static int i_conta=0,i_cliente=0;
    static Scanner input = new Scanner(System.in);
    static Random r = new Random();
    
    public static void main(String args[]) {
        //tem que iniar os objetos dentro do main pra so o vetor ser global
        contas = new Conta[index_conta];
        clientes = new Cliente[index_cliente];
        
        while(true){
            Menu();
            int op = input.nextInt();
            while(op < 1 && op > 5){
                System.out.println("entrada invalida");
                op = input.nextInt();
            }
            if(op == 1){
                System.out.println("Conta ou Poupança?(1 ou 2)");
                int opp = input.nextInt();
                    if(opp == 1){
                        CriarConta();
                    }else if(opp == 2){
                        CriarPoupanca();
                    }
            }else if(op == 2){
                ConsultarSaldo();
                
            }else if(op == 3){
                CreditarConta();
                
            }else if(op == 4){
                DebitarConta();
                
            }else if(op == 5){
                if(Sair()){
                    break;
                }
            }
        }
    }
    public static int GeraNumeroConta(){//tem que arrumar, continua tendo que arrumar
        //usar este metodo para gerar um numero 
        //com 8 gigitos para se a conta.
        int numero = 0;
        boolean tt = true;
        while(tt){
            for(int i = 0 ; i < 6 ; i++){
                int n = r.nextInt(10);
                while(n < 0){
                    n = r.nextInt(10);
                }
                numero = numero + (n * (int)Math.pow(i, 10));
            }
            if(numero/1000000 > 0){
                tt = false;
            }
            if(numero < 0){
                tt = true;
            }
        }
        
        return numero;
    }
    public static boolean VerificaSenha(String senha){//arrumado e funcionando
        boolean ok = false;
        boolean chave = true;
        String[] subs = new String[6];
        if(senha.length() == 6){
            subs[0] = senha.substring(0,1);
            subs[1] = senha.substring(1,2);
            subs[2] = senha.substring(2,3);
            subs[3] = senha.substring(3,4);
            subs[4] = senha.substring(4,5);
            subs[5] = senha.substring(5,6);
            
            for(int i = 0 ; i < 6 ; i++){
                if(!subs[i].equals("0") && !subs[i].equals("1") && !subs[i].equals("2") && !subs[i].equals("3") && !subs[i].equals("4") && !subs[i].equals("5") && !subs[i].equals("6") && !subs[i].equals("7") && !subs[i].equals("8") && !subs[i].equals("9")){
                    chave = false;
                }
            }
            if(chave == true){
                ok = true;
            }
            /*
             System.out.println(sub1);
            System.out.println(sub2);
            System.out.println(sub3);
            System.out.println(sub4);
            System.out.println(sub5);
            System.out.println(sub6);
            */
        }else{
            System.out.println("a senha deve ter 6 digitos. ");
        }
        return ok;
    }
    public static boolean VerificaConta(int Nconta){
        boolean ok = false;
        for(int i = 0 ; i < index_conta ; i++){
            if(contas[i]!=null && contas[i].getNumero_conta() == Nconta){
                ok = true;
            }
        }
        return ok;
    }
    public static boolean SenhaCorreta(int Nconta , String senha){
        boolean ok = false;
        for(int i = 0 ; i < index_conta ; i++){
            if(contas[i]!=null && contas[i].getNumero_conta() == Nconta){
                if(contas[i]!=null &&contas[i].getSenha().equals(senha)){
                    ok = true;
                }
            }
        }
        return ok;
    }
    public static void Menu(){
        System.out.println(
            "1. Abrir uma Conta (Cadastrar conta)\n" +
            "2. Consultar Seu Saldo em Conta\n" +
            "3. Creditar em conta\n" +
            "4. Debitar em contar\n" +
            "5. Sair");
        System.out.println("digite o numero da opçao desejada:");
    }
    public static void CriarConta(){
        System.out.println("estamos com "+i_conta+" de "+index_conta+" contas cadastradas");
        if(i_conta >= index_conta){
            System.out.println("limite de ocntas atingido!");
        }else{
            System.out.println("Bom dia Senhor, vamos iniciar o porcesso de abertura de uma NOVA CONTA:");
            System.out.println("digite o seu nome:");
            String nome = input.next();

            System.out.println("digite seu cpf:");
            long cpf = input.nextLong();

            System.out.println("ok, vamos criar um numero para sua conta:");
            int numero_da_conta = GeraNumeroConta();//organizar este metodo de verificaçao 
            System.out.println("O numero criado para sua conta foi: "+numero_da_conta);

            System.out.println("agora por favor digite uma senha numerica de 6 numeros para acessoa a sua conta:");
            String senha = input.next();
            boolean senha_ok = MAIN.VerificaSenha(senha);//organizar este metodo de verificaçao 
            while(!senha_ok){
                System.out.println("tente outra senha, somente numeros");
                senha = input.next();
                senha_ok = MAIN.VerificaSenha(senha);
            }

            //inserçao do sdados nos meus objetos
            Cliente cliente = new Cliente();
            Conta conta = new Conta();
            cliente.setNome(nome);
            cliente.setCpf(cpf);
            conta.setNumero_conta(numero_da_conta);
            conta.setSenha(senha);
            cliente.setConta(conta);
            //inserçao na matriz de obejtos
            contas[i_conta] = conta;
            clientes[i_cliente] = cliente;
            i_conta++;
            i_cliente++;
            System.out.println("ok, cadastro Efetuado com sucesso.");
        }

    }
    public static void ConsultarSaldo(){
        System.out.println("digite o numero da sua conta:");
        int numeroConta = input.nextInt();
        
        System.out.println("digite sua senha unica:");
        String senha = input.next();
                
        if(VerificaConta(numeroConta) && SenhaCorreta(numeroConta,senha)){
            int k = -1;
            for(int i = 0 ; i < index_conta ; i++){
                if(contas[i]!=null && contas[i].getNumero_conta() == numeroConta){
                    k = i;
                }
            }
            System.out.println("O saldo da sua conta é de: " + contas[k].getSaldo() + " reais.");
        }else{
            System.out.println("numero de ocnta ou sneha incorreta.");
        }
        
    }
    public static void CreditarConta(){
        System.out.println("digite o numero da sua conta:");
        int numeroConta = input.nextInt();
        
        System.out.println("digite o valor positivo a ser creditado:");
        double valor = input.nextDouble();
        while(valor < 0){
            System.out.println("entrada invalida");
            valor = input.nextDouble();
        }
        
        for(int i = 0 ; i < index_conta ; i++){
            if(contas[i]!=null && contas[i].getNumero_conta() == numeroConta){
                contas[i].Creditar(valor);
            }
        }
    }
    public static void DebitarConta(){
        System.out.println("digite o numero da sua conta:");
        int numeroConta = input.nextInt();
        
        System.out.println("digite sua senha unica:");
        String senha = input.next();
        
        if(VerificaConta(numeroConta) && SenhaCorreta(numeroConta,senha)){
            System.out.println("digite o valor positivo a ser debitado:");
            double valor = input.nextDouble();
            while(valor < 0){
                System.out.println("entrada invalida");
                valor = input.nextDouble();
            }
            
            for(int i = 0 ; i < index_conta ; i++){
                if(contas[i]!=null && contas[i].getNumero_conta() == numeroConta){
                    contas[i].Debitar(valor);
                    System.out.println("Valor debitado");
                }
            }
        }else{
            System.out.println("numero de ocnta ou sneha incorreta.");
        }
    }
    public static boolean Sair(){
        System.out.println("Deseja mesmo encerrar o programa?(S/N)");
        char x = input.next().charAt(0);
        while(x!='S'&&x!='N'){
            System.out.println("(S/N)?");
            x = input.next().charAt(0);
        }
        if(x =='S'){
            return true;
        }else{
            return false;
        }
    }
    public static final void Enunciado(){
        /*
        Crie um programa JAVA que contenha as classes Contas e Cliente
            O cliente possui um atributo Conta.
            A conta deve ter uma senha numérica de até 6 dígitos.
        Esse programa deve possuir um menu onde o usuário possa:
        1. Abrir uma Conta (Cadastrar conta)
            O programa deve pedir as informações do cliente
            O programa deve gerar um numero randômico para a conta e para 
            o digito da conta
            O saldo inicial deve ser zero.
        2. Consultar Seu Saldo em Conta
            O cliente deve informar o número da conta
            O cliente deve informar a senha
            Se o numero da conta bater com a senha , exibir o saldo , 
            se não informar numero conta ou senha invalida.
        3. Creditar em conta
            O programa deve pedir o numero da conta e valor a ser creditado
            O programa Deve creditar o valor.
        4.Debitar em contar
            O programa deve pedir o numero da conta, senha e valor a ser debitado
            Se o numero da conta bater com a senha , fazer o debito , 
            se não informar numero conta ou senha invalida.
        5. Sair
        */
    }
    public static void CriarPoupanca() {
        System.out.println("estamos com "+i_conta+" de "+index_conta+" contas cadastradas");
        if(i_conta >= index_conta){
            System.out.println("limite de ocntas atingido!");
        }else{
            System.out.println("digite o nuemro da sua conta principal:");
            int numero_conta = input.nextInt();
            
            if(VerificaConta(numero_conta)){
                System.out.println("agora digite sua senha:");
                String s = input.next();
                
                if(SenhaCorreta(numero_conta , s)){
                    Poupança poup = new Poupança();
                    System.out.println("digite o rendimento mensal aprovado pelo diretor:");
                    double rend = input.nextDouble();
                    poup.setRendimento_mensal(rend);
                    System.out.println("digite o valor que ira depositar para ser o saldo inicial da sua conta poupança:");
                    double sald = input.nextDouble();
                    poup.setSaldo_poupanca(sald);
                    //inserçao na matriz de obejtos
                    contas[i_conta] = poup;
                    i_conta++;
                    System.out.println("ok, cadastro Efetuado com sucesso#POUPANÇA#.");
                    
                }else{
                    System.out.println("senha invalida.");
                }
                
            }else{
                System.out.println("conta nao encontrada.");
            }
        }
    }
    
}
