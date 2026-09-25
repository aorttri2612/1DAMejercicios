package tema13_ProgramacionFuncional.binaryOperator;

import java.util.function.BinaryOperator;

public class Main{
	
	public void show() {
		ShowBinaryOperator binOper = new ShowBinaryOperator();
        System.out.printf("12 + 6 = %d\n", binOper.calculate(12, 6, new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				return t + u;
			}
        	
        }));
        System.out.printf("12 - 6 = %d\n", binOper.calculate(12, 6, new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				return t - u;
			}
        	
        }));
        System.out.printf("12 / 6 = %d\n", binOper.calculate(12, 6, new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				return t / u;
			}
        	
        }));
        System.out.printf("12 * 6 = %d\n", binOper.calculate(12, 6, new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				return t * u;
			}
        	
        }));
        
	}

	public static void main(String[] args) {

		new Main().show();

	}

}
