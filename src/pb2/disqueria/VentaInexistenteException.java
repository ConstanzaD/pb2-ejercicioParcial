package pb2.disqueria;

public class VentaInexistenteException extends Exception {
	
	public VentaInexistenteException() {
		super("La venta no existe.");
	}
}
