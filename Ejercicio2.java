//En un vector de 15 posiciones se almacenan las edades de 15 alumnos.
//Se desea un programa que sea capaz de determinar
//cuál es la mayor edad y cuál es la menor edad que se encuentra entre los estudiantes.

import java.util.Collections;
import java.util.Scanner;

public class Ejercicio2 {
    int[] vector;

    public void resolver() {

        Scanner teclado = new Scanner(System.in);

    for(int i = 0; i<vector.length;i++) {
        System.out.println("Ingrese la edad para el alumno " +(i+1));
        int tecla = teclado.nextInt();
    }

}

    public void mostrar(){
        System.out.println("max");
    }

    public Ejercicio2() {
        vector = new int[5];
    }
}
