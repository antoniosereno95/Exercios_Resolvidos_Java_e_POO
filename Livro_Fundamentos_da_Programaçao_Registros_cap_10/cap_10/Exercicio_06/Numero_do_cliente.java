
package Exercicio_06;

public class Numero_do_cliente {
    
    int numero_do_cliente;
    String nome;
    int telefone;
    String endereço;
    
    //contrutor;
    public Numero_do_cliente(){
        numero_do_cliente = 0;
        nome = "";
        telefone = 0;
        endereço = "";
    }
    
    //set
    public void setNome(String n){
        nome = n;
    }
    public void setTelefone(int tel){
        telefone = tel;
    }
    public void setEndereço(String end){
        endereço = end;
    }
    public void setNumero_do_cliente(int numb){
        numero_do_cliente = numb;
    }
    
    //get
    public String getNome(){
        return nome;
    }
    public int getTelefone(){
        return telefone;
    }
    public String getEndereço(){
        return endereço;
    }
    public int getNumero_do_cliente(){
        return numero_do_cliente;
    }
    
}
