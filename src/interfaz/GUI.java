package interfaz;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.Box;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class GUI {

	public JFrame frmBiblioteca;
	public JTextField indexField;
	public JButton ExaminarIndex;
	public JButton botonIndexar;
	public Box horizontalBox;

	public GUI() {
		initialize();
		frmBiblioteca.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBiblioteca = new JFrame();
		frmBiblioteca.setResizable(false);
		frmBiblioteca.setTitle("Biblioteca");
		frmBiblioteca.setBounds(100, 100, 1062, 644);
		frmBiblioteca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBiblioteca.getContentPane().setLayout(null);
		
		JLabel labelIndexPath = new JLabel("Ruta del Indice");
		labelIndexPath.setBounds(24, 33, 96, 27);
		frmBiblioteca.getContentPane().add(labelIndexPath);
		
		indexField = new JTextField();
		indexField.setEditable(false);
		indexField.setBounds(125, 35, 780, 25);
		frmBiblioteca.getContentPane().add(indexField);
		indexField.setColumns(10);
		
		ExaminarIndex = new JButton("Examinar");
		ExaminarIndex.setBounds(926, 34, 97, 25);
		frmBiblioteca.getContentPane().add(ExaminarIndex);
		
		botonIndexar = new JButton("Indexar");
		botonIndexar.setBounds(487, 73, 97, 25);
		frmBiblioteca.getContentPane().add(botonIndexar);
		
		horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Indice", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		horizontalBox.setBounds(12, 13, 1020, 101);
		frmBiblioteca.getContentPane().add(horizontalBox);
	}
}
