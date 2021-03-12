package Auxiliar;

import java.util.Scanner;

/**
 * Clase IO: Biblioteca genérica que permite automatizar las entradas y salidas de información por pantalla
 */
public class IO {

    /**
     * Imprime cada elemento de un Menú y añade un número (desde 1 en adelante)
     *
     * @param menu array de Strings con los textos de cada menú
     */
    public static void printMenu(String[] menu) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] != null) {
                System.out.println((i + 1) + ". " + menu[i]);
            }
        }
    }


    /**
     * Muestra por pantalla un determinado mensaje con salto de línea
     *
     * @param mensaje texto que queremos mostrar por pantalla
     */
    public static void printText(String mensaje) {
        System.out.println(mensaje);
    }

    /**
     * Muestra por pantalla un determinado mensaje sin salto de línea
     *
     * @param mensaje texto que queremos mostrar por pantalla
     */
    public static void printTextNotLine(String mensaje) {
        System.out.print(mensaje);
    }

    /**
     * Permite al usuario introducir un número entero desde consola
     * @param mensaje Cadena de caracteres con un mensaje que se muestra por pantalla
     * @return un numero entero
     */
    public static int enterInt(String mensaje) {
        Scanner consola = new Scanner(System.in);
        String digito;
        int numero;

        System.out.println(mensaje);

        do {
            digito = consola.next();
        } while (digito.isEmpty());

        numero = Integer.parseInt(digito);

        return numero;
    }

    /**
     * Permite al usuario introducir un String desde consola
     * @param mensaje Cadena de caracteres con un mensaje que se muestra por pantalla
     * @return devuelve la cadena de caracteres introducida por el usuario
     */
    public static String enterString(String mensaje) {
        Scanner consola = new Scanner(System.in);
        String texto;

        System.out.println(mensaje);

        do {
            texto = consola.nextLine();
        } while (texto.isEmpty());

        return texto;
    }

    /**
     * Permite al usuario introducir un String desde consola
     * @param mensaje Cadena de caracteres con un mensaje que se muestra por pantalla
     * @return devuelve un valor boolean TRUE si el usuario introduce si, FALSE para el resto de casos
     */
    public static boolean enterBoolean(String mensaje) {
        Scanner consola = new Scanner(System.in);
        String texto;

        System.out.println(mensaje);

        do {
            texto = consola.nextLine().toLowerCase();
        } while (texto.isEmpty());

        if (texto.equals("si")) {
            return true;
        }
        return false;
    }


}
