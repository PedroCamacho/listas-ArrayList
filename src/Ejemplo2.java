import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejemplo2 {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		lista.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5));
		System.out.println("Lista inicial: \t\t\t" + lista);

		Object[] listaArray = new Integer[lista.size()];
		listaArray = lista.toArray();
		
		List<Integer> subLista = lista.subList(7, 9);
		subLista.clear();
		System.out.println("Lista modificada: \t\t" + lista);

		lista.remove((Object) 1);

		System.out.println("Hay más otro '1':\t\t" + lista.contains(1));

		System.out.print("Lista sin el primer '1':\t");
		while (!lista.isEmpty()) {
			Integer e = lista.get(0);
			System.out.print(e + " ");
			lista.remove(0);
		}

		System.out.println("\nCopia en Array:\t\t\t" + Arrays.toString(listaArray));
	}
}
