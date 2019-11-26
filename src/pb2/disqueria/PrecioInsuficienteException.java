package pb2.disqueria;

public class PrecioInsuficienteException extends Exception {
	 
	public PrecioInsuficienteException () {
		super("El precio a ingresa debe ser mayor a 0");
	}
}
