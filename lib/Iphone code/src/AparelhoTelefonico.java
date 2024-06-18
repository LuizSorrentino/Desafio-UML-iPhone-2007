import java.util.ArrayList;

public class AparelhoTelefonico {

    private ArrayList<Contato> contatos;

    public AparelhoTelefonico() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarNumero(String nome, int numero) {
        contatos.add(new Contato(nome, numero));
    }

    public void ligar(int numero){
        for (Contato contato : contatos) {
            if (numero==contato.getNumero()) {
                System.out.println("Chamando \n" + contato.getNome());
                break;
            }else{
                System.out.println("Chamando \n" + numero);
                break;
            }
        }
    }

    public void atender(){
        System.out.println("Atendendo");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Tocando correio de voz");
    }
}
