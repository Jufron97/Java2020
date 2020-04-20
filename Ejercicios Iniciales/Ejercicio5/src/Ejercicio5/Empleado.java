package Ejercicio5;

public class Empleado {
	
	int dni,sB;
	String nombre,apellido,mail;
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getsB() {
		return sB;
	}
	public void setsB(int sB) {
		this.sB = sB;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public Empleado(int dni,String nom,String ape,String mail,int sB) {
		
		this.setDni(dni);
		this.setNombre(nom);
		this.setApellido(ape);
		this.setMail(mail);
		this.setsB(sB);
	}
	
	public String getDetalle() {
		return "Nombre: "+this.getNombre() +" Apellido: "+ this.getApellido() +" Dni: "+ this.getDni();
	}
	
	
}
