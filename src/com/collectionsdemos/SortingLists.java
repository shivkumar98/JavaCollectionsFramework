package com.collectionsdemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//creating class to demonstrate sorting
class Employeer {
	private int id;
	private String Name;
	private int age;
	private long salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public Employeer(int id, String name, int age, long salary) {
		super();
		this.id = id;
		this.Name = name;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employeer [id=" + id + ", Name=" + Name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	
}

//creating an implimentation of comparator
class MySort implements Comparator<Employeer> {

	@Override
	public int compare(Employeer o1, Employeer o2) {
		//compare salary
		return (int) (o1.getSalary() - o2.getSalary()) ;
	}
	
}

public class SortingLists {
	
	public static void main(String[] args) {
		List<Employeer> employees = new ArrayList<>();
		employees.add(new Employeer(10, "Shiv", 23, 28000));
		employees.add(new Employeer(1000, "Fiona", 60, 40000));
		employees.add(new Employeer(20, "Jacob", 23, 22000));
		
		
		
		employees.forEach((element) -> {
			System.out.println(element);
		});
		
		Collections.sort(employees, new MySort());
		
		System.out.println("now using implimented sort method");
		employees.forEach((element) -> {
			System.out.println(element);
		});
		
		//sorting employees by id:
		employees.sort( (o1,o2) -> (int) (o1.getId() - o2.getId()) );
		
		employees.forEach((element) -> {
			System.out.println(element);
		});
		
		//sorting employees by name
		
		employees.sort( (o1,o2) -> (o1.getName().compareTo(o2.getName()) ));
		
		System.out.println("sorting names by their names");
		
		employees.forEach((element) -> {
			System.out.println(element);
		});
		
		
	}

}



