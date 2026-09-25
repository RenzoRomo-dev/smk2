package com.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- Menú de operaciones ---");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Registrar Cliente");
            System.out.println("3. Calcular Salarios");
            System.out.println("4. Control Stock Productos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            switch (opcion) {
                case 1:
                    System.out.println( "Nombre del Producto");
                    String NombProd= scanner.nextLine();
                    break;
                case 2:

                    break;
                case 5:
                    System.out.println("Saliendo.");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente nuevamente.");
            }
        } while (opcion != 5);

    }
}
