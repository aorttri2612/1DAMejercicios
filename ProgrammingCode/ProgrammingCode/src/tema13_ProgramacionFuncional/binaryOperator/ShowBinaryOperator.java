package tema13_ProgramacionFuncional.binaryOperator;

import java.util.function.BinaryOperator;

public class ShowBinaryOperator{

	public Integer calculate(Integer value1,Integer value2,BinaryOperator<Integer> binaryOperation) {
		return binaryOperation.apply(value1,value2);
	}

}
