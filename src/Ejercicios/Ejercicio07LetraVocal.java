package Ejercicios;

import java.util.ArrayList;

/*EJERCICIO 07: 
Supongamos que el arraylist contiene una serie de nombres de personas.
Mostrar solo aquellos nombres que al menos contenga una vocal.*/
public class Ejercicio07LetraVocal {

    public static void main(String[] args) {
        ejemplo01();
    }

    public static void ejemplo01() {
        ArrayList<String> listaNombres = new ArrayList<>();
        ArrayList<String> listaNombresVocales = new ArrayList<>();

        listaNombres.add("Daniel");
        listaNombres.add("David");
        listaNombres.add("DFHJKK");
        listaNombres.add("GHKLLL");
        listaNombres.add("Jhonatan");

        for (int i = 0; i < listaNombres.size(); i++) {
            if (listaNombres.get(i).contains("a")
                    || listaNombres.get(i).contains("e")
                    || listaNombres.get(i).contains("i")
                    || listaNombres.get(i).contains("o")
                    || listaNombres.get(i).contains("u")) {
                listaNombresVocales.add(listaNombres.get(i));
            }
        }

        System.out.println("ArrayList: " + listaNombres);
        System.out.println("ArrayList Vocales: "+listaNombresVocales);

    }

}
