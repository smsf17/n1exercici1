package n1exercici1SamayoaS;

public class n1exercici1 {

	public static void main(String[] args) {
		
		viento flauta 		= new viento("flauta", 12);
		cuerda guitarra 	= new cuerda("Guitarra clasica", 75);
		percucion maracas 	= new percucion("maracas", 10);
		
		System.out.println(flauta.toString());
		System.out.println(guitarra.toString());
		System.out.println(maracas.toString());
	}

}
