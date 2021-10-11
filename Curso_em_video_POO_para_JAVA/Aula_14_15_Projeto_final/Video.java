
package Aula_14_15_Projeto_final;

public class Video implements AcoesVideo{
    
    private String titulo;
    private int avaliaçao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    //metodos
    @Override
    public void play() {
        if(!this.isReproduzindo()){
            this.setReproduzindo(true);
        }else{
            System.out.println("video ja esta sendo reprodizido.");
        }
    }

    @Override
    public void pause() {
        if(this.isReproduzindo()){
            this.setReproduzindo(false);
        }else{
            System.out.println("o video ja esta pausado");
        }
        
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas()+1);
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avalia\u00e7ao=" + avaliaçao + ", views=" + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
    
    //get and set 
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliaçao() {
        return avaliaçao;
    }

    public void setAvaliaçao(int avaliaçao) {
        this.avaliaçao = avaliaçao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    //construtor
    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliaçao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
}
