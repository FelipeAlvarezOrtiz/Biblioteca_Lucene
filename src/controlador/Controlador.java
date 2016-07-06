package controlador;

import interfaz.GUI;
import modelo.PDFManager;

public class Controlador {
	
	final protected String filesPath = "";
	
	PDFManager pdfConverter = new PDFManager();
	
	GUI inter;
	
	public Controlador(GUI interfaz){
		inter = interfaz;
	}
}
