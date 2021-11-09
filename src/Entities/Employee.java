package Entities;

import java.util.Hashtable;

public class Employee {

	private String name;
	private Hashtable<String, Schedule> schedule = new Hashtable<String, Schedule>();

	public Employee(String name) {
		super();
		this.name = name;
		this.schedule = new Hashtable<String, Schedule>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Hashtable<String, Schedule> getSchedule() {
		return schedule;
	}

	public void setSchedule(Hashtable<String, Schedule> my_dict) {
		this.schedule = my_dict;
	}
	
	public void add_Schedule(Schedule schedule) {
		this.schedule.put(schedule.getDay(), schedule);
	}
	
	
}
