package pb2.disqueria;

public class DiscoInexistenteException extends Exception {
	
	public DiscoInexistenteException() {
		super("El disco no existe.");
	}
}
