package main.java;

public class CorpoHumano {

    // Atributos privados para simular o encapsulamento
    private double massa; // em kg
    private double volume; // em m³
    private double densidade; // em kg/m³

    // Construtor da classe
    public CorpoHumano(double massa, double volume) {
        // Usa os setters para inicializar os atributos, garantindo a validação
        setMassa(massa);
        setVolume(volume);
    }

    // Método privado para calcular a densidade
    private void calcularDensidade() {
        if (this.volume > 0) {
            this.densidade = this.massa / this.volume;
        } else {
            this.densidade = 0;
        }
    }

    // --- Métodos Getters (para acesso público) ---
    public double getMassa() {
        return this.massa;
    }

    public double getVolume() {
        return this.volume;
    }

    public double getDensidade() {
        return this.densidade;
    }

    // --- Métodos Setters (para modificação pública com validação) ---
    public void setMassa(double massa) {
        if (massa >= 0) {
            this.massa = massa;
            // Recalcula a densidade quando a massa é alterada
            calcularDensidade();
        } else {
            System.out.println("Erro: A massa não pode ser negativa.");
        }
    }

    public void setVolume(double volume) {
        if (volume > 0) {
            this.volume = volume;
            // Recalcula a densidade quando o volume é alterado
            calcularDensidade();
        } else {
            System.out.println("Erro: O volume deve ser maior que zero.");
        }
    }
}
