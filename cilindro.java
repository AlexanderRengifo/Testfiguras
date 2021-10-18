package practica1;

public class cilindro extends circulo {
	//atributos
	private double altura=1;
	private double radio;
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAltura() {
		return altura;
	}
	circulo c= new circulo();
	//constructores
	public cilindro() {
	}
	public cilindro(double radio) {
		super(radio);
	}
	public cilindro(double radio,String color) {
		super(radio,color);
		c.setColor(color);
	}
	public cilindro(double altura,double radio,String color) {
		super(radio,color);
		this.altura=altura;
		c.setColor(color);
	}
	public cilindro(String color, String forma, double altura,double radio) {
		super(color, forma);
		// TODO Auto-generated constructor stub
		this.altura=altura;
		this.radio=radio;
		setColor(color);
		setForma(forma);

	}
	
	//metodos 
	public double CalcularVolumen() {
		double volumen=0;
		volumen= Math.PI *(c.CalcularArea()*this.altura);
		return volumen;
	}
	public String toString() {
		return "Cilindro[Radio="+c.getRadio()+",Color="+c.getColor()+",Altura="+this.altura+"]";
	} 
}
