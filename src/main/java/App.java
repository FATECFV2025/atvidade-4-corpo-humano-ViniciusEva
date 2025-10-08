package main.java;
public class App {
    public static void main(String[] args) {

        // Criando uma instância da classe CorpoHumano
        // Massa: 2 kg, Volume: 0.07 m³
        CorpoHumano pessoa = new CorpoHumano(70.0, 0.07);

        // Acessando as informações usando os métodos getters
        System.out.println("--- Informações Iniciais ---");
        System.out.println("Massa: " + pessoa.getMassa() + " kg");
        System.out.println("Volume: " + pessoa.getVolume() + " m³");
        System.out.println("Densidade: " + String.format("%.2f", pessoa.getDensidade()) + " kg/m³");

        // Modificando a massa e o volume usando os métodos setters
        System.out.println("\n--- Alterando a Massa e o Volume ---");
        pessoa.setMassa(75.0);
        pessoa.setVolume(0.075);

        // Verificando as novas informações
        System.out.println("Nova massa: " + pessoa.getMassa() + " kg");
        System.out.println("Novo volume: " + pessoa.getVolume() + " m³");
        System.out.println("Nova densidade: " + String.format("%.2f", pessoa.getDensidade()) + " kg/m³");

        // Tentando definir valores inválidos
        System.out.println("\n--- Tentando inserir valores inválidos ---");
        pessoa.setMassa(-10.0);
        pessoa.setVolume(0.0);
    }

}
