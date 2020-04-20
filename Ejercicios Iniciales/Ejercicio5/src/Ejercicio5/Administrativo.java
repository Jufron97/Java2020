package Ejercicio5;

public class Administrativo extends Empleado {
	
	int hsExtra,hsMes;

	public int getHsExtra() {
		return hsExtra;
	}

	public void setHsExtra(int hsExtra) {
		this.hsExtra = hsExtra;
	}

	public int getHsMes() {
		return hsMes;
	}

	public void setHsMes(int hsMes) {
		this.hsMes = hsMes;
	}
	
	public Administrativo(int dni,String nom,String ape,String mail,int sB,int hsEx,int hsMes) {
		super(dni,nom,ape,mail,sB);
		this.setHsExtra(hsEx);
		this.setHsMes(hsMes);
	}
	
	public String getDetalle() {
		return super.getDetalle()+" Sueldo: "+ this.getSueldo();
	}

	public double getSueldo() {
		return this.getsB()*(this.getHsExtra()*1.5+this.getHsMes())/this.getHsMes();
	}
	
}
