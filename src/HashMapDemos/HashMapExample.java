package HashMapDemos;

import java.util.HashMap;
import java.util.Map;

import Generics.main;

class Student {
	private String firstName;
	private String lastName;
	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}

class HashMapUserDefinedExample {
	public static void main(String[] args) {
		
	}
}

public class HashMapExample {
	
	public static void main(String[] args) {
		Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
		studentMap.put(1, new Student("shiv", "kumar"));
		studentMap.put(2, new Student("jacob", "white"));
		
		System.out.println(studentMap);
	}

}
