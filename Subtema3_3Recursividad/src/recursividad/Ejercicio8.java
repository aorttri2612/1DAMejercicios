package recursividad;

public class Ejercicio8 {

	int totalDiscs = 3, startRod = 1, endRod = 3, tempRod = 2;

	public void hanoi(int discs, int from, int to, int temp) {
		if (discs == 1) {
			System.out.printf("%d → %d%n", from, to);
		} else {
			hanoi(discs - 1, from, temp, to);
			System.out.printf("%d → %d%n", from, to);
			hanoi(discs - 1, temp, to, from);
		}
	}

	public void show() {
		hanoi(totalDiscs, startRod, endRod, tempRod);
	}

	public static void main(String[] args) {
		new Ejercicio8().show();
	}
}