package aceitunas;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        int opcion = 0;

        do {
            try {

                opcion = Funciones.pedirOpcion();

                switch (opcion) {
                    case 1 -> {
                        JOptionPane.showMessageDialog(null, "el 1");
                    }
                    case 2 -> {
                        JOptionPane.showMessageDialog(null, "el 2");
                    }

                    default -> {

                        JOptionPane.showMessageDialog(null, "ni 1 ni 2");

                    }

                }

            } catch (NumberFormatException nfe) {
                // repite bucle al saltar exepcion
                opcion = 0;
            }

        } while (opcion != 2);

    }
}