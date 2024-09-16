package TiposVeiculos;

import VeiculoCaracteristicas.Veiculo;

public class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String placa, String modelo, int ano, int numeroDePortas) {
        super(placa, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public double calcularDiaria() {
        return 100.0; // Valor fixo para simplicidade
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de portas: " + numeroDePortas;
    }
}

