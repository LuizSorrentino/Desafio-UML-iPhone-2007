
public class NavegadorInternet {
    private String url;

    public NavegadorInternet() {
        this.url = "www.google.com/";
    }

    public void exibirPagina(String url){
        setUrl(url);
        System.out.println(url);
        System.out.println("*Pagina aqui*");
    }

    public void adicionarNovaAba(){
        System.out.println("nova aba");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando");
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
