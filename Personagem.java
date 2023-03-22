public class Personagem {
    private int visibilidade;
    private int poder;
    private int vida;

    public Personagem(int visi, int poder, int vida){
        
        this.visibilidade = visi > 10 ? 10 : visi;
        this.poder = poder > 100 ? 100 : poder;
        this.vida = vida;
    }

    public String toString(){
        return "poder:" + poder + "\nvisibilidade: " + visibilidade + "\nvida: " + vida;
    }
}
