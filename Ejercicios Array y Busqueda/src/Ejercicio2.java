/*2. Buscador de Cédulas (Base de Datos Bancaria)
Un banco tiene una lista de 1.000 clientes organizados de forma estricta y ascendente por su
 número de cédula o ID.
El Problema: Un cliente llega a la ventanilla y da su número. El sistema debe encontrar sus
 datos de la manera más rápida posible (en pocos pasos).
Algoritmo a usar: Búsqueda Binaria. Como los datos ya están ordenados, este algoritmo permitirá
 encontrar al cliente dividiendo la lista a la mitad en cada paso.*/

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] cedulas =
        {1234, 2345, 3456, 4567, 6789, 7891, 8912, 9012, 
        10000, 10230, 12345, 13456, 14567, 15678, 16789};
        int low = 0;
        int high = cedulas.length - 1;

        System.out.println("Ingrese su numero de cedula: ");
        int nCedula = sc.nextInt();
        sc.close();

        while (low <= high) {
        int mid = low + (high - low) / 2;

        if (cedulas[mid] == nCedula) {
            System.out.println("Se encontro la cedula en la posicion: " + mid);
            return;

        } else if (cedulas[mid] < nCedula) {
            low = mid + 1;    
        
        } else {
            high = mid - 1;  
        }
        }
        System.out.println("No se encontro la cedula");

    }
}
