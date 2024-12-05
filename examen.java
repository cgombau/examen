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
                	System.out.print("Introduce una frase: ");
                    String fraseLetra = sc.nextLine();
                    System.out.print("Introduce la letra que quieres contar: ");
                    char letra = sc.next().charAt(0);
                    int contador = 0;
                    for (int i = 0; i < fraseLetra.length(); i++) {
                        if (fraseLetra.charAt(i) == letra) {
                            contador++;
                        }
                    }
                    System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");
                    sc.nextLine();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        } while (opcion != 0);
        sc.close();
	}
}
