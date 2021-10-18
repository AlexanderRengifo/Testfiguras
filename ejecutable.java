package practica1;

public class ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu = 0;
		rectangulo r = new rectangulo("\0", "\0", 0,0);
		elipse e = new elipse("\0","\0",0,0);
		formas f = new formas();
		circulo c = new circulo("\0","\0",0);
		cilindro cilindro = new cilindro("\0","\0",0,0);
		cuadrado cu = new cuadrado(null,null,0);
		do {
			System.out.println("______________________________" + "\t---Menu---\n" + "1.Elipse\n" + "2.Rectangulo\n"
					+ "3.Informacion Registrada\n" + "4.Salir\n" + "Ingrese una opcion");
			menu = f.leer.nextInt();
			switch (menu) {
			case 1:
				int menu_e = 0;
				do {
					System.out.println("______________________________" + "\t---Menu---\n" + "1.Elipse\n"
							+ "2.Circulo\n" + "3.Cilindro\n" + "4.Regresar\n" + "Ingrese una opcion");
					menu_e = f.leer.nextInt();
					switch (menu_e) {
					case 1:
						
						System.out.println("Ingrese el color de la Elipse:");
						e.setColor(f.leer.next());
						e.setForma("elipse");
						System.out.println("Ingrese el Radio mayor de la elipse:");
						e.setRadio_mayor(f.leer.nextDouble());
						System.out.println("Ingrese el Radio menor de la elipse:");
						e.setRadio_menor(f.leer.nextDouble());
						System.out.println(e.toString());
						break;
					case 2:
						
						System.out.println("Ingrese el color del circulo:");
						c.setColor(f.leer.next());
						c.setForma("Circulo");
						System.out.println("Ingrese el Radio del circulo:");
						c.setRadio(f.leer.nextDouble());
						System.out.println(c.toString());
						break;
					case 3:
						
						System.out.println("Ingrese el color del Cilindro:");
						cilindro.setColor(f.leer.next());
						cilindro.setForma("Cilindro");
						System.out.println("Ingrese el Radio del Cilindor:");
						cilindro.setRadio(f.leer.nextDouble());
						System.out.println("Ingrese la altura:");
						cilindro.setAltura(f.leer.nextDouble());
						System.out.println(cilindro.toString());
						break;
					default:
						System.out.println("Opcion invalida");
						break;
					}

				} while (menu_e != 4);
				break;
			case 2:
				int menu_c=0;
				do {
					System.out.println("______________________________" + "\t---Menu---\n" + "1.Cuadrado\n"
							+ "2.Rectangulo\n" + "3.Regresar\n" + "Ingrese una opcion");
					menu_c = f.leer.nextInt();
					switch (menu_c) {
					case 1:
						cu.setForma("cuadrado");
						System.out.println("Ingrese el color del cuadrado:");
						cu.setColor(f.leer.next());
						System.out.println("Ingrese uno de sus lados:");
						cu.setBase(f.leer.nextDouble());
						System.out.println(cu.toString());
						break;
					case 2:
						
						System.out.println("Ingrese el color del rectangulo:");
						r.setColor(f.leer.next());
						System.out.println("Ingrese la base del rectangulo");
						r.setBase(f.leer.nextDouble());
						System.out.println("Ingrese la altura del recangulo");
						r.setAltura(f.leer.nextDouble());
						System.out.println(r.toString());
						break;
					default:
						System.out.println("Opcion invalida");
						break;
					}
				} while (menu_c!=3);
			case 3:
				System.out.println("\t--Informacion--");
				System.out.println(e.toString());
				System.out.println(c.toString());
				System.out.println(cilindro.toString());
				System.out.println(cu.toString());
				System.out.println(r.toString());
			default:
				System.out.println("Opcion invalida");
				break;
			}
		} while (menu != 4);
	}

}
