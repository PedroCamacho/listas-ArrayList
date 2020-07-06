import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Reto {

	public static void main(String[] args) {
		// Inicialización
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<>();
		int desde, hasta, multi;

		// Proceso
		System.out.print("Introduzca el número inicial: ");
		desde = sc.nextInt();
		System.out.print("Introduzca el número final: ");
		hasta = sc.nextInt();
		System.out.print("Múltiplos a localizar: ");
		multi = sc.nextInt();

		// Proceso
		for (int i = desde; i <= hasta; i++)
			lista.add(i);
		for (int i = 0; i < lista.size(); i++) 
			if(lista.get(i)%multi!=0)
				lista.set(i,0);
		
		// Salida
		System.out.println("Los múltiplos son: " + lista);
		
	}
}
