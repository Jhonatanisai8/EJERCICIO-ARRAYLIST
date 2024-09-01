package Ejercicios;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/*EJERCICIO 01: 
Agregar un elemento en una posicion cualquiera. 
Al ejecutar el programa, el usuario debera ingresar el dato y la posicion donde 
desea "insertar" el nuevo elemento*/
public class Ejercicio03InsertarDato {

    public static void main(String[] args) {
        ejemplo01();
    }

    public static void ejemplo01() {
        ArrayList<String> listaNombres = new ArrayList<>();

        int opcion;

        String dato, elemento;
        int posicion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                  ELIGUE UNA OPCION: 
                                                                  1. Ingresar un dato.
                                                                  2. Ingresar un dato en alguna posicion especial.
                                                                  3, Visualizar datos.
                                                                  4. Salir. """));

            switch (opcion) {
                case 1 -> {
                    dato = JOptionPane.showInputDialog("Ingresa un nombre: ");
                    listaNombres.add(dato);
                }
                case 2 -> {
                    elemento = JOptionPane.showInputDialog("Ingresa el dato: ");
                    posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la posicion: "));
                    listaNombres.add(posicion, elemento);
                }
                case 3 -> {
                    if (!listaNombres.isEmpty()) {
                        JOptionPane.showMessageDialog(null, listaNombres, "ArrayList de nombres.", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "EL ArrayList esta vacio.");
                    }
                }
                case 4 ->
                    JOptionPane.showMessageDialog(null, "Gracias por participar.");
            }
        } while (opcion != 4);

    }

}
