package ar.unlam.materia;

public class Alumno {

	private String nombre;
	private String apellido;
	private Integer dni;
	private Integer id;
	

	public Alumno(Integer dni, String apellido, String nombre, Integer fecha_nacimiento) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
		this.id=id;
	}

	public String  getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}
	
	public Integer id() {
		return this.id;
	}
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
