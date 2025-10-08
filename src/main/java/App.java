package main.java;
import java.util.Scanner;

// Implementar o atributo e os métodos de acesso para Altura

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // === CRIAÇÃO DO OBJETO CORPO HUMANO ===
        System.out.println("=== CRIAÇÃO DO OBJETO CORPO HUMANO ===");
        System.out.print("Digite a massa inicial (kg): ");
        double massaInicial = scanner.nextDouble();

        System.out.print("Digite o volume inicial (m³): ");
        double volumeInicial = scanner.nextDouble();

        // OBS: A densidade é calculada, não digitada. A saída esperada está incorreta neste ponto.
        // O código abaixo pede a densidade, mas ignora o valor, pois ele é calculado pela classe.
        // Mantive a estrutura para corresponder à sua entrada esperada.
        System.out.print("Digite a densidade inicial (kg/m³): ");
        double densidadeDigitada = scanner.nextDouble(); // Valor ignorado
        System.out.print("Digite a altura inicial (m): ");
        double alturaInicial = scanner.nextDouble();

        CorpoHumano pessoa = new CorpoHumano(massaInicial, volumeInicial, alturaInicial);

        // === VALORES INICIAIS ===
        System.out.println("=== VALORES INICIAIS ===");
        System.out.println("Massa: " + pessoa.getMassa() + " kg");
        System.out.println("Volume: " + pessoa.getVolume() + " m³");
        System.out.println("Densidade: " + pessoa.getDensidade() + " kg/m³");
        System.out.println("Altura: " + pessoa.getAltura() + " m");
        System.out.println("IMC: " + pessoa.getImc());

        // --- ALTERANDO VALORES ---
        System.out.print("Digite uma nova massa (kg): ");
        double novaMassa = scanner.nextDouble();
        pessoa.setMassa(novaMassa);

        System.out.print("Digite uma nova altura (m): ");
        double novaAltura = scanner.nextDouble();
        pessoa.setAltura(novaAltura);

        // --- EXIBINDO NOVOS VALORES ---
        System.out.println("Novos valores:");
        System.out.println("Massa: " + pessoa.getMassa() + " kg");
        System.out.println("Altura: " + pessoa.getAltura() + " m");
        System.out.println("Novo IMC: " + pessoa.getImc());

        scanner.close();
    }

}

