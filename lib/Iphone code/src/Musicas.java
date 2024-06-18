
public class Musicas {
    private String nomeMusica;
    private String autor;


    public Musicas(String nomeMusica, String autor) {
        this.nomeMusica = nomeMusica;
        this.autor = autor;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
