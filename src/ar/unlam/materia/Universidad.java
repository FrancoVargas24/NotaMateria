package ar.unlam.materia;

public class Universidad {

	private String nombreUniversidad;
	private Alumno[] alumnos;
	private Materia[] materias;
	private static final Integer CANTIDADMAXIMADEALUMNOS = 50;
	private static final Integer CANTIDADMAXIMADEMATERIAS = 50;

	public Universidad(String nombreUniversidad) {
		this.nombreUniversidad = nombreUniversidad;
		alumnos = new Alumno[CANTIDADMAXIMADEALUMNOS];
		materias = new Materia[CANTIDADMAXIMADEMATERIAS];
	}

	public void incribirAUnAlumnoALaUniversidad(Alumno alumno) {

		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] == null) {
				alumnos[i] = alumno;
				break;
			}
		}
	}
	public String getNombreUniversidad() {
		return nombreUniversidad;
	}

	public void setNombreUniversidad(String nombreUniversidad) {
		this.nombreUniversidad = nombreUniversidad;
	}

	public Materia[] getMaterias() {
		return materias;
	}

	public void setMaterias(Materia[] materias) {
		this.materias = materias;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

	public void registrarEnUnaMateria(Alumno alumno) {

		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] == null) {
				alumnos[i] = alumno;
				break;
			}
		}
	}

	public Alumno buscarAlumno(Alumno alumno) {
		Alumno buscado = null;
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i].getNombre() == alumno.getNombre()) {
				buscado = alumnos[i];
				return buscado;
			}
		}
		return buscado;
	}

	public Alumno[] getAlumnos() {

		return alumnos;
	}

	/*
	 * public void evaluar(dni, codigoMateria, nota) {
	 * 
	 * };
	 */
}
