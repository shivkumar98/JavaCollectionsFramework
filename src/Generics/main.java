package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class main {
	public static <T extends Number>float AddNumbers(T t, T u){
		float result = t.floatValue() + u.floatValue();
		return result;}
	
	public static void main(String[] args) {

	float result = AddNumbers(23, 21.23F);
	System.out.println(result);
	
		
		
		

		
}
}