package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
        import java.util.List;

public class TesteFarmacia {
    @Test
    void testCadastroEBusca() {
        Farmacia farmacia = new Farmacia();

        farmacia.cadastrarMedicamento(new Medicamento("Paracetamol", "Genérico", "Analgésico"));

        assertEquals(1, farmacia.getEstoque().size());

        List<Medicamento> encontrados = farmacia.buscarPorNome("Paracetamol");

        assertEquals("Genérico", encontrados.get(0).getFabricante());
    }
}