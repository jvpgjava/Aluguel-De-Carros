package VeiculoCaracteristicas;

public abstract class Veiculo {
    private String placa;
    private String modelo;
    private int ano;
    private boolean disponivel;

    public Veiculo(String placa, String modelo, int ano) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.disponivel = true;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public abstract double calcularDiaria();

    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Placa: " + placa + ", Ano: " + ano + ", Disponível: " + (disponivel ? "Sim" : "Não");
    }
}