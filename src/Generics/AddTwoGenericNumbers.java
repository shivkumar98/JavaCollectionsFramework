package Generics;

public class AddTwoGenericNumbers {
	
	public static void main(String[] args) {
		int num1 = 35;
		double num2 = 23.4;
		
		System.out.println(calculateSum(23, 21.4));
		
		
	}
	
	 public static <T extends Number> double calculateSum(T numb1, T numb2){
		 double result = numb1.doubleValue() + numb2.doubleValue();
		 return result;
		 
		
	}

}
