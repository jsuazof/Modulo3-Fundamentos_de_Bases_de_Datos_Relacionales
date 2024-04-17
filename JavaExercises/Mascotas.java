package JavaExercises;


public class Mascotas {

    public static void main(String[] args) throws Exception {
        String[][] mascotas = {
                { "Sandra", "Roberto", "Carolina", "Giovanni" },
                { "Pancracia", "Luz", "Petronilo", "Cachupin" }
        };

        for (int i = 0; i < mascotas[0].length; i++) {
            System.out.println("Dueño: " + mascotas[0][i]);
            System.out.println("Mascota: " + mascotas[1][i]);
        }
    }
}
