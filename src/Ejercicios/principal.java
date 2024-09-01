package Ejercicios;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class principal {

    public static void main(String[] args) {
        ejemplo01();
    }

    public static void ejemplo01() {
        ArrayList<String> aL = new ArrayList<>();
        boolean control = true;
        while (control) {
            String varNombre = JOptionPane.showInputDialog("Nombre: ");
            aL.add(varNombre);
            String seguir = JOptionPane.showInputDialog("¿DESEA SEGUIR AGREGANDO (S/N) ?");
            if (!"S".equals(seguir.toUpperCase())) {
                control = false;
            }
        }

        JOptionPane.showMessageDialog(null, aL, "Los elementos son: ", JOptionPane.PLAIN_MESSAGE);
    }

}
