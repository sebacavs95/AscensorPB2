package ar.unlam.ascensor;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAscensor {

	@Test
	public void queSePuedaCrearUnAscensor() {
		Double pesoMaximo = 200.0;
		Integer cantidadPersonasMaximas = 3;
		
		Ascensor a = new Ascensor(pesoMaximo,cantidadPersonasMaximas, 0, 0);
		
		assertNotNull(a);
	}
	
	@Test
	public void queSePuedaCrearUnAscensorConPisoMaximoYPisoMinimo() {
		Integer pisoMinimo = 0;
		Integer pisoMaximo = 8;
		Double pesoMaximo = 200.0;
		Integer cantidadPersonasMaximas = 3;
		
		Ascensor a = new Ascensor(pesoMaximo,cantidadPersonasMaximas, pisoMinimo, pisoMaximo);
		
		assertNotNull(a);
	}

	@Test
	public void queUnAscensorVayaAUnPiso() {
		Integer pisoMinimo = 0;
		Integer pisoMaximo = 8;
		Double pesoMaximo = 200.0;
		Integer cantidadPersonasMaximas = 3;
		
		Ascensor miAsc = new Ascensor(pesoMaximo,cantidadPersonasMaximas, pisoMinimo, pisoMaximo);
		Integer pisoDestino = 3;
		
		miAsc.irAPiso(pisoDestino);
		
		Integer ve = pisoDestino;
		Integer vo = miAsc.getPisoActual();
		assertEquals(ve,vo);
	}
	
	@Test
	public void queCuandoElPisoDestinoSupereAlPisoMaximoElAscensorNoSeMueva() {
		Integer pisoMinimo = 0;
		Integer pisoMaximo = 8;
		Double pesoMaximo = 200.0;
		Integer cantidadPersonasMaximas = 3;
		
		Ascensor miAsc = new Ascensor(pesoMaximo,cantidadPersonasMaximas, pisoMinimo, pisoMaximo);
		Integer pisoActual = 0;
		Integer pisoDestino = 10;
		
		miAsc.irAPiso(pisoDestino);
		
		Integer ve = 0;
		Integer vo = miAsc.getPisoActual();
		assertEquals(ve,vo);
	}
	
	@Test
	public void queCuandoElPisoDestinoSeaMenorAlPisoMinimoElAscensorNoSeMueva() {
		Integer pisoMinimo = 0;
		Integer pisoMaximo = 8;
		Double pesoMaximo = 200.0;
		Integer cantidadPersonasMaximas = 3;
		
		Ascensor miAsc = new Ascensor(pesoMaximo,cantidadPersonasMaximas, pisoMinimo, pisoMaximo);
		Integer pisoActual = 0;
		Integer pisoDestino = -1;
		
		miAsc.irAPiso(pisoDestino);
		
		Integer ve = 0;
		Integer vo = miAsc.getPisoActual();
		assertEquals(ve,vo);
	}
	
	@Test
	public void queUnAscensorPuedaAbrirUnaPuerta() {
		Integer pisoMinimo = 0;
		Integer pisoMaximo = 8;
		Double pesoMaximo = 200.0;
		Integer cantidadPersonasMaximas = 3;
		
		Ascensor miAsc = new Ascensor(pesoMaximo,cantidadPersonasMaximas, pisoMinimo, pisoMaximo);
		Integer pisoActual = 0;
		Integer pisoDestino = pisoActual;
		Boolean estaAbierta = true;
		
		miAsc.abrirPuerta();
		
		Boolean ve = miAsc.getEstadoDeLaPuerta();
		
		assertTrue(ve);
		
	}
	
	@Test
	public void queCuandoQuieraIrAUnPisoLaPuertaNoEsteAbierta() {
		Integer pisoMinimo = 0;
		Integer pisoMaximo = 8;
		Double pesoMaximo = 200.0;
		Integer cantidadPersonasMaximas = 3;
		
		Ascensor miAsc = new Ascensor(pesoMaximo,cantidadPersonasMaximas, pisoMinimo, pisoMaximo);
		Integer pisoActual = 0;
		Integer pisoDestino = 7;
		Boolean estaAbierta = true;
		
		miAsc.abrirPuerta();
		
		miAsc.irAPiso(pisoDestino);
		
		Boolean ve = miAsc.getEstadoDeLaPuerta();
		
		assertFalse(ve);
		
	}
	
}
