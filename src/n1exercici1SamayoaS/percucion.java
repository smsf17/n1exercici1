package n1exercici1SamayoaS;

public class percucion extends instrumentos {

	public percucion(String nombre, int precio) {
		super(nombre, precio);
	}

	@Override
	public String tocar() {
		return "Està sonant un instrument de percussió";
	}
	
	@Override
	public String toString() {
		return " El instrumento de percución " + getNombre() 
				+" tiene un precio de "	+ getPrecio() + "€ " 
				+"."+ tocar();
	}
}
