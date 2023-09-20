package ar.unlam.materia;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMateria {

	@Test
	public void queSePuedeaCrearUnaMateria() {
		String nombre = "Pb2";
		Materia materia = new Materia (nombre,"");
	}

}
