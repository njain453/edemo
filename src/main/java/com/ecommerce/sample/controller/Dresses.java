package com.ecommerce.sample.controller;

public class Dresses {
	
	private String gowns;
	private String shirts;
	private String trousers;
	
    
	
	public Dresses(String gowns, String shirts, String trousers) {
		super();
		this.gowns = gowns;
		this.shirts = shirts;
		this.trousers = trousers;
	}
	public String getGowns() {
		return gowns;
	}
	public void setGowns(String gowns) {
		this.gowns = gowns;
	}
	public String getShirts() {
		return shirts;
	}
	public void setShirts(String shirts) {
		this.shirts = shirts;
	}
	public String getTrousers() {
		return trousers;
	}
	public void setTrousers(String trousers) {
		this.trousers = trousers;
	}
	
	@Override
	public String toString() {
		return "Dressess [gowns=" + gowns + ", shirts=" + shirts + ", trousers=" + trousers + "]";
	}
	
	

}
