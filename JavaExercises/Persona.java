package JavaExercises;

import java.util.Scanner;

public class Persona {

    String rut;
    String nombre;
    short edad;
    float altura;
    float peso;

    public float IMC() {
        float imc;
        imc = (float) (peso / Math.pow(altura, 2));
        System.out.println("El IMC es: " + imc);
        return imc;
    }

    public void Verificar() {
        System.out.println("RUT: " + rut);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " Años");
        System.out.println("Altura: " + altura + " Mts");
        System.out.println("Peso: " + peso + " Kg");

    }

    public void Clasificacion() {
        float imc = IMC();

        if (imc < 16) {
            System.out.println("INFRAPESO: Delgadez Severa");
        } else if (imc >= 16 && imc < 17) {
            System.out.println("INFRAPESO: Delgadez Moderada");

        } else if (imc >= 17 && imc < 18.5) {
            System.out.println("INFRAPESO: Delgadez Aceptable");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso Normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("OBESO: Tipo I");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("OBESO: Tipo 2");
        } else {
            System.out.println("OBESO: Tipo 3");
        }
    }

    public void menu()
    {
        Persona persona = new Persona();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el RUT");
        persona.rut = leer.nextLine();
        System.out.println("Ingrese el nombre");
        persona.nombre = leer.nextLine();
        System.out.println("Ingrese la edad");
        persona.edad = leer.nextShort();
        System.out.println("Ingrese la altura");
        persona.altura = leer.nextFloat();
        System.out.println("Ingrese el peso");
        persona.peso = leer.nextFloat();
        leer.close();
    }
}