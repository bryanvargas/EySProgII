package com.logicajuego;

import com.juego.Casilla;


public final class LogicaSerpiente extends LogicaCasillero {
	 private int transportar ;
	
	 public LogicaSerpiente ( Casilla s, int t) {
		 super (s);
		 assert t <0 : "el retroceso debe ser hacia atras " ;
		 transportar = t;
	
	 }
	
	 @Override
	 public Casilla posicionarORetroceder () {
	 System . out. println ("PISO COLA de serpiente :( retrocede desde " + ( casillero . getPosicion ()+1)
	 + " hasta " + ( destino (). getPosicion ()+1));
	 return destino (). landHereOrGoHome ();
}
	 private Casilla destino() {
		  return casillero.encontrarCasilleroRelativo ( transportar );
		  }

	 
	 //solo implemenado para no dar error
	public boolean esElUltimoCasilero() {
		// TODO Auto-generated method stub
		return false;
	}
}
