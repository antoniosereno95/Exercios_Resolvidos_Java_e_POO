
package banco_next_POO;
public class Cliente {
    
    protected Conta conta;
    protected String nome;
    protected long cpf;

    public Cliente() {
        this.conta = null;
        this.nome = "";
        this.cpf = 0;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    
}
