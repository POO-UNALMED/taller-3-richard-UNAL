package taller3.televisores;

public class Control {
	private TV tv;
	
	public void enlazar(TV tv) {
		this.tv = tv;
	}

	public TV getTv() {
		return tv;
	}

	public void setTv(TV tv) {
		this.tv = tv;
		tv.setControl(this);
	}
	
	
	public void canalUp() {
		tv.setCanal(tv.getCanal() + 1);
	}
	
	public void canalDown() {
		tv.setCanal(tv.getCanal() - 1);
	}
	
	public void volumenUp() {
		tv.setCanal(tv.getVolumen() + 1);
	}
	
	public void volumenDown() {
		tv.setCanal(tv.getCanal() - 1);
	}
	
	public void turnOn() {
		tv.setEstado(true);
	}
	
	public void turnOff() {
		tv.setEstado(false);
	}

	public void setCanal(int canal) {
		tv.setCanal(canal);
	}
}
