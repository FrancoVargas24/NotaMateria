package ar.unlam.materia;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNota {

	@Test
	public void queALCrearUnaNotaSuValordeNotaPorDefectoSeaCero() {
		
		
		
		
		Nota nota = new Nota ();
		
		
		Integer ve= 0;
		Integer vo=nota.getValor();
		
		assertEquals(ve,vo);
			
			
		
	}
	
	
	
	@Test
	public void queAlAsignarUnValorEntreUnoYDiezSeLeAsigneELValorALaNota() {
		
		
		
		
		Nota nota = new Nota ();
		
		
		Integer valor=7;
		nota.asignarValor(valor);
		
		Integer ve= 7;
		Integer vo=nota.getValor();
		assertEquals(ve,vo);
			
			
		
	}


	@Test
	public void queAlAsignarUnValorQueNoEsteEntreUnoYDiezNoSeLeAsigneELValorALaNota() {
		
		
		Nota nota = new Nota ()  ; // valor =0
		
		Integer valor=11;
		
		nota.asignarValor(valor); // valor = 0 
			
		Integer ve= 0;
		Integer vo=nota.getValor();
		
		assertEquals(ve,vo);
			
			
		
	}


}
