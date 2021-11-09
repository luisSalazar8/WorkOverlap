package Util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.Hashtable;
import java.util.LinkedList;

import Entities.Employee;
import Entities.Schedule;

public class EmployeeFile {

	
	public static LinkedList<Employee> readEmployeeFile(String fileName) {
		
		File file = new File(fileName);
		LinkedList<Employee> employeeList = new LinkedList<Employee>();
        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            while ((line = br.readLine()) != null) {
            	Employee employee = createEmployee(line);
            	employeeList.add(employee);
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file could not be found");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return employeeList;
		
	}
	
	public static Employee createEmployee(String line) {
			
		String[] arguments = line.split("=");
		String name = arguments[0];
		Employee employee = new Employee(name);
		String[] schedule = arguments[1].split(",");
		for (String day :schedule) {
			String d = day.substring(0,2);
			Date start;
			Date end;
			try {
				start = Time.textToDate(day.substring(2,7));
				end = Time.textToDate(day.substring(8));
				Schedule sched = new Schedule(day, start, end);
				employee.add_Schedule(sched);;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				System.out.println("Error in the date");
			}
			
			
		}
		return employee;
			
	}
	
	
	public static Hashtable<String, Integer> employeeOverlap(LinkedList<Employee> employeesList){
		
		Hashtable<String, Integer> result = new Hashtable<String, Integer>();
		
		if(employeesList.size()==0) {
			return result;
		}
		
		@SuppressWarnings("unchecked")
		LinkedList<Employee> employeesList2 = (LinkedList<Employee>) employeesList.clone(); 
		employeesList2.removeFirst();
		for(Employee employee : employeesList) {
			for(Employee employee2 : employeesList2) {
				
				for(String day : employee.getSchedule().keySet()) {
					Schedule sched1 = employee.getSchedule().get(day);
					Schedule sched2 = employee2.getSchedule().get(day);
					
					if(sched2!=null) {
						Boolean flag1 = sched1.getStart_hour().before(sched2.getEnd_hour()) && sched1.getEnd_hour().after(sched2.getStart_hour());
						
						if(flag1) {
							String key = employee.getName()+"-"+employee2.getName();
							Integer num = result.get(key);
							if(num != null) {
								result.put(key, 1+num);
							}else {
								result.put(key, 1);
							}
						}

					}
				}
				
				
			}
			if(employeesList2.size()>0) {
				employeesList2.removeFirst();
			}
		}
		return result;
		
	}
	
}
