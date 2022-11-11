package unico;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		/*Escribe un programa en que dado 
		 * un número del 1 a 7 escriba el 
		 * correspondiente nombre del día 
		 * de la semana.*/
		
		Scanner leer = new Scanner(System.in);
		int respuesta;
		String mensaje = null;
		
		System.out.println("Introduzca el número de un día de la semana[1-7]");
		respuesta = leer.nextInt();
		
		switch (respuesta) {
		case 1:
			mensaje = "Es lunes";
			break;
		case 2:
			mensaje = "Es martes";
			break;
		case 3:
			mensaje = "Es miercoles";
			break;
		case 4:
			mensaje = "Es jueves";
			break;
		case 5:
			mensaje = "Es viernes";
			break;
		case 6:
			mensaje = "Es sábado";
			break;
		case 7:
			mensaje = "Es domingo";
			break;
		default:
			mensaje = "ERROR";
		}
		
		System.out.println(mensaje);

	}

}