package com.jobs.domain;

public interface IPaymentRate {
	/// forces all employee class to implement pay (that returns a specific salary
	/// for
	/// the class)
	public double pay(double salaryPerMonth);
}
