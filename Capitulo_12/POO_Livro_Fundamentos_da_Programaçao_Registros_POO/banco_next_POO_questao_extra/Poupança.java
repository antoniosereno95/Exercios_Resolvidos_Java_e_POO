
package banco_next_POO;

public class Poupança extends Conta{
    
    protected Conta conta;
    protected double saldo_poupanca;
    protected double rendimento_mensal;

    public Poupança() {
        //super(senha,saldo,numero_conta);
        this.conta = null;
        this.saldo_poupanca = 0.0;
        this.rendimento_mensal = 0.0;
    }

    

    public double getSaldo_poupanca() {
        return saldo_poupanca;
    }

    public void setSaldo_poupanca(double saldo_poupanca) {
        this.saldo_poupanca = saldo_poupanca;
    }

    public double getRendimento_mensal() {
        return rendimento_mensal;
    }

    public void setRendimento_mensal(double rendimento_mensal) {
        this.rendimento_mensal = rendimento_mensal;
    }
   
}
