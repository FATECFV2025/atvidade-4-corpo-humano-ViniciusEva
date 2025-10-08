import java.util.Scanner;

public class CorpoHumano {

    // Atributos privados
    private double massa; // em kg
    private double volume; // em m³
    private double densidade; // em kg/m³
    private double altura; // em m
    private double imc; // Índice de Massa Corporal

    // Construtor da classe
    public CorpoHumano(double massa, double volume, double altura) {
        setMassa(massa);
        setVolume(volume);
        setAltura(altura);
    }

    // Método privado para calcular a densidade
    private void calcularDensidade() {
        if (this.volume > 0) {
            this.densidade = this.massa / this.volume;
        } else {
            this.densidade = 0;
        }
    }

    // Novo método privado para calcular o IMC
    private void calcularIMC() {
        if (this.altura > 0) {
            this.imc = this.massa / (this.altura * this.altura);
        } else {
            this.imc = 0;
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

    public double getAltura() {
        return this.altura;
    }

    public double getImc() {
        return this.imc;
    }

    // --- Métodos Setters (para modificação pública com validação) ---
    public void setMassa(double massa) {
        if (massa >= 0) {
            this.massa = massa;
            calcularDensidade();
            calcularIMC(); // Recalcula o IMC
        } else {
            System.out.println("Erro: A massa não pode ser negativa.");
        }
    }

    public void setVolume(double volume) {
        if (volume > 0) {
            this.volume = volume;
            calcularDensidade();
        } else {
            System.out.println("Erro: O volume deve ser maior que zero.");
        }
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
            calcularIMC(); // Recalcula o IMC
        } else {
            System.out.println("Erro: A altura deve ser maior que zero.");
        }
    }
}