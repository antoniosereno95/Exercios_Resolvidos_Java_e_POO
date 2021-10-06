
package POO_cap_12.Exercicio_03;

public class Produto {
    
    protected int numero_produto;
    private double preço_produto;
    
    //metodos 
    public double ValorDoDesconto(){
        double v;
        if(this.getPreço_produto() > 100.0){
            v = this.getPreço_produto() * 0.15;
        }else {
            v = this.getPreço_produto()*0.05;
        }
        return v;
    }
    
    //get and set 
    public int getNumero_produto() {
        return numero_produto;
    }

    public void setNumero_produto(int numero_produto) {
        this.numero_produto = numero_produto;
    }

    public double getPreço_produto() {
        return preço_produto;
    }

    public void setPreço_produto(double preço_produto) {
        this.preço_produto = preço_produto;
    }
      
    //construtor
    public Produto(int numero_produto, double preço_produto) {
        this.numero_produto = numero_produto;
        this.preço_produto = preço_produto;
    }
    
    
}
