package practica1;

public class cuadrado extends rectangulo{
	// atributos
	private double base;
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	//constructores
	public cuadrado(String color, String forma, double base) {
		super(color, forma, base);
		// TODO Auto-generated constructor stub
		setColor(color);
		setForma(forma);
		this.base=base;
	}

	//metodos
	public String toString() {
		return getForma()+"[Base="+this.base+" Color="+getColor()+" Area= "+area_cuadrado(base, base)+" Perimetro="+perimetro_cuadrado(base,0)+"]";
	}
	
}
