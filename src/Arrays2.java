import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        //Leer por consola una palabra
        //Definir un array de String
        //Obtener la longitud del Array considerando que en cad
        //posición se guardan 2 letras
        //Rellenar el Array
        //1. Definir variables
        String palabra;
        String[] letras;
        Scanner teclado = new Scanner(System.in);
        //2. Estructura
        //Leer la palabra
        System.out.println("Escriba la palabra ->");
        palabra = teclado.nextLine();

        if(palabra.length()%2==0){
            //Es par
            letras = new String[palabra.length()/2];
        }else {
            //Es impar
            letras = new String[palabra.length()/2+1];
        }


        //bucle
        for(int i = 0; i<letras.length;i++){
            int posicionInicial = i*2;
            System.out.println(posicionInicial);
            if(palabra.length()%2!=0 && i==letras.length-1){
                //Es impar
                letras[i]= palabra.substring(posicionInicial);
                System.out.println(letras[i]);
                break;
            }
            letras[i] = palabra.substring(posicionInicial,posicionInicial+2);
            System.out.println(letras[i]);
        }

    }

}
