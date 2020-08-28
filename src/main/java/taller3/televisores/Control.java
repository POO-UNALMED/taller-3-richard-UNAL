package taller3.televisores;

class Control {
	private TV tv;
	
	void enlazar(TV tv) {
		this.tv = tv;
	}

	TV getTv() {
		return tv;
	}

	void setTv(TV tv) {
		this.tv = tv;
	}
	
	
	void canalUp() {
		tv.setCanal(tv.getCanal() + 1);
	}
	
	void canalDown() {
		tv.setCanal(tv.getCanal() - 1);
	}
	
	void volumenUp() {
		tv.setCanal(tv.getVolumen() + 1);
	}
	
	void volumenDown() {
		tv.setCanal(tv.getCanal() - 1);
	}
	
	void turnOn() {
		tv.setEstado(true);
	}
	
	void turnOff() {
		tv.setEstado(false);
	}

	void setCanal(int canal) {
		tv.setCanal(canal);
	}
}
