
package Aula_05_getters_and_setters;

public class Conta_corrente {
    
    private String nome;
    private double saldo_conta;
    private int cpf;
    private int senha;
    
    public void Conta_corrente(){
        nome = "";
        saldo_conta = 0;
        cpf = 0;
        senha = 0;
    }
    //os set
    public void setNome(String n){
        this.nome = n;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public void setSaldo_conta(double s){
        this.saldo_conta = s;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    //os get
    public String getNome(){
        return nome;
    }
    public int getCpf() {
        return cpf;
    }
    public double getSaldo_conta(){
        return saldo_conta;
    }
    public int getSenha() {
        return senha;
    }
    //funçoes
    public void Deposito(double d){
        this.saldo_conta = this.saldo_conta + d;
    }
    public void Saque(double s){
        this.saldo_conta = this.saldo_conta - s;
    }
    public void Status(){
        System.out.println("nome: "+this.nome);
        System.out.println("cpf: "+this.cpf);
        System.out.println("saldo da conta corrente: "+this.saldo_conta);
        System.out.println("senha: ---- ");
    }      
}
