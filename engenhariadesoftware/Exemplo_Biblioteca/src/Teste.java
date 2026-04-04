public class Teste {import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

    public class Teste {
        @Test
        void test() {
            Biblioteca bib = new Biblioteca();

            bib.cadastrarLivro(new Livro("Livro de Java", "John", "Programação"));

            assertEquals(1, bib.getLivros().size());

            List<Livro> encontrados = bib.buscarLivroTitulo("Livro de Java");

            assertEquals("John", encontrados.get(0).getAutor());
        }
    }

}
