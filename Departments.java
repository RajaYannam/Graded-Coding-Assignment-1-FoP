package com.mycomp.Service;

import com.mycomp.Model.SuperDepartment;

public class Departments extends SuperDepartment {
	
	public static class Admindepartment{
		 public String departmentName() {
			 System.out.println("Welcome to Admin Department");
			 return null;
		}
		
		 public String getTodaysWork() {
			 System.out.println("Complete your documents Submission");
			 return null;
		}
		 public String getWorkDeadline () {
			 System.out.println("Complete by EOD");
			 return null;
		}
		
	}
		
		public static class Hrdepartment{
			public String departmentName() {
				System.out.println("Welcome to Hr Department");
				return null;
			}
			
			public String getTodaysWork() {
				System.out.println("Fill today’s worksheet and mark your attendance");
				return null;
			}
			public String getWorkDeadline() {
				System.out.println("Complete by EOD");
				return null;
			}
			public String doactivity() {
				System.out.println("Team Lunch");
				return null;
			}
			
		} 
		
		public static class Techdepartment{
			public String departmentName() {
				System.out.println("Welcome to Tech Department");
				return null;
			}
			
			public String getTodaysWork() {
				System.out.println("Complete coding of module 1");
				return null;
			}
			public String getWorkDeadline () {
				System.out.println("Complete by EOD");
				return null;
			}
			public String getTechStackInformation() {
				System.out.println("core Java");
				return null;
			}
			
		} 
		
}