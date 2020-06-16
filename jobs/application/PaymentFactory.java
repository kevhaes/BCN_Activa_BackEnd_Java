package com.jobs.application;

import com.jobs.domain.IPaymentRate;

// creates salaries for different rolls
public class PaymentFactory {

/////////// PARAMS /////////// 

/////////// CONSTRUCTOR /////////// 

/////////// METHODS /////////// 

	public static IPaymentRate createPaymentRateBoss() {
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth * 1.5;
			}
		};
	}

	public static IPaymentRate createPaymentRateManager() {
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth * 1.1;
			}
		};
	}

	public static IPaymentRate createPaymentRateEmployee() {
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth * 0.85;
			}
		};
	}

	public static IPaymentRate createPaymentRateVolunteer() {
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth * 0;
			}
		};
	}
}
