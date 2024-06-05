package domain;

public interface IReprodutorMusical {
    void selecionarMusica(String musica);
    void tocar();
    void pausar();
    void excluirMusica(String musica);
}
