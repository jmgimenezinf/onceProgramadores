
public class Tateti {

	
	public static int dim = 3; 	
	public static String jugadorUno = "X";
	public static String jugadorDos = "O";
	public String [][] tablero = new String [dim][dim];
	
	
	
	public void inicializarMatriz() {
		for (int i = 0; i < dim; i++) {
			for (int j = 0; j<dim ; j++) {
				this.tablero[i][j] = "-";
			}
		}
	}
	public boolean gano(int fila,int col) {
		if (testHorizontal(fila)) {
			return true;
		}else if (testVertical(col)){
			return true;
		}else if (testIdentidad()) {
			return true;
		}else if (testStock()) {
			return true;
		} else {
			return false;

		}
		
	}
	
	public boolean testHorizontal(int fila) {
		String primeraPos = tablero[fila][0];
		
		for (int j = 0; j < dim; j++) {
			if (tablero[fila][j] != primeraPos) {
				return false;
			} 
		}
		return true;	
	}
	public boolean testVertical(int col) {
		String primeraPos = tablero[0][col];
		
		for (int i = 0; i < dim; i++) {
			if (tablero[i][col] != primeraPos) {
				return false;
			} 
		}
		return true;	
	}
	public boolean testIdentidad() {
		String primeraPos = tablero[0][0];
		for (int i = 0; i < dim; i++) {
			if( primeraPos != tablero[i][i]){
				return false;
			}
			
		}
		return true;
	}
	public boolean testStock() {
		String primeraPos = tablero[0][2];
		for (int i = 0; i < dim; i++) {
			if( primeraPos != tablero[i][2-i]){
				return false;
			}
			
		}
		return true;
	}
	public boolean isSet(int fila,int col) {
		return ((tablero[fila][col] == "-")? false :true);
	}
	
	public boolean setTablero( int fila, int col,String jugador) {
		if ( this.isSet(fila, col)) {
			return false;
		}
		tablero[fila][col] = jugador;
		return true;
		
	} 
	
	public void imprimirTablero(){
		for (int i = 0; i < dim; i++) {
			for (int j = 0; j < dim; j++) {
				System.out.print(tablero[i][j] + " ");
			}
		System.out.println("");
		} 
		
	}
	
	

}
