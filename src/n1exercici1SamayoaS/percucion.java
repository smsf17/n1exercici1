package n1exercici1SamayoaS;

public class percucion extends instrumentos {

	public percucion(String nombre, int precio) {
		super(nombre, precio);
	}

	@Override
	public String tocar() {
		return "Est� sonant un instrument de percussi�";
	}
	
	@Override
	public String toString() {
		return " El instrumento de percuci�n " + getNombre() 
				+" tiene un precio de "	+ getPrecio() + "� " 
				+"."+ tocar();
	}
}
