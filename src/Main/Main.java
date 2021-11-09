package Main;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Scanner;

import Entities.Employee;
import Entities.Schedule;
import Util.EmployeeFile;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		LinkedList<Employee> employeesList = EmployeeFile.readEmployeeFile(input);
		//LinkedList<Employee> employeesList = EmployeeFile.readEmployeeFile("src\\Main\\Schedule");
		Hashtable<String, Integer> result = EmployeeFile.employeeOverlap(employeesList);
		System.out.println(result);
		
	}

}