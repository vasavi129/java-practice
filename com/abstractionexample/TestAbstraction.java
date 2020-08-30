package com.abstractionexample;

public class TestAbstraction {

	public static void main(String[] args) {
		Bank bank;
		bank = new OBC();
		System.out.println("OBC Rate Of Interest is:" + bank.getRateOfInterest() + "%");
		bank = new ICICI();
		System.out.println("ICICI Rate Of Interest is:" + bank.getRateOfInterest() + "%");

	}

}
