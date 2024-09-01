package Ejercicios;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/*EJERCICIO 05:
Mostrar la cantidad de "elementos" que contiene el ArrayList. */
public class Ejercicio05CantidadElementos {

    public static void main(String[] args) {
        ejemplo01();
    }

    public static void ejemplo01() {
        ArrayList<String> listaNombres = new ArrayList<>();

        int opcion;

        String dato;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                  ELIGUE UNA OPCION: 
                                                                  1. Ingresar un dato.
                                                                  2. Cantidad de elementos. """));

            switch (opcion) {
                case 1 -> {
                    dato = JOptionPane.showInputDialog("Ingresa un nombre: ");
                    listaNombres.add(dato);
                }
                case 2 -> {
                    int cantidadElementos = listaNombres.size();
                    JOptionPane.showMessageDialog(null, "Cantidad de elementos del ArrayList: " + cantidadElementos);
                }
            }
        } while (opcion != 4);

    }

}
