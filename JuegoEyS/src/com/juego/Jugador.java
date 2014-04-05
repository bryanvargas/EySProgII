package com.juego;



public final class Jugador {
	 private Casilla casillero = null ;
	 private String nombre ;
	
	 public Casilla getCasillero () {
	 return casillero ;
	 }
	
	 public void setCasillero ( Casilla casillero ) {
	 this.casillero = casillero ;
	 }
	
	 public int posicion () {
		 return casillero.getPosicion ();
	 }
	
	 public String getNombre() {
		 return nombre ;
	 }
	
	 public Jugador( String strNombre ) {
	 nombre = strNombre ;
	 }
	
	 @Override
	 public String toString () {
		 return nombre ;
	 }
	
	 public boolean wins () {		
		 return casillero.esUltimoCasillero();
	 }
	 
	 public void avanzar(int movimiento ) {
		  assert movimiento >0 : "no hay moviientos negativos";
		  casillero . abandonar ( this );
		  casillero = casillero . moveAndLand ( movimiento );
		  casillero . ingresar ( this );
		  }
}
