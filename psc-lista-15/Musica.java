public class Musica extends ItemMidia implements Avaliavel {
    private String artista;
    public Musica(String titulo, int anoLancamento, double duracao, String artista) {
        super(titulo, anoLancamento, duracao);
        this.artista = artista;
    }
    @Override
    public void reproduzir() {
        System.out.printf("Tocando a música: %s do %s. Tempo: %.1f minutos.%n", 
            getTitulo(), artista, getDuracao());
    }
    @Override
    public void receberAvaliacao(int nota) {
        System.out.printf("A música %s recebeu %d estrelas.%n", getTitulo(), nota);
    }
    public String getArtista() {
        return artista;
    }
}