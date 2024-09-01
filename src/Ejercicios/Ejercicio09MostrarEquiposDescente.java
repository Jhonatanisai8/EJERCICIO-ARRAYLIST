package Ejercicios;

/*
EJERCICIO 09: 
Ahora, utilizando el mismo esquema del ejercicio anterior, mostrar en orden descente
los elementos del ArrayList.
 */
import java.util.ArrayList;

public class Ejercicio09MostrarEquiposDescente {

    public static void main(String[] args) {
        ArrayList<String> listaNombres = new ArrayList<>();
        listaNombres.add("Real MADRID");
        listaNombres.add("Barcelona");
        listaNombres.add("Atlanta");
        listaNombres.add("Manscherter");

        System.out.println(listaNombres);

        System.out.println("FORMA ASCENDENTE.");

        listaNombres.sort((a, b) -> a.compareTo(b));

        System.out.println(listaNombres.reversed());
    }

}
