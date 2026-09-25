package tema12_Colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShowArrayList {

	public void show() {

		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2;
		List<Integer> list3;
		List<Integer> list4;

		list1.add(1);
		list1.add(2);//Se añaden los elementos al final de la lista
		list1.add(6);
		list1.add(2, 5);//Se añade el 5 en la posición 2
		for (Integer i : list1) {//Recorremos la lista con un bucle for-each: 1  2  5  6
			System.out.printf(" %d ", i);
		}
		System.out.println();
		list2 = List.of(3,4);
		list1.addAll(2, list2);//Se inserta list2 en la posición 2 de list1
		for (Integer i : list1) {// 1  2  3  4  5  6 
			System.out.printf(" %d ", i);
		}
		System.out.println();
		list3 = List.of(7,8);
		list1.addAll(list3);//Se inserta list3 al final de list1
		for (Integer i : list1) {// 1  2  3  4  5  6  7  8
			System.out.printf(" %d ", i);
		}
		System.out.printf("\nEl elemento de la posición 3 es: %d", list1.get(3));//4
		System.out.printf("\nEl elemento 4 se encuentra en la posición %d", list1.indexOf(4));//3
		list1.add(4);//Se añade un 4 al final de list1
		System.out.printf("\nLa posición del 4 en list1 por el final es: %d\n", list1.lastIndexOf(4));//8
		list1.remove(8);//Se elimina el elemento de la posición 8, que es el último 4 insertado
		for (Integer i : list1) {// 1  2  3  4  5  6  7  8
			System.out.printf(" %d ", i);
		}
		list1.set(6, 8);//Se reemplaza el elemento que se encuentra en la posición 6 por un 8
		System.out.println();
		for (Integer i : list1) {// 1  2  3  4  5  6  8  8
			System.out.printf(" %d ", i);
		}
		System.out.printf("\nLa sublista comprendida entre las posiciones 2 y 5 es: ");
		for (Integer i : list1.subList(2, 6)) {// 3  4  5  6
			System.out.printf(" %d ", i);
		}
		System.out.printf("\nEl 4 %s se encuentra en list1", list1.contains(4) ? "sí" : "no");//sí
		System.out.printf("\nEl 9 %s se encuentra en list1", list1.contains(9) ? "sí" : "no");//no

		//list1: 1  2  3  4  5  6  8  8
		//list2: 3  4
		//list3: 7  8
		System.out.printf("\nTodos los elementos de list2 %s se encuentran en list1",
				list1.containsAll(list2) ? "sí" : "no");//sí
		System.out.printf("\nTodos los elementos de list3 %s se encuentran en list1\n",
				list1.containsAll(list3) ? "sí" : "no");//no
		list1.removeAll(list3);//Se eliminan de list1 todos los elementos de list3, es decir, el 8
		for (Integer i : list1) {// 1  2  3  4  5  6 
			System.out.printf(" %d ", i);
		}
		System.out.println();
		list1.retainAll(list2);//Intersección entre list1 y list2
		for (Integer i : list1) {// 3  4
			System.out.printf(" %d ", i);
		}
		System.out.printf("\nEl tamaño de list1 es: %d", list1.size());//2
		System.out.printf("\nlist1 %s está vacía", list1.isEmpty() ? "sí" : "no");//no
		list1.clear();//Elimina todos los elementos de list1
		System.out.printf("\nlist1 %s está vacía", list1.isEmpty() ? "sí" : "no");//sí
		list4 = Arrays.asList(1, 2, 3, 4);//Devuelve una lista a partir de un varargs
		System.out.print("\nlist4 creada con Arrays.asList: ");
		for (Integer i : list4) {// 1  2  3  4
			System.out.printf(" %d ", i);
		}
	}

	public static void main(String[] args) {

		new ShowArrayList().show();

	}

}
