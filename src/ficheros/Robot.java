package ficheros;

import java.io.Serializable;

public class Robot implements Comparable<Robot>, Serializable{

	private static int id_robot = 1;
	
	private String nombre;
	private int vida, ID;
	
	public Robot(String nombre, int vida) {
		
		this.nombre = nombre;
		this.vida = checkvida(vida);
		this.ID = id_robot; 
		id_robot ++;
		
	}
	
	public int checkvida (int vida) {
	int vx = 0;
	
	if(vida >=0 && vida <= 100) {
		
		vx = vida;
	}
		
	return vx;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = checkvida(vida);
	}

	public int getID() {
		return ID;
	}
	
	public String toString() {
		return "Robot " + ID  + ": Nombre: " + nombre + ", Vida: " + vida;
	}

	@Override
	public int compareTo(Robot r) {
		if(this.getVida() < r.getVida()) return -1; else return 0;
	}


	@Override
	public boolean equals(Object obj) {
		Robot other = (Robot) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (vida != other.vida)
			return false;
		return true;
	}
	
	



}
