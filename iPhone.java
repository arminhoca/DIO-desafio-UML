public class iPhone implements ReprodutorMusica, AparelhoTelefonico, NavegadorInternet {

    //ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    //AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    //NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Teste reprodutor musical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("The Summoning - Sleep Token");

        // Teste aparelho telefônico
        meuIphone.ligar("912345678");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Teste navegador de internet
        meuIphone.exibirPagina("www.trilha-java-basico-dio.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
