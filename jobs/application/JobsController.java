package com.jobs.application;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.persistence.EmployeeRepository;

// has methods to create Employees (and add to repository ) and to pay all the employees
// we could name this HHRR department
public class JobsController {

/////////// PARAMS /////////// 

	private EmployeeRepository repository;

	/////////// CONSTRUCTOR ///////////
	public JobsController() {
		this.repository = new EmployeeRepository();

	}

	/////////// GETTERS SETTERS ///////////
	public EmployeeRepository getRepository() {
		return repository;
	}

	public void setRepository(EmployeeRepository repository) {
		this.repository = repository;
	}

/////////// METHODS /////////// 

	/// create a boss

	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception {
		Employee boss = new Employee(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}

	/// create a manager
	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth)
			throws Exception {
		Employee manager = new Employee(name, address, phone, salaryPerMonth,
				PaymentFactory.createPaymentRateManager());
		repository.addMember(manager);
	}

	/// create an employee
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception {
		Employee employee = new Employee(name, address, phone, salaryPerMonth,
				PaymentFactory.createPaymentRateEmployee());
		repository.addMember(employee);
	}

	/// create a Volunteer
	public void createVolunteer(String name, String address, String phone) throws Exception {
		Employee volunteer = new Employee(name, address, phone, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(volunteer);
	}

	/// AllEmployee methods

	public void payAllEmployeers() {
		for (AbsStaffMember member : repository.getAllMembers()) {
			member.pay();

		}

	}

	public String getAllEmployees() {

		return repository.getAllMembers().toString();
	}

}
