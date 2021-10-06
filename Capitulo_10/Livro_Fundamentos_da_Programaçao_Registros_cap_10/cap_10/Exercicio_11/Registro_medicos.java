
package Exercicio_11;

public class Registro_medicos {
    
    int codigo_medico;
    String nome_medico;
    String endereço_medico;
    double salario_medico;
    
    //construtor
    public void Registro_medicos(){
        codigo_medico = 0;
        nome_medico = "";
        endereço_medico = "";
        salario_medico = 0;
    }
    
    //os set
    public void setCodigo_medico(int cod){
        codigo_medico = cod;
    }
    public void setNome_medico(String nome){
        nome_medico = nome;
    }
    public void setEndereço_medico(String end){
        endereço_medico = end;
    }
    public void setSalario_medico(double sal){
        salario_medico = sal;
    }
    
    //os get
    public int getCodigo_medico( ){
        return codigo_medico ;
    }
    public String getNome_medico( ){
        return nome_medico ;
    }
    public String getEndereço_medico( ){
        return endereço_medico ;
    }
    public double getSalario_medico( ){
        return salario_medico ;
    }
    
}
