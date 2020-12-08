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
     * Muestra por pantalla un determinado mensaje
     *
     * @param mensaje texto que queremos mostrar por pantalla
     */
    public static void printText(String mensaje) {
        System.out.println(mensaje);
    }

    /**
     * Permite al usuario introducir un número entero desde consola
     *
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
     *
     * @return una cadena de caracteres
     */
    public static String enterString(String mensaje) {
        Scanner consola = new Scanner(System.in);
        String texto;

        System.out.println(mensaje);

        do {
            texto = consola.nextLine().toLowerCase(); // Lo pasamos a minúsculas
        } while (texto.isEmpty());

        return texto;
    }


}
