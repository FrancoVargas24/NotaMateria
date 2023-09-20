package ar.unlam.materia;

public class Materia {

	private String nombre;
	private String codigoMateria;

	public Materia(String nombre, String codigoMateria) {
		this.nombre = nombre;
		this.codigoMateria = codigoMateria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
