package practica1;

import java.lang.Math;

public class circulo extends elipse{
	//atributos
	private double radio=1;
	private String color="Azul";
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getRadio() {
		return radio;
	}
	public String getColor() {
		return color;
	}
	//constructores
	public circulo() {
	radio=1;
	color="azul";
	}
	public circulo(String color, String forma, double radio) {
		super(color, forma, 0, 0);
		// TODO Auto-generated constructor stub
		this.radio=radio;
		this.color=color;
		setForma(forma);
		setColor(color);
	}
	public circulo(double radio) {
		this.radio=radio;
	}
	public circulo(double radio, String color) {
		this.radio=radio;
		this.color=color;
	}
	
	public circulo(String color, String forma) {
		// TODO Auto-generated constructor stub
		this.color=color;
		setForma(forma);
		
	}
	//metodos
	public double CalcularArea() {
		double area= Math.PI * (Math.pow(this.radio, 2));
		return area;
	}
	public String toString() {
		return "Circulo[Radio="+this.radio+",Color="+this.color+",Area="+CalcularArea()+"]";
	}
}
