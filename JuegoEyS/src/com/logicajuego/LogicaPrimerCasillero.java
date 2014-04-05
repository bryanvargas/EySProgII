package com.logicajuego;

import java.util.ArrayList;

import com.juego.Casilla;
import com.juego.Jugador;



public final class LogicaPrimerCasillero extends LogicaCasillero {

	 private ArrayList <Jugador > jugadores = new ArrayList <Jugador >();

	 public LogicaPrimerCasillero ( Casilla s) {
		 super (s);
	 }

	 @Override
	 public boolean esElPrimerCasillero() {
		 return true ;
	 }

	 @Override
	 public void ingresar ( Jugador jugador ) {
		 jugadores.add ( jugador );
		 jugador.setCasillero ( casillero );
	 }

	 @Override
	
	 public void abandonar ( Jugador jugador ) {
		 jugadores.remove( jugador );
	 }

	 @Override
	 public boolean estaOcupado () {
		 return !jugadores.isEmpty ();
	 }

	 
	 //SOlo Implementado para que no de error
	public boolean esElUltimoCasilero() {
		// TODO Auto-generated method stub
		return false;
	}
}