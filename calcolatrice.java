import java.util.Scanner; // Importa la classe Scanner

public class calcolatrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea un'istanza di Scanner

        System.out.println("Welcome to the Java calculator designed by Umberto\n\n");
        System.out.println("First number: ");
        float NOne = scanner.nextFloat(); // Legge il primo numero in input
        System.out.println("Second number: ");
        float NTwo = scanner.nextFloat(); // Legge il secondo numero in input

        System.out.println("Choose an operation:\n1) Sum\n2) Subtraction\n3) Multiplication\n4) Division\n");
        int choosed = scanner.nextInt(); // Legge l'operazione scelta

        switch (choosed) {
            case 1:
                System.out.println("Result: " + (NOne + NTwo)); // Esegue la somma
                break;
            case 2:
                System.out.println("Result: " + (NOne - NTwo)); // Esegue la sottrazione
                break;
            case 3:
                System.out.println("Result: " + (NOne * NTwo)); // Esegue la moltiplicazione
                break;
            case 4:
                if (NTwo != 0) {
                    System.out.println("Result: " + (NOne / NTwo)); // Esegue la divisione, controllando se il divisore
                                                                    // è diverso da zero
                } else {
                    System.out.println("Error: Division by zero"); // Gestisce il caso in cui il divisore sia zero
                }
                break;
            default:
                System.out.println("Error: Invalid operation"); // Gestisce operazioni non valide
                break;
        }

        scanner.close(); // Chiude lo scanner per evitare leak di risorse
    }
}
