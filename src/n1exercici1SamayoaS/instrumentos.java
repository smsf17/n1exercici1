package n1exercici1SamayoaS;

public abstract class instrumentos {
	
	private String nombre;
	private int precio;
	
	public instrumentos(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPrecio() {
		return precio;
	}
	
	public abstract String tocar();
	
	

}
