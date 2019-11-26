package pb2.disqueria;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class testDisqueria {

	Disqueria miDisqueria= new Disqueria("Tower records");
	Disco a = new Cds("005","Pink Floyd","Animals", 1977, 2000.0,1); //Cd simple
	Disco b = new Cds("010","Pink Floyd", "The Dark Side Of The Moon", 1973, 2500.0, 2);
	Disco c = new Cds("008", "Pink Floyd", "The Division Bell", 1994, 2000.0,1);
	Disco d = new Vinilo("001", "Pink Floyd", "Animals", 1977, 20000.0, 1, "Negro");
	Disco e = new Vinilo("003", "Pink Floyd", "The Dark Side Of The Moon", 1973, 25000.0, 2,"Negro");
	Disco f = new Vinilo("009", "Pink Floyd", "The Division Bell", 1994, 20000.0,1, "Azul");
	Ventas v = new Ventas(100, 1, a);
	Ventas v1 = new Ventas(101, 1, b);
	Ventas v2 = new Ventas (102,2,c);
	
	@Test
	public void testQueVerifiqueQueSeAgregaronDosDiscos() {
		miDisqueria.agregarDisco(a);
		miDisqueria.agregarDisco(b);
		Integer valorEsperado=2;
		Integer valorActual= miDisqueria.getListaDeDiscos().size();
		Assert.assertEquals(valorEsperado, valorActual);
	}
	
	@Test
	public void testQueEliminaUnDiscoCorrectamente() {
		miDisqueria.agregarDisco(a);
		miDisqueria.agregarDisco(b);
		miDisqueria.agregarDisco(c);
		miDisqueria.agregarDisco(d);
		try {
			miDisqueria.eliminarDisco(b.getCodigo());
		} catch (DiscoInexistenteException e) {
			e.printStackTrace();
		}
		Integer valorEsperado=3;
		Integer valorActual= miDisqueria.getListaDeDiscos().size();
		Assert.assertEquals(valorEsperado, valorActual);
	}
	
	@Test
	public void testQueAgregaUnaVenta() {
		miDisqueria.agregarVenta(v);
		Integer valorEsperado=1;
		Integer valorActual= miDisqueria.getListaDeVentas().size();
		Assert.assertEquals(valorEsperado, valorActual);
	}
	
	@Test
	public void testQueEliminaUnaVenta() {
		try {
			miDisqueria.agregarVenta(v);
			miDisqueria.agregarVenta(v1);
			miDisqueria.agregarVenta(v2);
			miDisqueria.eliminarVenta(v.getIdVenta());
			Integer valorEsperado=2;
			Integer valorActual= miDisqueria.getListaDeVentas().size();
			Assert.assertEquals(valorEsperado, valorActual);
		} catch (VentaInexistenteException e) {
			e.printStackTrace();
		}
	}
	
	@Test (expected = VentaInexistenteException.class)
	public void testQueEliminaUnaVentaInexistente() throws VentaInexistenteException {
		miDisqueria.agregarVenta(v);
		miDisqueria.agregarVenta(v1);
		miDisqueria.agregarVenta(v2);
		miDisqueria.eliminarVenta(111);
	}
	
	@Test (expected = DiscoInexistenteException.class)
	public void testQueEliminaUnDiscoInexistente() throws DiscoInexistenteException {
		miDisqueria.agregarDisco(a);
		miDisqueria.agregarDisco(b);
		miDisqueria.agregarDisco(c);
		miDisqueria.agregarDisco(d);
		miDisqueria.eliminarDisco("000");
	}
	
	@Test (expected = PrecioInsuficienteException.class)
	public void testQueModificaMalUnPrecio() throws CdInexistenteException, PrecioInsuficienteException {
		Double precioNuevo=-230.0;
		miDisqueria.agregarVenta(v);
		miDisqueria.agregarVenta(v1);
		miDisqueria.agregarVenta(v2);
		miDisqueria.modificarPrecioDeUnCd(v.getDisco().getCodigo(), precioNuevo);
	}
	
	@Test
	public void testQueModificaPrecio() {
		try {
			Double precioNuevo= 3000.0;
			miDisqueria.agregarVenta(v);
			miDisqueria.agregarVenta(v1);
			Boolean valorEsperado = miDisqueria.modificarPrecioDeUnCd(v.getDisco().getCodigo(), precioNuevo);
			Assert.assertTrue(valorEsperado);
		} catch (CdInexistenteException | PrecioInsuficienteException e) {
			e.printStackTrace();
		}
	}
}
