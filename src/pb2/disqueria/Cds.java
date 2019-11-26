package pb2.disqueria;

public class Cds extends Disco{
	
	private Integer cantidadDeCds;

	public Cds(String codigo, String artista, String titulo, Integer añoDePublicacion, Double precio,
			Integer cantidadDeCds) {
		super(codigo, artista, titulo, añoDePublicacion, precio);
		this.cantidadDeCds = cantidadDeCds;
	}

	public Integer getCantidadDeCds() {
		return cantidadDeCds;
	}

	public void setCantidadDeCds(Integer cantidadDeCds) {
		this.cantidadDeCds = cantidadDeCds;
	}

	@Override
	public int compareTo(Disco o) {
		if(o.getAñoDePublicacion()> this.getAñoDePublicacion()) {
			return 1;
		}
		else if(o.getAñoDePublicacion()< this.getAñoDePublicacion()) {
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Cds [cantidadDeCds=" + cantidadDeCds + "]";
	}
}
