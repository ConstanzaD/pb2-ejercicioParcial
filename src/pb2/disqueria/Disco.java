package pb2.disqueria;

public abstract class Disco {
	
	private String codigo;
	private String artista;
	private String titulo;
	private Integer a�oDePublicacion;
	private Double precio;
	
	public Disco(String codigo, String artista, String titulo, Integer a�oDePublicacion, Double precio) {
		this.codigo = codigo;
		this.artista = artista;
		this.titulo = titulo;
		this.a�oDePublicacion = a�oDePublicacion;
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

	public Integer getA�oDePublicacion() {
		return a�oDePublicacion;
	}

	public void setA�oDePublicacion(Integer a�oDePublicacion) {
		this.a�oDePublicacion = a�oDePublicacion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
}
