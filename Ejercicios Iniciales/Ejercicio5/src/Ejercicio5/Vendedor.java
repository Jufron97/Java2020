package Ejercicio5;

public class Vendedor extends Empleado{
	
	int porcenCom,totalVen;

	public int getPorcenCom() {
		return porcenCom;
	}

	public void setPorcenCom(int porcenCom) {
		this.porcenCom = porcenCom;
	}

	public int getTotalVen() {
		return totalVen;
	}

	public void setTotalVen(int totalVen) {
		this.totalVen = totalVen;
	}
	
	public Vendedor(int dni,String nom,String ape,String mail,int sB,int porcenCom,int totalVen) {
		super(dni,nom,ape,mail,sB);
		this.setPorcenCom(porcenCom);
		this.setTotalVen(totalVen);
		}
	
	public String getDetalle() {
		return super.getDetalle()+" Sueldo: "+ this.getSueldo();
	}
	
	public double getSueldo() {
		return this.getsB()+(this.getPorcenCom()*this.getTotalVen()/100);
	}
	

}
