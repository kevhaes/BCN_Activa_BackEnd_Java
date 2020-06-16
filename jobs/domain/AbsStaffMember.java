package com.jobs.domain;

// this class counts staff 
public abstract class AbsStaffMember {

/////////// PARAMS /////////// 

	protected int id;
	protected String name;
	protected String address;
	protected String phone;
	protected double totalPaid = 0;

	// counting staff total
	private static int COUNTER_MEMBERS = 1;

/////////// CONSTRUCTOR /////////// 

	public AbsStaffMember(String name, String address, String phone) throws Exception {
		if (name.equals(""))
			throw new Exception();
		if (address.equals(""))
			throw new Exception();
		if (phone.equals(""))
			throw new Exception();

		this.name = name;
		this.address = address;
		this.phone = phone;

		// gives auto-increment ID to member
		id = COUNTER_MEMBERS;
		COUNTER_MEMBERS++;
	}

/////////// METHODS /////////// 
	// method to be implemented by subclasses to assure they will be payed
	public abstract void pay();

}
