package taller3.televisores;

class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;	
	private static int numTV;
	
	final int MAX_NUMBER_CHANNEL = 120;
	final int MIN_NUMBER_CHANNEL = 1;
	final int MAX_NUMBER_VOLUME = 7;
	final int MIN_NUMBER_VOLUME = 0;
	
	TV(Marca marca, boolean estado){
		this.marca = marca;
		this.estado = estado;
		TV.numTV++;
		
	}

	Marca getMarca() {
		return marca;
	}

	void setMarca(Marca marca) {
		this.marca = marca;
	}

	int getCanal() {
		return canal;
	}

	void setCanal(int canal) {
		if (estado && canal >= MIN_NUMBER_CHANNEL && canal <= MIN_NUMBER_CHANNEL)
			this.canal = canal;
	}

	int getPrecio() {
		return precio;
	}

	void setPrecio(int precio) {
		this.precio = precio;
	}

	int getVolumen() {
		return volumen;
	}

	void setVolumen(int volumen) {
		if(estado && volumen >= MIN_NUMBER_VOLUME && volumen <= MAX_NUMBER_VOLUME)
			this.volumen = volumen;
	}

	static int getNumTV() {
		return numTV;
	}
	
	
	boolean getEstado() {
		return estado;
	}
	
	void setEstado(boolean estado) {
		this.estado = estado;
	}

}
