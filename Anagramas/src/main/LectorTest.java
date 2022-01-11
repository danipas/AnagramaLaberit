package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LectorTest {

	Lector l = new Lector();
	String palabra;
	String result;

	@Test
	void ultimaPalabra() {
		Lector l = new Lector();
		palabra = "ZzzzzZZZzzzzzzZzzzzzzz";
		String result = l.leerFichero(palabra);

		assertEquals(result, palabra);
	}

	@Test
	void primeraPalabra() {
		palabra = "'";
		result = l.leerFichero(palabra);
		assertEquals(result, palabra);
	}

	@Test
	void noConseguido() {
		palabra = "esta palabra no esta";
		result = l.leerFichero(palabra);
		assertFalse(palabra.equals(result), "correcto!");
	}

	@Test
	void palabraVacia() {
		palabra = "";
		result = l.leerFichero(palabra);
		assertEquals(palabra, result);
	}

	@Test
	void esNull() {
		palabra = "esta palabra no esta";
		result = l.leerFichero(palabra);
		assertNull(result);
	}

}
