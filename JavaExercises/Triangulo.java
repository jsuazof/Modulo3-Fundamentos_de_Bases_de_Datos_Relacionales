package JavaExercises;

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        ingresoHipotenusa();

    }
    public static void ingresoHipotenusa(){
        int a,b;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de a");
        a= leer.nextInt();
        System.out.println("Ingrese el valor de b");
        b= leer.nextInt();
        double hipotenusa = valorHipotenusa(a,b);
        System.out.println("El valor de la hipotenusa es: " + hipotenusa);
    }
    public static double valorHipotenusa(int a, int b){
        double hipotenusa = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        return hipotenusa;
    }
}
