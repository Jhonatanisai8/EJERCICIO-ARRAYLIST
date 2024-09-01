package Ejercicios;

import java.util.ArrayList;

public class Ejercicio10MostrarMayusculas {

    public static void main(String[] args) {
        ArrayList<String> listaNombres = new ArrayList<>();
        listaNombres.add("real madrid");
        listaNombres.add("barcelona");   
        listaNombres.add("atlanta");
        listaNombres.add("manscherter");
        

        System.out.println(listaNombres);

        for (int i = 0; i < listaNombres.size(); i++) {
            System.out.println(listaNombres.get(i).toUpperCase());
        }
    }
}
