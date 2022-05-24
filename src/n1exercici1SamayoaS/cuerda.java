package n1exercici1SamayoaS;

public class cuerda extends instrumentos{

	public cuerda(String nombre, int precio) {
		super(nombre, precio);
	}

	@Override
	public String tocar() {
		return "Està sonant un instrument de corda";
	}

	@Override
	public String toString() {
		return " El instrumento de cuerda " + getNombre() 
				+" tiene un precio de "	+ getPrecio() + "€ " 
				+" cuerdas."
				+ tocar();
	}
}
