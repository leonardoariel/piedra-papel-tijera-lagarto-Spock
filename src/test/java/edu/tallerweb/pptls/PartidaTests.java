package edu.tallerweb.pptls;

import static org.junit.Assert.*;

import org.junit.Test;

public class PartidaTests {

	@Test
	public void queSpockVaporizaPiedra() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Spock vaporiza piedra",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void queSpockVaporizaTijera() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Spock vaporiza tijera",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
	}
		
	@Test
	public void queSpockEmpataconSpock() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.PAPEL);
		
		
		assertEquals("Spock empata con Spock",
				Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void queTijeraEmpataConTijera() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.TIJERA);
		
		
		assertEquals("Tijera Empata contra Tijera",
				Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void quePiedraGanaATijera() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Piedra gana a Tijera",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
	}
	
	@Test
	public void quePiedraGanaALagarto() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Piedra gana a LAGARTO",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
	}
	
	@Test
	public void queTijeraGanaALagarto() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("Spock vaporiza PAPEL",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
	}
	
	@Test
	public void queLargartoGanaAPapel() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("Lagarto gana a PAPEL",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
	}
	
	@Test
	public void quePiedraPierdeContraSpock() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("Piedra Pierde contra Spock",
				Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));
	}
	
	@Test
	public void queTijeraPierdeContraSpock() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("Tijera Pierde contra Spock",
				Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));
	}
	
	@Test
	public void quePapelPierdeConTijera() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Papel pierde contra Tijera",
				Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));
	}
	
}
