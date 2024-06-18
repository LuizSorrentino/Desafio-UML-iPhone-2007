
public class Iphone {
    public static void main(String[] args) throws Exception {
        ReprodutorMusical musicas = new ReprodutorMusical();
        AparelhoTelefonico contatos = new AparelhoTelefonico();
        NavegadorInternet chrome = new NavegadorInternet();

        musicas.adicionarMusica("money trees", "KDot");
        musicas.adicionarMusica("enigma", "Yago Oproprio");
        musicas.adicionarMusica("pose", "Duquesa");
        musicas.tocar();
        System.out.println("------------------------------");
        musicas.selecionarMusica("enigma");
        System.out.println("------------------------------");
        contatos.adicionarNumero("huguin", 99);
        contatos.adicionarNumero("zezin", 66);
        contatos.adicionarNumero("luizin", 33);
        contatos.ligar(99);
        System.out.println("------------------------------");
        contatos.ligar(55);
        System.out.println("------------------------------");
        chrome.exibirPagina(chrome.getUrl());
        chrome.adicionarNovaAba();
        chrome.atualizarPagina();
        chrome.exibirPagina("www.facebook.com/");


    }



}
