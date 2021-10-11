
package Aula_11_herança_parte2;

public final class Bolsista extends Aluno {
    /*
    Sendo Bolsista uma Classe 'final' ela nao pode ser
    sobreposta nem ter filhas.
    **O 'final' pode ser utilizado para metods tbm, assim
    sendo eles nao podendo ser sobrescritos(@override).
    */
    private double bolsa;

    //contrutor
    public Bolsista(){
        this.bolsa = 0;
 
    }   
    //get and set
    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
    
    //metodos
    public void renovarBolsa() {
        System.out.println("Renovando bolsa de "+this.nome);
        /*novamente 'nome' so pode ser utilizada pela
        classe Bolsista pois ela por sua vez é uma subclasse
        de Aluno que tbm por sua vez é uma subclasse de Pessoa.
        Logo, sendo Pessoa a 'Classe Raiz' de Bolsista e tendo 
        variaveis do tipo 'protected', Bolsista tem direitos sobre
        estas variaveis.
        */ 
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome()+" é BOLSISTA! "
             + "Pagamento facilitado em "+this.getBolsa()+"% .");
    }
    
}

