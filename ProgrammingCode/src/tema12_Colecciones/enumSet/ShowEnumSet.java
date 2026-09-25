package tema12_Colecciones.enumSet;

import java.util.EnumSet;

public class ShowEnumSet {

	public void show() {

		EnumSet<Operation> allOperations1, allOperations2, operations1, operations2, operations3, operations4;

		allOperations1 = EnumSet.allOf(Operation.class);
		System.out.printf("allOf: %s", allOperations1);//allOf: [PLUS, MINUS, TIMES, DIVIDE]

		allOperations2 = EnumSet.copyOf(allOperations1);
		System.out.printf("\ncopyOf: %s", allOperations2);//copyOf: [PLUS, MINUS, TIMES, DIVIDE]

		operations1 = EnumSet.noneOf(Operation.class);
		operations1.add(Operation.PLUS);
		operations1.add(Operation.MINUS);
		System.out.printf("\nnoneOf y add: %s", operations1);//noneOf y add: [PLUS, MINUS]

		operations2 = EnumSet.complementOf(operations1);
		System.out.printf("\ncomplementOf: %s", operations2);//complementOf: [TIMES, DIVIDE]

		operations3 = EnumSet.of(Operation.DIVIDE, Operation.MINUS);
		System.out.printf("\nof: %s", operations3);//of: [MINUS, DIVIDE]

		operations4 = EnumSet.range(Operation.MINUS, Operation.DIVIDE);
		System.out.printf("\nrange: %s\n", operations4);//range: [MINUS, TIMES, DIVIDE]		
		System.out.println(operations4.contains(Operation.PLUS));//false
		System.out.println(operations4.contains(Operation.MINUS));//true

	}

	public static void main(String[] args) {

		new ShowEnumSet().show();

	}

}
