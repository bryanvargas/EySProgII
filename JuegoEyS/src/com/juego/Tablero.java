package com.juego;

import java.util.ArrayList;

import com.logicajuego.LogicaPrimerCasillero;
import com.logicajuego.LogicaEscalera;
import com.logicajuego.LogicaCasilleroRegular;
import com.logicajuego.LogicaSerpiente;

public final class Tablero {
	 private ArrayList <Casilla > casilleros = new ArrayList <Casilla >();
	 private static int MINNUMCASILLeros = 10;
	
	 public Tablero ( int numCasillero , int[][] escaleras , int[][] serpientes ) {
	
	 assert numCasillero > MINNUMCASILLeros : " Debe ser mayor a 10 "
	 + MINNUMCASILLeros + " casilleros ";
	 crearCasilleros ( numCasillero );
	 crearEscaleras ( escaleras );
	 crearSerpientes ( serpientes );
	 }
	
	 private void crearCasilleros (int numCasilleros ) {
		 System .out . println ("Hay: " + numCasilleros + " casillros");
		 System.out.println("*******************");
		 for (int posicion =0 ; posicion < numCasilleros ; posicion ++) {
			 Casilla casillero = new Casilla ( posicion , this );
			 casilleros .add ( casillero );
			 casillero . setRolCasillero ( new LogicaCasilleroRegular ( casillero ));
		 }
		 primerCasillero().setRolCasillero(new LogicaPrimerCasillero(primerCasillero()));
	 }
	
	 public Casilla primerCasillero () {
		 return casilleros.get(0);
	 }
	
	 public Casilla ultimoCasillero () {
		 return casilleros.get( casilleros . size () -1);
	 }
	
	
	 public Casilla encontrarCasillero ( int posicion ) {
		 assert ( posicion >0) && ( posicion < numeroCasillas ()) : " inexistent square ";
		 return casilleros .get( posicion );
	 }
	
	 private int numeroCasillas() {
		 assert ! casilleros.isEmpty ();
		 return casilleros.size ();
	 }
	
	 private void crearSerpientes(int [][] serpientes ) {
	 for (int i=0; i< serpientes . length ; i++) {
		 assert serpientes [i]. length == 2;
		
		 int posicionDesde = serpientes [i ][0] -1;
		 int posicionHasta = serpientes [i ][1] -1;
		 int transportar = posicionHasta - posicionDesde ;
		
		 assert transportar <0 ;
		 assert ( posicionHasta > 0) && ( posicionHasta < numeroCasillas () -1);
		 assert ( posicionDesde < numeroCasillas () -1) && ( posicionDesde >0);
		
		 System . out. println ("serpiente desde " + ( posicionDesde +1)
		 + " hasta " + ( posicionHasta +1));
		 System.out.println("*******************");
		
		 Casilla casilleroSerpiente = casilleros . get( posicionDesde );
		 casilleroSerpiente . setRolCasillero (new LogicaSerpiente ( casilleroSerpiente , transportar ));
	 	}
	 }
	
	 private void crearEscaleras(int [][] escaleras ) {
		 for (int i=0; i< escaleras . length ; i++) {
			 assert escaleras [i]. length == 2;
			
			 int posicionDesde = escaleras [i ][0] -1;
			 int posicionHasta = escaleras [i ][1] -1;
			
			 int transportar = posicionHasta - posicionDesde ;
			
			 assert transportar >0;
			 assert ( posicionHasta < numeroCasillas ()) && ( posicionHasta > 0);
			 assert ( posicionDesde > 0) && ( posicionDesde < numeroCasillas ());
			
			 System . out. println ("Escalera desde " + ( posicionDesde +1)
			 + " hasta " + ( posicionHasta +1));
			
			 Casilla casilleroEscalera = casilleros.get( posicionDesde );
			 casilleroEscalera . setRolCasillero ( new LogicaEscalera ( casilleroEscalera , transportar ));
		}
	 }
}