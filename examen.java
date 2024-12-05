package examen;

import java.util.Scanner;

public class examen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opcion;
		
		do {
            System.out.println("Menú");
            System.out.println("1. Concatenar dos palabras");
            System.out.println("2. Visualizar el número de palabras de una frase");
            System.out.println("3. Contar cuántas veces aparece una letra en una frase");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                	System.out.print("¿Seguro que quieres salir? (s/n): ");
                    char confirmacion = sc.next().charAt(0);
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        } while (opcion != 0);
        sc.close();
	}
}
