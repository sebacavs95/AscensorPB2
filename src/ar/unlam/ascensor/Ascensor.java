package ar.unlam.ascensor;

public class Ascensor {

	private Double pesoMaximo;
	private Object cantidadPersonasMaximas;
	private Integer pisoMinimo;
	private Integer pisoMaximo;
	private Integer pisoActual;
	private boolean estaAbierta;

	public Ascensor(Double pesoMaximo, Integer cantidadPersonasMaximas, Integer pisoMinimo, Integer pisoMaximo) {
		this.setPesoMaximo(pesoMaximo);
		this.setCantidadPersonasMaximas(cantidadPersonasMaximas);
		this.setPisoMinimo(pisoMinimo);
		this.setPisoMaximo(pisoMaximo);
		this.pisoActual = 0;
		this.estaAbierta = false;
	}

	public Double getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(Double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public Object getCantidadPersonasMaximas() {
		return cantidadPersonasMaximas;
	}

	public void setCantidadPersonasMaximas(Object cantidadPersonasMaximas) {
		this.cantidadPersonasMaximas = cantidadPersonasMaximas;
	}

	public Integer getPisoMinimo() {
		return pisoMinimo;
	}

	public void setPisoMinimo(Integer pisoMinimo) {
		this.pisoMinimo = pisoMinimo;
	}

	public Integer getPisoMaximo() {
		return pisoMaximo;
	}

	public void setPisoMaximo(Integer pisoMaximo) {
		this.pisoMaximo = pisoMaximo;
	}

	public void irAPiso(Integer pisoDestino) {
		this.estaAbierta = false;
		if(estaAbierta == false) {
			if(pisoDestino <= pisoMaximo && pisoDestino >= pisoMinimo) {
				this.pisoActual = pisoDestino;
			} else if (pisoDestino < pisoMinimo){
		}
	}
			
		}
	

	public Integer getPisoActual() {
		return this.pisoActual;
	}

	public void abrirPuerta() {
		this.estaAbierta = true;
		
	}

	public Boolean getEstadoDeLaPuerta() {
		
		return this.estaAbierta;
	}

	public void cerrarPuerta() {
		this.estaAbierta = false;
		
	}
	
	
}
