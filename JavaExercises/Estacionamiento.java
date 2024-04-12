package JavaExercises;

import java.util.Scanner;

public class Estacionamiento {

    public static void main(String[] args) {

        ingresoHoras(500);
    }

    public static void ingresoHoras(int valorHora) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las horas trabajadas: ");
        double horas = leer.nextDouble();
        double costoTotal = cobroHorasEstacionamiento(valorHora, horas);
        System.out.println("El costo total es :" + costoTotal);

    }

    public static double cobroHorasEstacionamiento(int valorHora, double horas) {

        return valorHora * Math.ceil(horas);

    }
}
