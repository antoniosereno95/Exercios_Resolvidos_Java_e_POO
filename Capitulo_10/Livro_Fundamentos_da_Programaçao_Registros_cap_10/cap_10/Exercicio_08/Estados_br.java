
package Exercicio_08;

public class Estados_br {
    
    String nome;
    int numero_acidentes;
    int numero_veiculos;
    static int soma_acidentes = 0;
    static int soma_vaiculos = 0;
    
    //set
    public void setNome(String n){
        nome = n;
    }
    public void setNumero_acidentes(int a){
        numero_acidentes = a;
        soma_acidentes += a;
    }
    public void setNumero_veiculos(int v){
        numero_veiculos = v;
        soma_vaiculos += v;
    }
    
    //get
    public String getNome(){
        return nome;
    }
    public int getNumero_acidentes(){
        return numero_acidentes;
    }
    public int getNumero_veiculos(){
        return numero_veiculos;
    }
    public int getSoma_veiculos(){
        return soma_vaiculos;
    }
    public int getSoma_acidentes(){
        return soma_acidentes;
    }
    
    //construtor
    public void Estados_br(){
        nome = "";
        numero_acidentes = 0;
        numero_veiculos = 0;
    }
    
}
