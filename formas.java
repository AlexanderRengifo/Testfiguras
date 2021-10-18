package practica1;
 
import java.util.Scanner;

public class formas {
	//atributos
	private String color;
	private String forma;
	//getters y setters
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getForma() {
		return forma;
	}
	public void setForma(String forma) {
		this.forma = forma;
	}
	public Scanner leer= new Scanner(System.in);
	//constructores
	public formas() {
		this.color="\0";
		this.forma="\0";
	}
	public formas(String color,String forma) {
		this.color=color;
		this.forma=forma;
	}
	//metodos
	public String toString() {
		return getForma()+"[Color="+getColor()+"]";
	}
	
}
