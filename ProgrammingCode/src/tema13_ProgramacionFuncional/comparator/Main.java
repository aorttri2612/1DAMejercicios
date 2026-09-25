package tema13_ProgramacionFuncional.comparator;

import java.util.Arrays;
import java.util.List;

public class Main{
	
	public void show() {
		List<Integer> list = Arrays.asList(3, 2, 6, 1, 5, 4);
		list.sort(new ListOrder());
		for (Integer i : list) {// 1  2  3  4  5  6
			System.out.printf(" %d ", i);
		}
	}

	public static void main(String[] args) {

		new Main().show();

	}

}
