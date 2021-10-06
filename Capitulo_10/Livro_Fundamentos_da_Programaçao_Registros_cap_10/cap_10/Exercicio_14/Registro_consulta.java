 
package Exercicio_14;
 
public class Registro_consulta {
    
    int numero_consulta;
    String dia;
    int hora;
    int codigo_medico;
    int codigo_paciente;
    
    //construtor
    public void Registro_consulta(){
        numero_consulta = 0;
        dia = "";
        hora = 0;
        codigo_medico = 0;
        codigo_paciente = 0;
    }
    
    //os set
    public void setNumero_consulta(int n){
        numero_consulta = n;
    }
    public void setDia(String d){
        dia = d;
    }
    public void setHora(int h){
        hora = h;
    }
    public void setCodigo_medico(int cm){
        codigo_medico = cm;
    }
    public void setCodigo_paciente(int cp){
        codigo_paciente = cp;
    }
    
    //os get
    public int getNumero_consulta( ){
        return numero_consulta ;
    }
    public String getDia( ){
        return dia ;
    }
    public int getHora( ){
        return hora ;
    }
    public int getCodigo_medico( ){
        return codigo_medico ;
    }
    public int getCodigo_paciente( ){
        return codigo_paciente ;
    }
    
}
