
package banco_next_POO;
import java.util.Random;
public class Conta {
    Random r = new Random();
    
    protected String senha;
    protected double saldo;
    protected int numero_conta;

    public Conta() {
        this.senha = "";
        this.saldo = 0;
        this.numero_conta = 0;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(int numero_conta) {
        this.numero_conta = numero_conta;
    }
    
    //metodos 
    public void Creditar(double valor){
        this.setSaldo( this.getSaldo() + valor );
    }
    
    public void Debitar(double valor){
        this.setSaldo( this.getSaldo() - valor );
    }
    
}
