package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator1 {
	private Date date;

	
	public void setDate(Date date) {
		System.out.println(date);
		System.out.println("WishMessageGenerator1.setDate()");
		this.date = date;
	}


	public WishMessageGenerator1(Date date) {
		System.out.println(date);
		System.out.println("WishMessageGenerator1::1-paramconstructor");
		this.date = date;
	}
	
	public String generateWishMessage(String user) {
		int hour=0;
		hour=date.getHours();
		if(hour<12)
			return"Good Morning::"+user;
		else if(hour<16)
			return "Good Afternoon::"+user;
		else if(hour<20)
			return "Good Evening::"+user;
		
		else 
			return "Gud Night::"+user; 
		
	}

}
