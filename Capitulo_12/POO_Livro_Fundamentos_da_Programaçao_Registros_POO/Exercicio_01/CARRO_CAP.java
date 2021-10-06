
package POO_cap_12.Exercicio_01;

public interface CARRO_CAP {
    
    public abstract double Imposta_a_pagar();
    public abstract void Total_de_impostos(double p);
    public abstract void Carros_isentos_imposto(int i);
    public abstract void Setter_ano_fabricacao(int a);
    public abstract void Setter_ano_atual(int b);
    public abstract void Setter_placa(String p);
    
}
