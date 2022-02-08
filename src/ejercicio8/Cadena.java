package ejercicio8;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author dark_
 */
public class Cadena {

    /////////////////////////////Atributes/////////////////////////////////////
    private String frase;
    private int longitud;
    ////////////////////////////Builders///////////////////////////////////////

    public Cadena(String frase, int longitudFrase) {
        this.frase = frase;
        this.longitud = longitudFrase;
    }

    public Cadena() {
    }
    ////////////////////////////Getters and Setters////////////////////////////

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitudFrase() {
        return longitud;
    }

    public void setLongitudFrase(int longitud) {
        this.longitud = longitud;
    }

    //////////////////////////////Methods//////////////////////////////////////
    public void crearFrase() {
         Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
         System.out.println("Ingrese una frase");
         this.frase = read.next();
         this.longitud = frase.length();
    }

    public void mostrarVocales() {
        String letra;
        int cantVocales = 0;

        for (int i = 0; i < this.longitud; i++) {

            letra = this.frase.toUpperCase().substring(i, i + 1);

            switch (letra) {
                case "A":
                    cantVocales++;
                    break;
                case "E":
                    cantVocales++;
                    break;
                case "I":
                    cantVocales++;
                    break;
                case "O":
                    cantVocales++;
                    break;
                case "U":
                    cantVocales++;
                    break;
                default:
                    break;

            }

        }
        System.out.printf("La cantidad de vocales encontrada en la frase es: %s\n", cantVocales);
    }

    public void invertirFrase() {
        String fraseInvertida = "";

        for (int i = this.longitud - 1; i >= 0; i--) {
            fraseInvertida = fraseInvertida.concat(this.frase.substring(i, i + 1));
        }
        System.out.printf("La 1ra frase ingresa es: %s\n", this.frase);
        System.out.printf("La frase invertida es: %s\n", fraseInvertida);
    }

    public void vecesRepetidas(String letra) {
        int cont = 0;

        for (int i = 0; i < this.longitud; i++) {
            if (this.frase.substring(i, i + 1).equalsIgnoreCase(letra)) {
                cont++;
            }
        }

        System.out.printf("La letra %s se encuentra %d\n en la frase", letra, cont);
    }

    public void compararLong(String frase2) {
        if (this.frase.length() > frase2.length()) {
            System.out.println("La 1ra frase ingresada es más larga que la 2da frase");
        } else {
            System.out.println("La 2da frase ingresada es más larga que la 1ra frase");
        }
    }

    public void unirFrases(String frase2) {
        System.out.println(this.frase.concat(" "+frase2));
    }

    public void reemplazar(String letra) {
        this.frase = this.frase.replace("a", letra);

        System.out.printf("La frase queda asi %s\n: ", this.frase);

    }

    public boolean contiene(String letra) {
        return this.frase.contains(letra);
    }

}
