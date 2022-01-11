package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lector {

	public void leer() {

	}

	public String leerFichero(String nuevaPalabra) {

		try {
			BufferedReader br = new BufferedReader(new FileReader("wordlist.txt"));

			String line;

			final long timestamp = System.currentTimeMillis();

			while ((line = br.readLine()) != null) {
				if (line.equals(nuevaPalabra)) {

					if (line.equals(nuevaPalabra)) {
						br.close();
						System.out.println("\rCONSEGUIDO: " + line);
						System.out.println("Finalizado [Tiempo: " + (System.currentTimeMillis() - timestamp) + " ms]");
						return line;
					}
				}
			}
			br.close();
			System.out.println("\rNO conseguido");
			System.out.println("Finalizado [Tiempo: " + (System.currentTimeMillis() - timestamp) + " ms]");

		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return null;

	}

}
