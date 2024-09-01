package Ejercicios;

import java.util.ArrayList;

/*
Ejercicio 08:
Suponga que el arraylist contiene nombres de equipos de futbol.
Mostrar en orden ascendente los elementos contenidos en el Arraylist.
 */
public class Ejercicio08EquiposFutbol {

    public static void main(String[] args) {
        ArrayList<String> listaNombres = new ArrayList<>();
        listaNombres.add("Real MADRID");
        listaNombres.add("Barcelona");
        listaNombres.add("Atlanta");
        listaNombres.add("Manscherter");
        
        System.out.println(listaNombres);
        
        System.out.println("FORMA ASCENDENTE.");
        listaNombres.sort((a, b) -> a.compareTo(b));
        System.out.println(listaNombres);
    }
    

}
