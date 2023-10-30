import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {
        //Leer por consola una palabra
        //Definir un array de String
        //Obtener la longitud del Array considerando que en cada
        //posición se guardan 3 letras
        //Rellenar el Array
        //1. Definir variables
        String palabra;
        String[] letras;
        Scanner teclado = new Scanner(System.in);
        //2. Estructura
        //Leer la palabra
        System.out.println("Escriba la palabra ->");
        palabra = teclado.nextLine();

        if(palabra.length()%3==0){
            //Es par
            letras = new String[palabra.length()/3];
        }else {
            //Es impar
            letras = new String[palabra.length()/3+1];
        }


        //bucle
        for(int i = 0; i<letras.length;i++){
            int posicionInicial = i*3;
            System.out.println(posicionInicial);
            if(palabra.length()%3!=0 && i==letras.length-1){
                //Es impar
                letras[i]= palabra.substring(posicionInicial);
                System.out.println(letras[i]);
                break;
            }
            letras[i] = palabra.substring(posicionInicial,posicionInicial+3);
            System.out.println(letras[i]);
        }

    }

}
