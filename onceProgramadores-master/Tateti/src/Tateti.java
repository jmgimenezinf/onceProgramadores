import java.util.Scanner;

public class Tateti {

	
	private static int dim = 3; 	
	private String ganador;
	private String [][] tablero = new String [dim][dim];
	private Scanner teclado = new Scanner(System.in);
	private int filaIngresada;
	private int colIngresada;
	
	
	/**
	 * método para inicializar el tablero con "-"
	 */
	public void inicializarTablero() {
		for (int i = 0; i < dim; i++) {
			for (int j = 0; j<dim ; j++) {
				this.tablero[i][j] = "-";
			}
		}
	}

	/**
	 * método para verificar si el jugador ganó el juego en una jugada
	 */
	public boolean gano(int fila,int col) {
		if (testHorizontal(fila)) {
			return true;
		}else if (testVertical(col)){
			return true;
		}else if (testDiagonalPrincipal()) {
			return true;
		}else if (testDiagonalSecundaria()) {
			return true;
		} else {
			return false;

		}
		
	}
	/**
	 * método para determinar si hay ganador en dirección horizontal
	 */
	public boolean testHorizontal(int fila) {
		String primeraPos = tablero[fila][0];
		
		for (int j = 0; j < dim; j++) {
			if (tablero[fila][j]== "-") {
				return false;
			}else {
				if (tablero[fila][j] != primeraPos) {
					return false;
				}
			}
		}
		return true;	
	}
	/**
	 * método para determinar si hay ganador en dirección vertical
	 */
	public boolean testVertical(int col) {
		String primeraPos = tablero[0][col];
		
		for (int i = 0; i < dim; i++) {
			if (tablero[i][col]== "-") {
				return false;
			}else {
				if (tablero[i][col] != primeraPos) {
					return false;
				} 
			}
		}
		return true;	
	}
	/**
	 * método para determinar si hay ganador en dirección de la identidad de matriz
	 */
	public boolean testDiagonalPrincipal() {
		String primeraPos = tablero[0][0];
		for (int i = 0; i < dim; i++) {
			if (tablero[i][i]== "-") {
				return false;
			}else {
				if( primeraPos != tablero[i][i]){
					return false;
				}
			}
			
		}
		return true;
	}
	/**
	 * método para determinar si hay ganador en dirección de diagonal secundaria de matriz
	 */
	public boolean testDiagonalSecundaria() {
		String primeraPos = tablero[0][2];
		for (int i = 0; i < dim; i++) {
			if (tablero[i][2-i]== "-") {
				return false;
			}else {
				if( primeraPos != tablero[i][2-i]){
					return false;
				}
			}
			
		}
		return true;
	}
	/**
	 * método para verificar si la posición en el tablero ha sido utilizada
	 */
	
	public boolean isSet(int fila,int col) {
		return ((tablero[fila][col] == "-")? false :true);
	}
	
	/**
	 * método para verificar si la posición en el tablero ha sido utilizada
	 */
	
	public boolean setTablero( int fila, int col,String jugador) {
		if ( this.isSet(fila, col)) {
			return false;
		}
		tablero[fila][col] = jugador;
		return true;
		
	} 
	/**
	 * método para imprimier el tablero en consola
	 */
	public void imprimirTablero(){
		for (int i = 0; i < dim; i++) {
			for (int j = 0; j < dim; j++) {
				System.out.print(tablero[i][j] + " ");
			}
		System.out.println("");
		} 
		
	}
	/**
	 * método para permitir jugar a un jugador ingresado como parámetro
	 */
	public void turnoJugador(String jugador) {
		System.out.println("Turno jugador " + jugador);
		System.out.print("Ingrese la fila :");
		this.setFilaIngresada(teclado.nextInt());
		System.out.print("Ingrese la columna :");
		this.setColIngresada(teclado.nextInt());
	}
	
	// getters an seters
	public int getFilaIngresada() {
		return filaIngresada;
	}
	public int getColIngresada() {
		return colIngresada;
	}
	public String getGanador() {
		return ganador;
	}

	public void setFilaIngresada(int filaIngresada) {
		this.filaIngresada = filaIngresada;
	}
	public void setColIngresada(int colIngresada) {
		this.colIngresada = colIngresada;
	}
	public void setGanador(String ganador) {
		this.ganador = ganador;
	}
	

}
