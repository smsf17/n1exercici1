package n1exercici1SamayoaS;

public class viento extends instrumentos {

	public viento(String nombre, int precio) {
		super(nombre, precio);
	}

	@Override
	public String tocar() {
		return "Està sonant un instrument de vent";
	}

	@Override
	public String toString() {
		return " El instrumento de viento " + getNombre() 
				+" tiene un precio de "	+ getPrecio() + "€ " 
				 + "." + tocar();
	}
	
	
	
}
