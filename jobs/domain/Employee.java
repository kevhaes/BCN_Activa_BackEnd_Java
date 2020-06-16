package com.jobs.domain;

public class Employee extends AbsStaffMember {

/////////// PARAMS /////////// 

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;

/////////// CONSTRUCTOR /////////// 

	public Employee(String name, String address, String phone, double salaryPerMonth, IPaymentRate paymentRate)
			throws Exception {
		super(name, address, phone);
		if (salaryPerMonth < 0)
			throw new Exception();
		if (paymentRate == null)
			throw new Exception();

		this.salaryPerMonth = salaryPerMonth;
		this.paymentRate = paymentRate;
	}

	public Employee(String name, String address, String phone, IPaymentRate paymentRate) throws Exception {
		super(name, address, phone);
		this.paymentRate = paymentRate;
	}

/////////// METHODS /////////// 

	@Override
	public void pay() {
		totalPaid = paymentRate.pay(salaryPerMonth);

	}

	@Override
	public String toString() {
		return "\nid=" + id + "\nname=" + name + "\naddress=" + address + "\nphone=" + phone + "\nsalaryPerMonth="
				+ salaryPerMonth + "\ntotalPaid=" + totalPaid + "\n";
	}

}
