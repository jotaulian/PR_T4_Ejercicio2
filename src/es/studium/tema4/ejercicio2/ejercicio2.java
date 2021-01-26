package es.studium.tema4.ejercicio2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ejercicio2 extends Frame implements WindowListener, ActionListener
{
	private static final long serialVersionUID = 1L;
	Label lblCantidad = new Label("Introduzca la cantidad");
	Label lblPorcentaje = new Label("Introduzca el porcentaje");
	Label lblResultado = new Label("Resultado");
	
	TextField txtCantidad = new TextField(10);
	TextField txtPorcentaje = new TextField(10);
	TextField txtResultado = new TextField(20);
	Button btnCalcular = new Button("Calcular");
	
	public ejercicio2() {
		setLayout(new FlowLayout());
		setTitle("Calcular el IVA");
		setSize(300,200);
		add(lblCantidad);
		add(txtCantidad);
		add(lblPorcentaje);
		add(txtPorcentaje);
		btnCalcular.addActionListener(this);
		add(btnCalcular);
		add(lblResultado);
		add(txtResultado);
		
		addWindowListener(this);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	
	public void windowActivated(WindowEvent arg0){}
	public void windowClosed(WindowEvent arg0){}
	public void windowClosing(WindowEvent arg0){
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent arg0){}
	public void windowDeiconified(WindowEvent arg0){}
	public void windowIconified(WindowEvent arg0){}
	public void windowOpened(WindowEvent arg0){}
	
	//Main method
	public static void main(String[] args)
	{
		new ejercicio2();
	}

	public void actionPerformed(ActionEvent arg0)
	{
		//Tomamos los valores de cantidad y porcentaje. Les cambiamos el tipo de double a String para poder hacer calculos.
		double cantidad = Double.parseDouble(txtCantidad.getText());
		double porcentaje = Double.parseDouble(txtPorcentaje.getText());
		
		//Guardamos el resultado de la cuenta en una variable
		double resultado = cantidad*(porcentaje/100);
		
		//Insertamos el resultado en el campo de texto. Para eso debemos cambiar el tipo a String
		txtResultado.setText(Double.toString(resultado));
	}

}
