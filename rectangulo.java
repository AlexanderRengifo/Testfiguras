package practica1;

public class rectangulo extends formas {
	//atributos
	private double base;
	private double altura;
	//getters y setters
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	//constructores
	public rectangulo(String color, String forma,double base ,double altura) {
		super(color, forma);
		// TODO Auto-generated constructor stub
		this.altura=altura;
		this.base=base;
		setColor(color);
		setForma(forma);
		
	}
	public rectangulo(String color, String forma,double base) {
		super(color, forma);
		// TODO Auto-generated constructor stub
		this.base=base;
		setColor(color);
		setForma(forma);
	}
	//metodos
	public double area_cuadrado(double base,double altura) {
		return base*altura;
	}
	public double perimetro_cuadrado(double base,double altura) {
		return (2*base+2*altura);
	}
	public String toString() {
		return getForma()+"[Base="+this.base+" Altura="+this.altura+",Color="+getColor()+" Area= "+area_cuadrado(base, altura)+" Perimetro="+perimetro_cuadrado(base, altura)+"]";
	}
	public void cambio(double escala) {
		System.out.println("Ingrese la escala");
		escala = leer.nextDouble();
		System.out.println("Ingrese la base:");
		setAltura(leer.nextDouble()*escala);
		System.out.println("Ingrese la altura:");
		setBase(leer.nextDouble()*escala);
		System.out.println("Cambias realizados y adaptados a escala");
	}
}
