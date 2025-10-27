package aceitunas;

public class Main {
    public static void main(String[] args) {

        int opcion = 0;

        do {
            try {

                opcion = Funciones.pedirOpcion();

            } catch (NumberFormatException nfe) {
                // repite bucle al saltar exepcion
                opcion = 0;
            }

        } while (opcion != 2);

    }
}