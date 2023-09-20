package ar.unlam.materia;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUniversidad {

	@Test
	public void incribirAUnAlumno() {
		
		String nombre = "Juan";
		String apellido = "Perez";
		Integer dni = 4444;
		
		Alumno alumno = new Alumno(dni, apellido, nombre,123);
		
		String nombreUniversidad = "Unlam";
		
		Universidad universidad = new Universidad(nombreUniversidad);
		
		universidad.incribirAUnAlumnoALaUniversidad(alumno);
		
		//universidad.registrar
		
		String nombreAComprobar = "Juan";
		
		
		assertEquals(universidad.buscarAlumno(alumno).getNombre(), nombreAComprobar);
	
	}
	
public void incribirAUnAlumnoAUnaMateria() {
		
		String nombre = "Juan";
		String apellido = "Perez";
		Integer dni = 4444;
		
		Alumno alumno = new Alumno(dni, apellido, nombre,123);
		
		String nombreUniversidad = "Unlam";
		
		Universidad universidad = new Universidad(nombreUniversidad);
		
		
		universidad.registrarEnUnaMateria(alumno);
		
		String nombreMateria = "PB2";
		String codigoMateria = "AAS159";
		Materia materia = new Materia(nombreMateria, codigoMateria);
		
		
		String nombreAComprobar = "PB2";
		
		
		assertEquals(universidad.buscarAlumno(alumno).getNombre(), nombreAComprobar);
		
		
		
		
		
		
		
	}
}
