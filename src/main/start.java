package main;

import java.util.HashMap;
import java.util.Scanner;

public class start {
    // guardar datos en un array o estructura diferente
    // usar herencia y poliformismo
    //{naruto=Capitulo=23, tag=accion}
    public static void main(String[] args) {

        HashMap<String, Serie> serie= new HashMap<String, Serie>();
        Scanner entrada = new Scanner(System.in);

        serie.put("321", new Serie("Serie", 31, "aventura"));
        serie.put("334", new Serie("serie2", 4531, "comedia"));

        System.out.println("introduce un id: ");

        String id = entrada.nextLine();

        System.out.println("introduce tu Serie: ");

        String nombre_serie = entrada.nextLine();

        System.out.println("introduce tu capitulo: ");

        int nombre_capitulo = Integer.parseInt(entrada.nextLine());

        System.out.println("introduce tu tag: ");

        String nombre_tag =  entrada.nextLine();

        serie.put(id, new Serie(nombre_serie,nombre_capitulo, nombre_tag));

        //System.out.println(Serie);
        System.out.println(serie.entrySet());

        entrada.close();

    }
}
