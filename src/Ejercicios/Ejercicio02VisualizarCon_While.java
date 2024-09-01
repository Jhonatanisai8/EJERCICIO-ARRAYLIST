package Ejercicios;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/*EJERCICIO 01: 
Visualizar los elementos utilizando una estructura "While"*/
public class Ejercicio02VisualizarCon_While {

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

        /*el metodo sise nos indica el tamaño del ArrayList*/
 /*el metodo get obtenemos el valor en un indicado indice*/
        int i = 0;

        System.out.println("Datos del ArrayList: ");
        while (i < aL.size()) {
            System.out.println(aL.get(i));
            i++;
        }
    }

}
