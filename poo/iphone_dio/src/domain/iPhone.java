package domain;

public class iPhone implements IAparelhoTelefonico,INavegadorInternet,IReprodutorMusical{
    private String nome;

    public iPhone(String nome, String cpf) {
        this.nome = "Iphone de " + nome;
        this.cpf = String.valueOf(cpf.length() == 11);
    }

    private String cpf;

    public void ligarIphone(){
        System.out.println("Ligando iphone!" + nome);
    }
    public void desligarIphone(){
        System.out.println("Desligando iphone!");
    }
    @Override
    public void ligar(String numero) {
        System.out.println("Ligado para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Ligação!");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando Ligação!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Entrando na pagina: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }

    @Override
    public void fecharPagina() {
        System.out.println("Fechando pagina...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica: " + musica);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica..." );
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica..." );
    }

    @Override
    public void excluirMusica(String musica) {
        System.out.println("Excluindo musica: " + musica);
    }
}
