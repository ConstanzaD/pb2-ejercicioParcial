package pb2.disqueria;

import java.util.ArrayList;
import java.util.List;

public class Ventas implements Comparable<Ventas> {

	private Integer idVenta;
	private Integer cantidad;
	private Double total;
	private Cds cd;
	private Vinilo vinilo;

	public Ventas(Integer idVenta, Integer cantidad, Double total, Cds cd) {
		this.idVenta = idVenta;
		this.cantidad = cantidad;
		this.total = total;
		this.cd = cd;
	}

	public Ventas(Integer idVenta, Integer cantidad, Double total, Vinilo vinilo) {
		this.idVenta = idVenta;
		this.cantidad = cantidad;
		this.total = total;
		this.vinilo = vinilo;
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

	public Cds getCd() {
		return cd;
	}

	public void setCd(Cds cd) {
		this.cd = cd;
	}

	public Vinilo getVinilo() {
		return vinilo;
	}

	public void setVinilo(Vinilo vinilo) {
		this.vinilo = vinilo;
	}

	@Override
	public int compareTo(Ventas e) {
		if(e.getIdVenta()> idVenta) {
			return 1;
		}
		else if(e.getIdVenta()< idVenta) {
			return -1;
		}
		return 0;
	}
}
