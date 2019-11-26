package pb2.disqueria;

public abstract class Disco implements Comparable<Disco> {
	
	private String codigo;
	private String artista;
	private String titulo;
	private Integer añoDePublicacion;
	private Double precio;
	
	public Disco(String codigo, String artista, String titulo, Integer añoDePublicacion, Double precio) {
		this.codigo = codigo;
		this.artista = artista;
		this.titulo = titulo;
		this.añoDePublicacion = añoDePublicacion;
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAñoDePublicacion() {
		return añoDePublicacion;
	}

	public void setAñoDePublicacion(Integer añoDePublicacion) {
		this.añoDePublicacion = añoDePublicacion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
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
		return "Disco [codigo=" + codigo + ", artista=" + artista + ", titulo=" + titulo + ", añoDePublicacion="
				+ añoDePublicacion + ", precio=" + precio + "]";
	}
	
}
