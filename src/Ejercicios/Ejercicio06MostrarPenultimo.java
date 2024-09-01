package Ejercicios;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/*EJERCICIO 05:
Mostrar el ultimo que se encuentra en la posicion penultima del arreglo. */
public class Ejercicio06MostrarPenultimo {

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
                                                                  2. Mostrar Elementos
                                                                  3. Mostrar el penultimo """));

            switch (opcion) {
                case 1 -> {
                    dato = JOptionPane.showInputDialog("Ingresa un nombre: ");
                    listaNombres.add(dato);
                }
                case 2 -> {
                    JOptionPane.showConfirmDialog(null, listaNombres, "Elementos del ArrayList ", JOptionPane.INFORMATION_MESSAGE);
                }
                case 3 -> {
                    String penultimoDato = listaNombres.get(listaNombres.size() - 2);
                    JOptionPane.showMessageDialog(null, penultimoDato, "Penultimo Dato", JOptionPane.INFORMATION_MESSAGE);

                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Ingrese una opcion correcta.");
                }
            }
        } while (opcion != 0);

    }

}
