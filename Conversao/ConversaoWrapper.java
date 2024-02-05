import java.util.Scanner;

public class ConversaoWrapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura de um valor inteiro (variável primitiva)
        System.out.print("Digite um número inteiro: ");
        int numeroInteiro = scanner.nextInt();

        // Leitura de um valor double (variável primitiva)
        System.out.print("Digite um número decimal: ");
        double numeroDecimal = scanner.nextDouble();

        // Conversão para tipos wrapper (Integer e Double)
        Integer wrapperInteiro = Integer.valueOf(numeroInteiro);
        Double wrapperDecimal = Double.valueOf(numeroDecimal);

        // Exibição dos resultados
        System.out.println("Valor inteiro (primitiva): " + numeroInteiro);
        System.out.println("Valor decimal (primitiva): " + numeroDecimal);
        System.out.println("Valor inteiro (wrapper): " + wrapperInteiro);
        System.out.println("Valor decimal (wrapper): " + wrapperDecimal);

        scanner.close();
    }
}
