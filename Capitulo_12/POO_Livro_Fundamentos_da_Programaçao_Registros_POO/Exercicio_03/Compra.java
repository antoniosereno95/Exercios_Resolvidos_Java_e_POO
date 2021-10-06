
package POO_cap_12.Exercicio_03;

public class Compra {
    
    private Produto numero_do_produto;
    private Cliente numero_do_cliente;
    private int quantidade;
    private double preço_final;
    
    //metodos
    public void PreçoFinal(){
        double pf;
        if(this.numero_do_cliente.DescontoAdicional()){
            pf = this.getQuantidade()
                *( this.numero_do_produto.getPreço_produto() 
                - this.numero_do_produto.ValorDoDesconto()
                - (this.numero_do_produto.getPreço_produto()*0.05)    
                 );
            
        }else{
            pf = (double)this.getQuantidade()
                *( this.numero_do_produto.getPreço_produto() - this.numero_do_produto.ValorDoDesconto());
        }
        
        this.setPreço_final(pf);
    }
    
    //contrutor
    public Compra(Produto numero_do_produto, Cliente numero_do_cliente, int quantidade) {
        this.numero_do_produto = numero_do_produto;
        this.numero_do_cliente = numero_do_cliente;
        this.quantidade = quantidade;
        this.preço_final = 0;
    }
    
    //get and set 
    public Produto getNumero_do_produto() {
        return numero_do_produto;
    }

    public void setNumero_do_produto(Produto numero_do_produto) {
        this.numero_do_produto = numero_do_produto;
    }

    public Cliente getNumero_do_cliente() {
        return numero_do_cliente;
    }

    public void setNumero_do_cliente(Cliente numero_do_cliente) {
        this.numero_do_cliente = numero_do_cliente;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreço_final() {
        return preço_final;
    }

    public void setPreço_final(double preço_final) {
        this.preço_final = preço_final;
    }
    
}
