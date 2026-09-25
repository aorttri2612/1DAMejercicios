package tema12_Colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ShowListIterator {

	public void show() {

		ListIterator<Integer> it;
		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(4);
		list.add(6);

		//Recorrido de la lista hacia atrás:
		it = list.listIterator(list.size());
		while (it.hasPrevious()) {
			System.out.printf(" %d ", it.previous());// 6  4  2  1
		}

		it = list.listIterator(1);//Se coloca antes del elemento que se encuentra en la posición 1
		System.out.printf("\n %d ", it.next());//2
		System.out.printf("\n %d ", it.nextIndex());//2
		System.out.printf("\n %d ", it.previousIndex());//1
		it.add(3);//Una llamada posterior a next() no se ve afectada
		System.out.printf("\n %d ", it.next());//4 
		it.add(5);
		System.out.printf("\n %d ", it.previous());//5 Una llamada posterior a previous() devuelve el nuevo elemento
		System.out.printf("\n %d \n", it.next());//5
		it.set(7);//sustituye el último elemento devuelto por next() por 7
		for (Integer i : list) {
			System.out.printf(" %d ", i);//1  2  3  4  7  6 
		}

	}

	public static void main(String[] args) {

		new ShowListIterator().show();

	}

}
