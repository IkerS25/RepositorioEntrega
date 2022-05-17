package jcolonia.daw2021.SumatorioMVC2021;

import java.util.Scanner;

/**
 * @author Iker Sierra
 * Lista los elementos guardados.
 */
public class VistaListado extends Vista {
	

	/**
	 * El título.
	 */
	String título;
	
	/**
	 * La entrada por pantalla.
	 */
	Scanner sc = getEntrada();
	
	/**
	 * Hereda el título y la entrada por pantalla.
	 * @param título
	 * @param sc
	 */
	public VistaListado(String título, Scanner sc) {
		super(título, sc);
		this.título = título;

	}

	/**Muestra el listado general de todos los números guardados.
	 * @param conjunto
	 */
	public void  mostrarListado(ListaNúmeros conjunto) {
		
		for (int i = 0; i < conjunto.getNúmSumandos(); i++)
			System.out.printf("%f%n",conjunto.getPosiciónSumando(i));
	}
	
	/**
	 * Muestra la suma de todos los número en la pantalla.
	 * @param conjunto
	 */
	public void mostrarSuma(ListaNúmeros conjunto) {
		System.out.printf("La suma es: %f",conjunto.getSuma());
		
	}
}
