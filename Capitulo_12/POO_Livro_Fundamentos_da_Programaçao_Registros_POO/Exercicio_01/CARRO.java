
package POO_cap_12.Exercicio_01;

public class CARRO implements CARRO_CAP{
    private String placa;
    private int ano_fab;
    private int ano_atual;
    
    //construtor
    public void CARRO(){
        placa = "";
        ano_fab = 0;
        ano_atual = 0;
    }
    
    //os get
    private String getPlaca() {
        return placa;
    }
    private int getAno_fab() {
        return ano_fab;
    }
    private int getAno_atual(){
        return ano_atual;
    }
    
    //os set
    private void setPlaca(String placa) {
        this.placa = placa;
    }
    private void setAno_fab(int ano) {
        this.ano_fab = ano;
    }
    private void setAno_atual(int a){
        this.ano_atual = a;
    } 
    
    //override do encapsulamento(metodos)
    @Override
    public double Imposta_a_pagar() {
        double pagar=0;
        if(this.getAno_atual() == this.getAno_fab()){
            pagar = 500;
        }
        if(this.getAno_atual() == (this.getAno_fab()+1)){
            pagar = 400;
        }
        if(this.getAno_atual() == (this.getAno_fab()+2)){
            pagar = 300;
        }
        if(this.getAno_atual() == (this.getAno_fab()+3)){
            pagar = 200;
        }
        if(this.getAno_atual()>=(this.getAno_fab()+4) && this.getAno_atual()<=(this.getAno_fab()+9)){
            pagar = 100;
        }
        if(this.getAno_atual() >= (this.getAno_fab()+10)){
            pagar = 0;
        }
        return pagar;    
    }

    @Override
    public void Total_de_impostos(double p) {
        double soma=0;
        soma += p;
    }

    @Override
    public void Carros_isentos_imposto(int i) {
        int soma =0;
        soma += i;
    }

    @Override
    public void Setter_ano_fabricacao(int a) {
        this.setAno_fab(a);
    }

    @Override
    public void Setter_ano_atual(int b) {
        this.setAno_atual(b);
    }

    @Override
    public void Setter_placa(String p) {
        this.setPlaca(p);
    }
    
}
