
public class ControladorDelJuego {

	public static void main(String[] args) {
		/** esta clase "Juego" controla la lógica del juego
		 * es decir determina quien juega y quien gana el tatetí, o si hubo empate
		 */
		
		Tateti tateti = new Tateti(); //Creo un objeto tateti
		tateti.inicializarTablero(); // Inicializamos el tablero de tateti con "-"
		tateti.imprimirTablero(); // Mostramos en la consola el tablero de tateti
	
		
		boolean hayGanador = false; // esta variable determinará si hubo ganador
		boolean termino = false;// esta variable determina si el juego finalizó, será verdadero cuando el contador de jugadas sea 9
		int contadorDeJugadas = 1 ; // esta variable controla la cantidad de jugadas 
		
		/**
		 * si la cantidad de jugadas es menor a 9 y
		 * si no hay ganador 
		 * entonces el juego continua dentro del while
		 */
		while ( !hayGanador && !termino) { 
			tateti.turnoJugador("X"); // turno del jugador "X"
			/**
			 * con este while obligamos a que el jugador ingrese una posición que no esté utilizada
			 */
			while (!tateti.setTablero(tateti.getFilaIngresada(),tateti.getColIngresada(), "X")) {
				System.out.println("Esta ocupada! elija otra");
				tateti.turnoJugador("X");
			}
		
			hayGanador = tateti.gano(tateti.getFilaIngresada(),tateti.getColIngresada());
			/**
			 * verificamos si el jugador "X" ganó el juego 
			 */
			if (hayGanador) {
				tateti.setGanador("X"); //seteamos al ganador del juego
			}
			
			contadorDeJugadas = contadorDeJugadas +1; //incrementamos al contador de jugadas
			tateti.imprimirTablero(); //imprimimos el tablero en consola
			
			if(contadorDeJugadas ==9) { //verificamos si finalizó el juego
				termino =true;
			}
			/**
			 * si el oponente no ganó y si no finalizó el juego entonces debe jugar el otro jugador
			 */
			if (!hayGanador && !termino) { 
				tateti.turnoJugador("O");
				while (!tateti.setTablero(tateti.getFilaIngresada(),tateti.getColIngresada(),"O")) {
					System.out.println("Esta ocupada! elija otra");
					tateti.turnoJugador("O");
				}
				hayGanador = tateti.gano(tateti.getFilaIngresada(),tateti.getColIngresada());
				if (hayGanador) {
					tateti.setGanador("O");
				}
				contadorDeJugadas = contadorDeJugadas +1;
				tateti.imprimirTablero();		
			}
		}
		
		/**
		 * Mostramos el resultado del juego
		 */
		if (hayGanador) {
			System.out.println("Ganó " + tateti.getGanador());
		}else {
			System.out.println("Empate");
		}
		// El juego finalizó terminó su ejecución.
		
	}

}
