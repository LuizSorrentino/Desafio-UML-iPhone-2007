import java.util.ArrayList;

public class ReprodutorMusical {
    private boolean tocando;
    private ArrayList<Musicas> musicas;

    public ReprodutorMusical() {
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(String nome, String autor){
        musicas.add(new Musicas(nome, autor));
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public void tocar(){
        if (!tocando) {
            setTocando(!tocando);
            if (!musicas.isEmpty()) {
                for (Musicas m : musicas) {
                System.out.println("Tocando: " + m.getNomeMusica() + " by " + m.getAutor());
                }
            }else{
                throw new RuntimeException("Lista de musicas vazia");
            }
        }
    }

    public void pausar(){
        if (tocando) {
            setTocando(!tocando);
            System.out.println("Musica pausada");
        }
    }

    public void selecionarMusica(String musica){
        for (Musicas m : musicas) {
            if (m.getNomeMusica()==musica) {
                setTocando(true);
                System.out.println("Tocando "  + m.getNomeMusica() + " by " + m.getAutor());
            }
        }
    }
}
