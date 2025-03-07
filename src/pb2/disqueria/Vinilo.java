package pb2.disqueria;

public class Vinilo extends Disco{
	
	private Integer cantidadDeDiscos;
	private String color;
	
	public Vinilo(String codigo, String artista, String titulo, Integer aņoDePublicacion, Double precio,
			Integer cantidadDeDiscos, String color) {
		super(codigo, artista, titulo, aņoDePublicacion, precio);
		this.cantidadDeDiscos = cantidadDeDiscos;
		this.color = color;
	}

	public Integer getCantidadDeDiscos() {
		return cantidadDeDiscos;
	}

	public void setCantidadDeDiscos(Integer cantidadDeDiscos) {
		this.cantidadDeDiscos = cantidadDeDiscos;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public int compareTo(Disco o) {
		if(o.getAņoDePublicacion()> this.getAņoDePublicacion()) {
			return 1;
		}
		else if(o.getAņoDePublicacion()< this.getAņoDePublicacion()) {
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Vinilo [cantidadDeDiscos=" + cantidadDeDiscos + ", color=" + color + "]";
	}
	
}
