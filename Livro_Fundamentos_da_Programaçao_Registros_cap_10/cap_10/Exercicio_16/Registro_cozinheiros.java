
package Exercicio_16;

public class Registro_cozinheiros {
    
    int codigo_cozinheiro;
    String nome_cozinheiro;
    
    public void Registro_cozinheiros(){
        codigo_cozinheiro = 0;
        nome_cozinheiro = "";
    }
    
    //set
    public void setCodigo_cozinheiro(int c){
        codigo_cozinheiro = c;
    }
    public void setNome_cozinheiro(String n){
        nome_cozinheiro = n;
    }
    
    //get
    public int getCodigo_cozinheiro(){
        return codigo_cozinheiro;
    }
    public String getNome_cozinheiro(){
        return nome_cozinheiro;
    }
    
}
