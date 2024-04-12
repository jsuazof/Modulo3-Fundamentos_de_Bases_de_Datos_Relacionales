package JavaExercises;

import java.util.Scanner;

public class PromedioCalificaciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroDeNotas = 4;
        double sumaNotas = 0;
        double promedio;

        for (int i = 1; i <= numeroDeNotas; i++) {
            System.out.print("Ingrese la calificación " + i + ": ");
            double calificacion = scanner.nextDouble();
            sumaNotas += calificacion; // Sumar la calificación a la suma total
        }
        
        promedio = sumaNotas / numeroDeNotas;

        
        System.out.println("El promedio de las calificaciones es: " + promedio);

        scanner.close();

    }
}
