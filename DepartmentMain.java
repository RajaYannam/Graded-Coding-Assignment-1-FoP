package com.mycomp.Driver;
import com.mycomp.Model.SuperDepartment;

import com.mycomp.Service.Departments;
import com.mycomp.Service.Departments.Admindepartment;
import com.mycomp.Service.Departments.Hrdepartment;
import com.mycomp.Service.Departments.Techdepartment;

public class DepartmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	SuperDepartment sd =new SuperDepartment();
		Departments d =new Departments();
		Admindepartment ad= new Admindepartment();
		Hrdepartment hrd= new Hrdepartment();
		Techdepartment td= new Techdepartment();
		ad.departmentName();
		ad.getTodaysWork();
		ad.getWorkDeadline();
		sd.isTodayAHoliday();
		System.out.println();
		hrd.departmentName();
		hrd.doactivity();
		hrd.getTodaysWork();
		hrd.getWorkDeadline();
		sd.isTodayAHoliday();
		System.out.println();
		td.departmentName();
		td.getTodaysWork();
		td.getWorkDeadline();
		td.getTechStackInformation();
		sd.isTodayAHoliday();
	}

}
