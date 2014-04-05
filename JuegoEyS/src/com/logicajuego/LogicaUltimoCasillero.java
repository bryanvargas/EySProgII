package com.logicajuego;

import com.juego.Casilla;



public final class LogicaUltimoCasillero extends LogicaCasillero {
	
	 public LogicaUltimoCasillero (Casilla s) {
		 super (s);
	 }
	
	 @Override
	 public boolean esUltimoCasillero () {
		 return true ;
	 }

	 
	
}