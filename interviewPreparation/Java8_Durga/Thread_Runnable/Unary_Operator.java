package Thread_Runnable;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;



public class Unary_Operator {
	public static void main(String[] args) {
		
		
	BinaryOperator<Integer> f = (a,b)->(a+b);
		
		System.out.println(f.apply(10, 20));
		
	}

}
