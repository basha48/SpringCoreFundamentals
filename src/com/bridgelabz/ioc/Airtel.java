package com.bridgelabz.ioc;

	public class Airtel implements ISim{
		
	public void voiceCallService() {
		System.out.println("call service are available in airtel");
		
	}

	@Override
	public void messageService() {
		System.out.println("message service are available in airtel");
	}

}
