public abstract class ItemMidia {
    private String titulo;
    private int anoLancamento;
    private double duracao;

    public ItemMidia(String titulo, int anoLancamento , double duracao){
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        if (duracao > 0) {
            this.duracao = duracao;
        } else {
            System.out.println("Erro: A duração deve ser um valor positivo. Duracao atual nao alterada: " + this.duracao + " minutos.");
        }
    }
    
    public abstract void reproduzir();
    
}
