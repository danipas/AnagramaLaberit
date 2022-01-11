package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boolean continuar = true;
		Scanner sc = new Scanner(System.in);

		while (continuar) {

			System.out.println("Introduce tu palabra a buscar:");
			String nuevaPalabra = sc.next();
			Lector l = new Lector();
			l.leerFichero(nuevaPalabra);

			continuar = preguntar(sc);

		}

		sc.close();
	}

	public static boolean preguntar(Scanner sc) {

		System.out.println("Quieres probar de nuevo?");
		System.out.println("1.- SI");
		System.out.println("2.- NO");
		String seleccion = sc.next();

		if (seleccion.isEmpty() || seleccion.toUpperCase().equals("NO") || seleccion.equals("2")) {
			System.out.println("Espero que lo hayas disfrutado.");
			System.out.print("Cerrando sesion...");
			return false;
		} else if (!seleccion.toUpperCase().equals("SI") && !seleccion.equals("1")) {
			System.out.println("Esa opcion no es correcta");
			System.out.print("Cerrando sesion...");
			return false;
		}

		return true;
	}

}
