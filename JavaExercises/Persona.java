package JavaExercises;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Persona {

    String rut;
    String nombre;
    short edad;
    float altura;
    float peso;


        public void IMC()
    {
        float imc;
        imc = (float) (peso / Math.pow(altura,2));
        System.out.println("El IMC es: " + imc);
    }
}
