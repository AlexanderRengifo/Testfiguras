package practica1;

public class elipse extends formas {
	//atributos 
	 private double radio_mayor;
	 private double radio_menor;
	 private String color;
	 private String forma;
	 //getter y setters
	 
	 public double getRadio_mayor() {
		return radio_mayor;
	}
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
	public void setRadio_mayor(double radio_mayor) {
		this.radio_mayor = radio_mayor;
	}
	public double getRadio_menor() {
		return radio_menor;
	}
	public void setRadio_menor(double radio_menor) {
		this.radio_menor = radio_menor;
	}
	 //constrctores
	 public elipse() {
		 this.radio_mayor=0;
		 this.radio_menor=0;
		 this.color="\0";
		 this.forma="\0";
	 }
	public elipse(String color, String forma,double radio_mayor,double radio_menor) {
		super(color, forma);
		// TODO Auto-generated constructor stub
		this.radio_mayor=radio_mayor;
		this.radio_menor=radio_menor;
		setColor(color);
		setForma(forma);
	}
	//metodos
	public String toString() {
		return getForma()+"[Radio mayor="+this.radio_mayor+" Radio menor="+this.radio_menor+",Color="+getColor()+" Area= "+area_elipse(getRadio_menor(), getRadio_mayor())+"]";
	}
	public double area_elipse(double radio_menor,double radio_mayor) {
		return Math.PI*(radio_mayor*radio_menor);
	}
}
