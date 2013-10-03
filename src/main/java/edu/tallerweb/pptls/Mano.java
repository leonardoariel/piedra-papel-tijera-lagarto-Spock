package edu.tallerweb.pptls;

public class Mano {

	private final Forma valor;

	public Mano(final Forma forma) {
		
		this.valor = forma;
		
		if(forma == null) {
			
			throw new RuntimeException("No implementado aún");
			
		}

	}
	
	public Resultado jugarCon(final Mano otra) {
		
		Integer manoUno = this.valor.getValor();
		Integer manoDos = otra.valor.getValor();
		
		if((manoUno == 0) && (manoDos > 2) ) {//GANA PIEDRA
			
			return Resultado.GANA;
			
		}
		
		if((manoUno == 1) && (manoDos == 4 || manoDos == 0)) { //GANA SPOCK
			
			return Resultado.GANA;
			
		}
		
		if((manoUno == 4) && (manoDos == 2 || manoDos == 3)) {//GANA TIJERA
			
			return Resultado.GANA;
			
		}
		
		if((manoUno == 3) && (manoDos == 2 || manoDos == 1)) {//GANA LAGARTO
			
			return Resultado.GANA;
			
		}
		
		if((manoUno == 2) && (manoDos < 2)) {//GANA PAPEL
			
			return Resultado.GANA;
			
		}
		
		if(this.valor.equals(otra.valor)) {//EMPATA
			
			return Resultado.EMPATA;
			
		}
		
		return Resultado.PIERDE;
		
	}
}



