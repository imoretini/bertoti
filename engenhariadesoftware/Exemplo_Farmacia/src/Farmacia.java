import java.util.List;
import java.util.LinkedList;

public class Farmacia {
    private List<Medicamento> estoque = new LinkedList<>();

    public void cadastrarMedicamento(Medicamento medicamento) {
        estoque.add(medicamento);
    }

    public List<Medicamento> buscarPorNome(String nome) {
        List<Medicamento> encontrados = new LinkedList<>();
        for (Medicamento m : estoque) {
            if (m.getNome().equalsIgnoreCase(nome)) {
                encontrados.add(m);
            }
        }
        return encontrados;
    }

    public List<Medicamento> getEstoque() {
        return estoque;
    }
}
