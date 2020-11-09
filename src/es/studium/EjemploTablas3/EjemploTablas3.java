package es.studium.EjemploTablas3;

import java.util.Scanner;

public class EjemploTablas3 {

	public static void main(String[] args) 
	{
		final int TAM = 5;
		Scanner teclado = new Scanner(System.in);
		int tablaOriginal[] = new int[TAM];
		float tablaResultado[] = new float[TAM];
		int i;
		for (i= 0; i<TAM; i++) 
		{
			System.out.println( "escribir el valor de tabla["+i+"]");
			tablaOriginal[i] = teclado.nextInt();
		}
		teclado.close();
		for (i= 0; i<TAM; i++) 
		{
			tablaResultado[i] = (float)tablaOriginal[i]/2;
			System.out.println(tablaResultado[i]);
		}
	}
}
