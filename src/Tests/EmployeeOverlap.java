package Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Hashtable;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import Entities.Employee;
import Util.EmployeeFile;

class EmployeeOverlap {

	@Test
	void equalsListExample1() {
		LinkedList<Employee> employeesList = EmployeeFile.readEmployeeFile("src\\Main\\Schedule");
		assertEquals(3,employeesList.size());
	}
	
	@Test
	void equalsListExample2() {
		LinkedList<Employee> employeesList = EmployeeFile.readEmployeeFile("src\\Tests\\Example2");
		assertEquals(2,employeesList.size());
	}
	
	@Test
	void equalsTableExample1() {
		LinkedList<Employee> employeesList = EmployeeFile.readEmployeeFile("src\\Main\\Schedule");
		Hashtable<String, Integer> result = EmployeeFile.employeeOverlap(employeesList);
		assertEquals(3,result.keySet().size());
	}
	
	@Test
	void equalsTableExample2() {
		LinkedList<Employee> employeesList = EmployeeFile.readEmployeeFile("src\\Tests\\Example2");
		Hashtable<String, Integer> result = EmployeeFile.employeeOverlap(employeesList);
		assertEquals(1,result.keySet().size());
	}
	
	@Test
	void equalsTableContentExample1() {
		LinkedList<Employee> employeesList = EmployeeFile.readEmployeeFile("src\\Main\\Schedule");
		Hashtable<String, Integer> result = EmployeeFile.employeeOverlap(employeesList);
		assertEquals(2,result.get("RENE-ASTRID"));
		assertEquals(3,result.get("ASTRID-ANDRES"));
		assertEquals(2,result.get("RENE-ANDRES"));
	}
	
	@Test
	void equalsTableContentExample2() {
		LinkedList<Employee> employeesList = EmployeeFile.readEmployeeFile("src\\Tests\\Example2");
		Hashtable<String, Integer> result = EmployeeFile.employeeOverlap(employeesList);
		assertEquals(3,result.get("RENE-ASTRID"));
	}

}
