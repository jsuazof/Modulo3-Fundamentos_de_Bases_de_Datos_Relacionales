package JavaExercises;

import java.util.Scanner;

public class CalculaArea {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        // Calcular el área
        double area = Math.PI * Math.pow(radio, 2);

        // Mostrar el resultado
        System.out.println("El área de la circunferencia es: " + area);

        scanner.close();
    
    }

}
