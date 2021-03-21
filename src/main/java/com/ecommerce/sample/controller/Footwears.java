package com.ecommerce.sample.controller;

public class Footwears {
	
	String shoes;
	String boots;
	String socks;
	
	public Footwears(String shoes, String boots, String socks) {
		super();
		this.shoes = shoes;
		this.boots = boots;
		this.socks = socks;
	}
	public String getShoes() {
		return shoes;
	}
	public void setShoes(String shoes) {
		this.shoes = shoes;
	}
	public String getBoots() {
		return boots;
	}
	public void setBoots(String boots) {
		this.boots = boots;
	}
	public String getSocks() {
		return socks;
	}
	public void setSocks(String socks) {
		this.socks = socks;
		
	}
	@Override
	public String toString() {
		return "Footwears [shoes=" + shoes + ", boots=" + boots + ", socks=" + socks + "]";
	}
	
	

}
