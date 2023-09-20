package ar.unlam.materia;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAlumno {

	@Test
	public void queSePuedaCrearUnAlumno() {
		
		
		//Preparacion de datos
		String nombre = "andres";
		String apellido = "Gomez";
		Integer dni = 44444;
		Integer id = 2412;
		// ejecucion
		
		Alumno alumno = new Alumno (dni, apellido, nombre,id);
		
		// validacion 
		
		assertNotNull(alumno);
		
		assertEquals(nombre, alumno.getNombre());
		
		
		
		
		
	}

}
