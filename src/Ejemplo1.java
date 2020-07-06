import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Ejemplo1 {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo");
		
		Collection <String> lista1 = new ArrayList<> (lista);
		System.out.println("Lista 1: " + lista1);

		ArrayList <Character> lista2 = new ArrayList<>();
		lista2.add('a');
		lista2.add('b');
		lista2.add('c');
		lista2.add('d');
		System.out.println("Lista 2: " + lista2);
		
		lista2.set(2, 'x');
		System.out.println("Lista 2': " + lista2);
		
		lista2.remove(2);
		System.out.println("Lista 2'': " + lista2);

		lista2.add(2, 'c');
		System.out.println("Lista 2: " + lista2);
	}

}
