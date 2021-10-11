
package Aula_11_herança_parte2;

public final class Tecnico extends Aluno{
    
    private int registroProfissional;
    private boolean praticando;
    //metodos
    public void praticar(){
        this.setPraticando(true);
    }
    
    //construtor
    public Tecnico() {
        this.registroProfissional = 0;
        this.praticando = false;
    }
    
    //setters and getters
    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public boolean getPraticando() {
        return praticando;
    }

    private void setPraticando(boolean praticando) {
        this.praticando = praticando;
    }
    
}
