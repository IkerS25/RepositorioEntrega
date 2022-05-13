package jcolonia.daw2021.SumatorioMVC2021;

import java.util.Scanner;

public class VistaAñadirSumando extends Vista {

	/**
	 * Texto visible para identificar la vista.
	 */
	String título;

	/**
	 * La entrada por pantalla.
	 */
	Scanner entrada = getEntrada();

	public VistaAñadirSumando(String título, Scanner sc) {
		super(título, sc);
		this.título = título;

	}

	// Cargar sumando
	public void cargarSumando(ListaNúmeros listaProvisional) throws SumatorioNumberException {
		String númeroElegidoTexto;
		ListaNúmeros listaGeneral = new ListaNúmeros();
		boolean elección;
		double númeroElegido;
		try {
			System.out.print(">Introduzca un nuevo valor: ");
			númeroElegidoTexto = entrada.nextLine();
			elección = pedirConfirmación(númeroElegidoTexto);
			
			if(elección=true) {
				númeroElegido = ListaNúmeros.transformarEntradaTexto(númeroElegidoTexto);
				listaGeneral.add(númeroElegido);
				System.out.println("→ Se ha agregado un valor");
			}else {
				System.out.println("→ No se ha agregado ningún Valor");
			}
				
			for(int i=0; i<listaGeneral.getNúmSumandos();i++) {
				listaProvisional.add(listaGeneral.getPosiciónSumando(i));
				
			}
		} catch (NumberFormatException ex) {
		
		}
	}
}
