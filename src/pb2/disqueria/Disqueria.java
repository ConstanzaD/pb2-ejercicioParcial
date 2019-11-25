package pb2.disqueria;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Disqueria {
	private String nombre;
	private List<Disco> listaDeDiscos = new ArrayList<Disco>();
	private Set<Ventas> listaDeVentas = new TreeSet<Ventas>();

	public Disqueria(String nombre) {
		this.nombre = nombre;
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
			throw new DiscoInexistenteException();
		}
		return false;
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
			throw new VentaInexistenteException();
		}
		return false;
	}

	public ArrayList <Cds> listaDeCdsOrdenadosPorAnioDePublicacion() { // no es void
		return null;
	}

	public Integer cantidadDeVinilosVendidosDeColorNegro() { // no es void
		Integer total =0;
		for(Ventas v: this.listaDeVentas) {
			if(v.getVinilo().getColor() == "Negro") {
				total++;
			}
			return 0;
		}
		return total;
	}

	public Integer ventaTotalDeCdsSimples() { // no es void
		Integer total=0;
		for(Ventas v : this.listaDeVentas) {
			if(v.getCd().getCantidadDeCds() == 1) {
				total++;
			}
			return 0;
		}
		return total;
	}

	public Boolean modificarPrecioDeUnCd(String codigo, Double precio) throws CdInexistenteException, ModificacionErronea {
		for(Disco d : this.listaDeDiscos) {
			if(d instanceof Cds) {
				if(d.getCodigo().equals(codigo)) {
					d.setPrecio(precio);
					return true;
				}
				throw new CdInexistenteException();
			}
			throw new ModificacionErronea();
			
		}
		return false;
	}

}
