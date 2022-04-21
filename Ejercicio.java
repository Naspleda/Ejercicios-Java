//Se necesita de un vector que sea capaz de almacenar 10 números enteros entre 1 y 100.
// Realizar un programa que permita la carga por teclado de los 10 números solicitados.


import java.util.Scanner;


public class Ejercicio {

    public void prueba(){
        Scanner teclado = new Scanner(System.in);
        int var = 0;
        int tecla = teclado.nextInt();

        do{
            System.out.println("Ingrese un número para el vector N° " + (var + 1) + " :");
            int tecla = teclado.nextInt();
            vector[i] = tecla;

        }while(tecla <= 0 || tecla >100)
    }

    int[] vector;

    public void resolver() {

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < vector.length; i++) {

            System.out.println("Ingrese un número para el vector N° " + (i + 1) + " :");
            int tecla = teclado.nextInt();

            if(tecla <= 0 || tecla >100){
                System.out.println("Numero incorrecto. Ingrese entre 1 y 100");
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
        vector = new int[3];
    }
}


