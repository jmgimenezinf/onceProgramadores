import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Tateti tateti = new Tateti();
		tateti.inicializarMatriz();
		tateti.imprimirTablero();
		int filaIngresada;
		int colIngresada;
		boolean gano = false;
		boolean termino = false;
		int i= 1 ;
		while ( i <=9 && !gano && !termino) {
			System.out.println("Turno jugador X");
			System.out.print("Ingrese la fila :");
			filaIngresada = teclado.nextInt();
			System.out.print("Ingrese la columna :");
			colIngresada = teclado.nextInt();
			while (!tateti.setTablero(filaIngresada,colIngresada, "X")) {
				System.out.println("Esta ocupada! elija otra");
				System.out.println("Turno jugador X");
				System.out.print("Ingrese la fila :");
				filaIngresada = teclado.nextInt();
				System.out.print("Ingrese la columna :");
				colIngresada = teclado.nextInt();
			}
			gano = tateti.gano(filaIngresada,colIngresada);
				i = i+1;
			if(i==9) {
				termino =true;
			}
			if (!gano && !termino) {
				tateti.imprimirTablero();
				System.out.println("Turno jugador O");
				System.out.print("Ingrese la fila :");
				filaIngresada = teclado.nextInt();
				System.out.print("Ingrese la columna :");
				colIngresada = teclado.nextInt();
				while (!tateti.setTablero(filaIngresada,colIngresada, "O")) {
					System.out.println("Esta ocupada! elija otra");
					gano = tateti.gano(filaIngresada,colIngresada);
					tateti.imprimirTablero();
					System.out.println("Turno jugador O");
					System.out.print("Ingrese la fila :");
					filaIngresada = teclado.nextInt();
					System.out.print("Ingrese la columna :");
					colIngresada = teclado.nextInt();
					
				}
				i = i+1;
			}
			gano = tateti.gano(filaIngresada,colIngresada);
			tateti.imprimirTablero();
		}

		
	}

}
