import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       char letra = 'j';
       boolean bandera = true;
       long numero = 8_000_000L;
       float numeroConDecimales = 9.5F;

       int[] numerosEnteros = new int[5];

       for(int i = 0; i<numerosEnteros.length; i++){
           numerosEnteros[i]=(i+1)*5;
       }

       for(int elemento : numerosEnteros){
           System.out.println(elemento);
       }

       //Leer por la consola una palabra
        //Guardar cada letra en una posicion de un array de chars
        //recomendación se puede usar el método charAt

        //1. Definir variables
        String palabra;
        char[] letras;
        Scanner teclado = new Scanner(System.in);
        //2. Estructura
        //Leer la palabra
        System.out.println("Escriba la palabra ->");
        palabra = teclado.nextLine();
        letras = new char[palabra.length()];
        //bucle
        for(int i = 0; i<letras.length;i++){
            letras[i] = palabra.charAt(i);
            System.out.println(letras[i]);
        }

        for(char elemento:letras){
            System.out.println(elemento);
        }

    }
}