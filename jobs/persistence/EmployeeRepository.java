package com.jobs.persistence;

import java.util.ArrayList;
import java.util.List;

import com.jobs.domain.AbsStaffMember;

// this  holds a list of all staff members Employees (Repository) 
public class EmployeeRepository {

	/////////// PARAMS ///////////
	public static List<AbsStaffMember> members = new ArrayList<>();

/////////// CONSTRUCTOR /////////// 
	public EmployeeRepository() {
		// empty constructor
	}
/////////// METHODS /////////// 

	// getter members
	public List<AbsStaffMember> getAllMembers() {
		return new ArrayList<>(members);
	}

	// setter members
	public void addMember(AbsStaffMember member) throws Exception {
		if (member == null)
			throw new Exception();
		members.add(member);
	}

}
