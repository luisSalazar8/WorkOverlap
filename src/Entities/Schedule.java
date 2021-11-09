package Entities;

import java.util.Date;

public class Schedule {
	private String day;
	private Date start_hour;
	private Date end_hour;
	
	public Schedule(String day, Date start_hour, Date end_hour) {
		super();
		this.day = day;
		this.start_hour = start_hour;
		this.end_hour = end_hour;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public Date getStart_hour() {
		return start_hour;
	}

	public void setStart_hour(Date start_hour) {
		this.start_hour = start_hour;
	}

	public Date getEnd_hour() {
		return end_hour;
	}

	public void setEnd_hour(Date end_hour) {
		this.end_hour = end_hour;
	}
	
	
	public String toString() {
		return "Day: "+this.day+", Start hour: "+this.start_hour+", End hour: "+this.end_hour;
	}
	
}
