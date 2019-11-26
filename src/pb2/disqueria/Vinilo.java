package pb2.disqueria;

public class Vinilo extends Disco{
	
	private Integer cantidadDeDiscos;
	private String color;
	
	public Vinilo(String codigo, String artista, String titulo, Integer añoDePublicacion, Double precio,
			Integer cantidadDeDiscos, String color) {
		super(codigo, artista, titulo, añoDePublicacion, precio);
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
		return "Vinilo [cantidadDeDiscos=" + cantidadDeDiscos + ", color=" + color + "]";
	}
	
}
