package Sistema;
import VeiculoCaracteristicas.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeAluguel {
    private List<Veiculo> veiculos;

    public SistemaDeAluguel() {
        veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void listarVeiculosDisponiveis() {
        System.out.println("Veículos disponíveis:");
        for (Veiculo veiculo : veiculos) {
            if (veiculo.isDisponivel()) {
                System.out.println(veiculo);
            }
        }
    }

    public Veiculo encontrarVeiculoPorPlaca(String placa) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPlaca().equals(placa)) {
                return veiculo;
            }
        }
        return null;
    }

    public boolean alugarVeiculo(String placa) {
        Veiculo veiculo = encontrarVeiculoPorPlaca(placa);
        if (veiculo != null && veiculo.isDisponivel()) {
            veiculo.setDisponivel(false);
            return true;
        }
        return false;
    }

    public void devolverVeiculo(String placa) {
        Veiculo veiculo = encontrarVeiculoPorPlaca(placa);
        if (veiculo != null) {
            veiculo.setDisponivel(true);
        }
    }
}


