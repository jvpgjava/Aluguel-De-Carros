package TiposVeiculos;

import VeiculoCaracteristicas.Veiculo;

public class CarroLuxo extends Veiculo {
    private boolean possuiEspacoPara2Pessoas;

    public CarroLuxo(String placa, String modelo, int ano, boolean possuiEspacoPara2Pessoas) {
        super(placa, modelo, ano);
        this.possuiEspacoPara2Pessoas = possuiEspacoPara2Pessoas;
    }

    public boolean isPossuiEspacoPara2Pessoas() {
        return possuiEspacoPara2Pessoas;
    }

    public void setPossuiEspacoPara2Pessoas(boolean possuiEspacoPara2Pessoas) {
        this.possuiEspacoPara2Pessoas = possuiEspacoPara2Pessoas;
    }

    @Override
    public double calcularDiaria() {
        return 50.0; // Valor fixo para simplicidade
    }

    @Override
    public String toString() {
        return super.toString() + ", Possui espaço para somente 2 pessoas: " + (possuiEspacoPara2Pessoas ? "Sim" : "Não");
    }
}