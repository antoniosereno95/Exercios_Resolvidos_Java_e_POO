 
package Exercicio_14;
 
public class Registro_medico {
    
    int codigo_medico;
    int telefone_medico;
    String nome_medico;
    String endereço_medico;
    
    //construtor
    public void Registro_medico(){
        codigo_medico = 0;
        telefone_medico = 0;
        nome_medico = "";
        endereço_medico = "";
    }
    
    //os set
    public void setCodigo_medico(int cod){
        codigo_medico = cod;
    }
    public void setTelefone_medico(int tel){
        telefone_medico = tel;
    }
    public void setNome_medico(String n){
        nome_medico = n;
    }
    public void setEndereço_medico(String end){
        endereço_medico = end;
    }
    
    //os get
    public int getCodigo_medico( ){
        return codigo_medico;
    }
    public int getTelefone_medico( ){
        return telefone_medico;
    }
    public String getNome_medico( ){
        return nome_medico;
    }
    public String getEndereço_medico( ){
        return endereço_medico;
    }
    
}
