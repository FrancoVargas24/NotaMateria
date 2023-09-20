package ar.unlam.materia;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCursada {

	@Test
	public void queSePuedaCrearUnaCursada() {
		
		
		Alumno alumno = new Alumno(22, "Juan", "perez",123);
		Materia materia = new Materia("pb2", "123");
		Nota nota = new Nota();
		Cursada  cursada = new  Cursada (alumno,materia,nota);
		
		

		assertNotNull(cursada);
		
		
		Cursada  cursada1 = new  Cursada (alumno,materia);
		
		
		assertEquals(0, cursada1.getNota().getValor(),0.00);
		
			
	}
	
	
	
	@Test
	public void queSePuedaAsiganarUnValorEntreUnoYDiezaUnaNotaDeUnaCursada (){
		
		
		Alumno alumno = new Alumno(22, "Juan", "perez",123);
		Materia materia = new Materia("pb2","123");
		Nota nota = new Nota();
		Cursada  cursada = new  Cursada (alumno,materia,nota);

		Integer valor=7;
		cursada.calificar(valor);
		
		Integer vo=cursada.getNota().getValor();
		assertEquals(valor,vo);
		
		
			
	}
}
