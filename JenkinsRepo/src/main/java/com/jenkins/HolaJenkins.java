package com.jenkins;

public class HolaJenkins {

	public static void main(String[] args) {
		String bienvenida = "Hola Jenkins !!";
		int i = 0;
		for (char letra : bienvenida.toCharArray()) {
			i += 1;
			System.out.println("Linea " + i + ": " + letra);
		}		
	}
}