public class Biblioteca {
    import java.util.List;
import java.util.LinkedList;

    public class Biblioteca {
        private List<Livro> livros = new LinkedList<>();

        public void cadastrarLivro(Livro livro) {
            livros.add(livro);
        }

        public List<Livro> buscarLivroTitulo(String titulo) {
            List<Livro> encontrados = new LinkedList<>();
            for (Livro livro : livros) {
                if (livro.getTitulo().equals(titulo)) {
                    encontrados.add(livro);
                }
            }
            return encontrados; // faltava o return
        }

        public List<Livro> getLivros() {
            return livros; // getter para usar no teste
        }
    }

}
