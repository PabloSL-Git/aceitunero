package aceitunas;

import javax.swing.JOptionPane;

public class Funciones {
    public static int pedirOpcion(){

        JOptionPane.showMessageDialog(null, Mensajes.menuInicial);
        
        String opcionTxt = JOptionPane.showInputDialog(" dame 1 0 2");
        int opcion = Integer.parseInt(opcionTxt);


        

        return opcion;

    }

}
