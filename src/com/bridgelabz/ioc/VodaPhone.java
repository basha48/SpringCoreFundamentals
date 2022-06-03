package com.bridgelabz.ioc;

public class VodaPhone implements ISim{

	@Override
	public void voiceCallService() {
		System.out.println("call service are available in voda phone ");
	}

	@Override
	public void messageService() {
		System.out.println("message service are available in voda phone ");
		
	}

}
