package pb2.disqueria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Disqueria {
	private String nombre;
	private List<Disco> listaDeDiscos;
	private Set<Ventas> listaDeVentas;

	public Disqueria(String nombre) {
		this.nombre = nombre;
		this.listaDeDiscos = new ArrayList<Disco>();
		this.listaDeVentas = new TreeSet<Ventas>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Disco> getListaDeDiscos() {
		return listaDeDiscos;
	}

	public void setListaDeDiscos(List<Disco> listaDeDiscos) {
		this.listaDeDiscos = listaDeDiscos;
	}

	public Set<Ventas> getListaDeVentas() {
		return listaDeVentas;
	}

	public void setListaDeVentas(Set<Ventas> listaDeVentas) {
		this.listaDeVentas = listaDeVentas;
	}

	public void agregarDisco(Disco nuevo) { // sin excepciones. No retorna nada
		this.listaDeDiscos.add(nuevo);
	}

	public Boolean eliminarDisco(String codigo) throws DiscoInexistenteException {
		Iterator<Disco> disc = this.listaDeDiscos.iterator();
		while (disc.hasNext()) {
			Disco aux = disc.next();
			if (aux.getCodigo().equals(codigo)) {
				disc.remove();
				return true;
			}
		}
		throw new DiscoInexistenteException();
	}

	public void agregarVenta(Ventas venta) {
		this.listaDeVentas.add(venta);
	}

	public Boolean eliminarVenta(Integer id) throws VentaInexistenteException {
		Iterator<Ventas> vent = this.listaDeVentas.iterator();
		while (vent.hasNext()) {
			Ventas aux = vent.next();
			if (aux.getIdVenta().equals(id)) {
				vent.remove();
				return true;
			}
		}
		throw new VentaInexistenteException();
	}

	public Set<Cds> listaDeCdsOrdenadosPorAnioDePublicacion() { // no es void
		Set<Cds> listaDeCds = new TreeSet<Cds>();
		for (Disco disc : listaDeDiscos) {
			if (disc instanceof Cds) {
				listaDeCds.add((Cds) disc);
			}
		}
		return listaDeCds;

	}

	public Integer cantidadDeVinilosVendidosDeColorNegro() { // no es void
		Integer total = 0;
		for (Ventas v : this.listaDeVentas) {
			if (v.getDisco() instanceof Vinilo) {
				if (((Vinilo) v.getDisco()).getColor() == "Negro") {
					total++;
				}
				return 0;
			}
		}
		return total;
	}

	public Integer ventaTotalDeCdsSimples() { // no es void
		Integer total = 0;
		for (Ventas v : this.listaDeVentas) {
			if (((Cds) v.getDisco()).getCantidadDeCds() == 1) {
				total++;
			}
			return 0;
		}
		return total;
	}

	public Boolean modificarPrecioDeUnCd(String codigo, Double precio)
			throws CdInexistenteException, PrecioInsuficienteException {
		if (precio > 0) {
			for (Disco d : this.listaDeDiscos) {
				if (d instanceof Cds) {
					if (d.getCodigo().equals(codigo)) {
						d.setPrecio(precio);
						return true;
					}
					throw new CdInexistenteException();
				}
			}
		}
		throw new PrecioInsuficienteException();
	}

}
