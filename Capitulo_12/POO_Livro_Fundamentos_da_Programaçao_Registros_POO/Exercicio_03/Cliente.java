
package POO_cap_12.Exercicio_03;

public class Cliente {
    
    protected int numero_do_cliente;
    private String nome_do_cliente;
    private char sexo_do_cliente;
    
    //metodos
    public boolean DescontoAdicional(){
        boolean desconto;
        if(this.getSexo_do_cliente() == 'F' || this.getSexo_do_cliente() == 'f'){
            desconto = true;
            
        }else{
            desconto = false;
        }
        return desconto;
    }
    
    //get and set 
    public int getNumero_do_cliente() {
        return numero_do_cliente;
    }

    public void setNumero_do_cliente(int numero_do_cliente) {
        this.numero_do_cliente = numero_do_cliente;
    }

    public String getNome_do_cliente() {
        return nome_do_cliente;
    }

    public void setNome_do_cliente(String nome_do_cliente) {
        this.nome_do_cliente = nome_do_cliente;
    }

    public char getSexo_do_cliente() {
        return sexo_do_cliente;
    }

    public void setSexo_do_cliente(char sexo_do_cliente) {
        this.sexo_do_cliente = sexo_do_cliente;
    }
    
    //contrutor
    public Cliente(int numero_do_cliente, String nome_do_cliente, char sexo_do_cliente) {
        this.numero_do_cliente = numero_do_cliente;
        this.nome_do_cliente = nome_do_cliente;
        this.sexo_do_cliente = sexo_do_cliente;
    }
    
}
