//Se necesita de un vector que sea capaz de almacenar 10 números enteros entre 1 y 100.
// Realizar un programa que permita la carga por teclado de los 10 números solicitados.


import java.util.Scanner;


public class Ejercicio {
    int[] vector;

    public void resolver() {

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < vector.length; i++) {


            System.out.println("Ingrese un numero para el vector N " + (i + 1) + " :");
            int tecla = teclado.nextInt();

            while(tecla < 1 || tecla > 100){
                System.out.println("Numero incorrecto. Ingrese entre 1 y 100 para el vector N "+(i+1)+ " :");
                tecla = teclado.nextInt();
            }

            vector[i] = tecla;

        }
    }

    public void mostrar(){
        for (int i = 0; i < vector.length; i++) {
            System.out.println("el numero del vector N°" + (i+1) + " es: " + vector[i]);
        }
    }

    //constructor
    public Ejercicio(){
        vector = new int[10];
    }
}