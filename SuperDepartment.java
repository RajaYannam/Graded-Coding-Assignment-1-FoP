package com.mycomp.Model;

public class SuperDepartment {
	
	protected String departmentName() {
		System.out.println("Super Department");
		return null;
	}
	
	protected String getTodaysWork() {
		System.out.println("No Work as of now");
		return null;
	}
	protected String getWorkDeadline () {
		System.out.println("Nil");
		return null;
	}
	public String isTodayAHoliday() {
		System.out.println("Today is not a holiday");
		return null;
	}

}
