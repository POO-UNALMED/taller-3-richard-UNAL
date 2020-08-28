package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;	
	private static int numTV;
	
	private Control control;
	

	final int MAX_NUMBER_CHANNEL = 120;
	final int MIN_NUMBER_CHANNEL = 1;
	final int MAX_NUMBER_VOLUME = 7;
	final int MIN_NUMBER_VOLUME = 0;
	
	public TV(Marca marca, boolean estado){
		this.marca = marca;
		this.estado = estado;
		TV.numTV++;
		
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		if (estado && canal >= MIN_NUMBER_CHANNEL && canal <= MIN_NUMBER_CHANNEL)
			this.canal = canal;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		if(estado && volumen >= MIN_NUMBER_VOLUME && volumen <= MAX_NUMBER_VOLUME)
			this.volumen = volumen;
	}

	public static int getNumTV() {
		return numTV;
	}
	
	
	public boolean getEstado() {
		return estado;
	}
	
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	
	
	public void canalUp() {
		this.setCanal(this.getCanal() + 1);
	}
	
	public void canalDown() {
		this.setCanal(this.getCanal() - 1);
	}
	
	public void volumenUp() {
		this.setCanal(this.getVolumen() + 1);
	}
	
	public void volumenDown() {
		this.setCanal(this.getCanal() - 1);
	}
	
	public void turnOn() {
		this.setEstado(true);
	}
	
	public void turnOff() {
		this.setEstado(false);
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}


}
