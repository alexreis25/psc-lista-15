public class Filme extends ItemMidia implements Avaliavel {
    private String diretor; 

    public Filme(String titulo, int anoLancamento, double duracao, String diretor) {
        super(titulo, anoLancamento, duracao);
        this.diretor = diretor;
    }
    @Override
    public void reproduzir(){
        System.out.printf("Iniciando o filme: %s de %s. Duração: %.1f minutos.%n", 
            getTitulo(), diretor, getDuracao());
        }

        @Override
    public void receberAvaliacao(int nota) {
        System.out.printf("O filme %s recebeu a nota %d.%n", getTitulo(), nota);
    }
    
    // Getter para diretor (opcional, mas boa prática)
    public String getDiretor() {
        return diretor;
    }

}
