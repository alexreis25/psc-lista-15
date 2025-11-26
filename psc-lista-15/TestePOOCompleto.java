import java.util.ArrayList;
import java.util.List;

public class TestePOOCompleto {
    public static void main(String[] args) {
    
    System.out.println("--- 1. Criando Instâncias ---");
    
    Filme filme1 = new Filme("O Senhor dos Anéis", 2001, 178.0, "Peter Jackson");
    Musica musica1 = new Musica("Bohemian Rhapsody", 1975, 5.9, "Queen");

    System.out.println("\n--- 2. Teste de Polimorfismo com Classe Abstrata (ItemMidia) ---");

    List<ItemMidia> midias = new ArrayList<>();
    midias.add(filme1);
    midias.add(musica1);

    for (ItemMidia item : midias) {
            item.reproduzir(); // Polimorfismo em ação! [cite: 54]
    }

    System.out.println("\n--- 3. Teste de Polimorfismo com Interface (Avaliavel) ---");

    Avaliavel avaliavelRef = filme1;
    avaliavelRef.receberAvaliacao(9);

    avaliavelRef = musica1;
    avaliavelRef.receberAvaliacao(10);

    System.out.println("\n--- 4. Teste de Encapsulamento (Validação do Setter) ---");

    System.out.println("Duração atual do filme: " + filme1.getDuracao() + " minutos.");
    System.out.println("Tentando definir a duração para -10.0...");

    filme1.setDuracao(-10.0);

    System.out.println("Duração após a tentativa (deve permanecer a original): " + filme1.getDuracao() + " minutos.");


}
}