package JavaExercises;

import java.util.Scanner;

public class IndiceSalud {

    public static void main(String[] args) {

        /*
         * Persona persona1 = new Persona();
         * 
         * persona1.rut="12.156.359-8";
         * persona1.nombre="Juanito Pérez";
         * persona1.edad=18;
         * persona1.altura=(float)1.80;
         * persona1.peso=(float)70;
         * //persona1.Verificar();
         * 
         * persona1.Clasificacion();
         */
        menu();
    }

    public static void menu() {
        Persona persona = new Persona();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el RUT");
        persona.rut = leer.next();
        System.out.println("Ingrese el nombre");
        persona.nombre = leer.next();
        System.out.println("Ingrese la edad");
        persona.edad = leer.nextShort();
        System.out.println("Ingrese la altura en metros");
        String alturaI = leer.next();
        alturaI = alturaI.replace(',','.');
        float alturaF = Float.parseFloat(alturaI);
        persona.altura = alturaF;
        System.out.println("Ingrese el peso en Kg");
        String pesoI = leer.next();
        pesoI = pesoI.replace(',','.');
        float pesoF = Float.parseFloat(pesoI);
        persona.peso = pesoF;
        Imprimir(persona);
        leer.close();
    }

    public static void Imprimir(Persona persona) {
        {
            float imc = persona.IMC();
            System.out.println("El valor de su IMC es :"+imc);
            persona.Clasificacion();
        }
    }
}