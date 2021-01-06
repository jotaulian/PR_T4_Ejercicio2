package es.studium.tema4.ejercicio2;

import java.awt.*;

public class ejercicio2 extends Frame
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
		add(btnCalcular);
		add(lblResultado);
		add(txtResultado);
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new ejercicio2();
	}

}
