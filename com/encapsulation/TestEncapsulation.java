package com.encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {
		AccountInfo accountInfo = new AccountInfo();

		accountInfo.setAccount_id(245656475);
		accountInfo.setAccount_name("jhon");
		accountInfo.setEmail("jhon.j98@gmail.com");
		accountInfo.setBalance(89000.00);
		System.out.println(accountInfo.getAccount_id());
		System.out.println(accountInfo.getAccount_name());
		System.out.println(accountInfo.getEmail());
		System.out.println(accountInfo.getBalance());

	}

}
