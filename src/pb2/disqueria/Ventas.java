package pb2.disqueria;

import java.util.ArrayList;
import java.util.List;

public class Ventas implements Comparable<Ventas> {

	private Integer idVenta;
	private Integer cantidad;
	private Double total;
	private Disco disco;

	public Ventas(Integer idVenta, Integer cantidad, Disco disco) {
		this.idVenta = idVenta;
		this.cantidad = cantidad;
		this.total = total;
		this.disco = disco;
	}

	public Integer getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Integer idVenta) {
		this.idVenta = idVenta;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	

	public Disco getDisco() {
		return disco;
	}


	public void setDisco(Disco disco) {
		this.disco = disco;
	}


	@Override
	public int compareTo(Ventas o) {
		if(o.getIdVenta()> idVenta) {
			return 1;
		}
		else if(o.getIdVenta()< idVenta) {
			return -1;
		}
		return 0;
	}
}
