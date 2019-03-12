package es.deusto.prog.java.fichas.basicas;

import java.util.Scanner;

public class IfTernario {
	public static void main(String[] args) {
		ejemplo();
	}
	
	private static void ejemplo() {
		Scanner scan = new Scanner( System.in );
		System.out.print( "Introduce tu edad: " );
		int edad = scan.nextInt();
		String mensaje = "Eres " + (edad >= 18 ? "mayor" : "menor") + " de edad";
		System.out.println( mensaje );
		scan.close();
	}
}
