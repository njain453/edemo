package com.ecommerce.sample.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DressesImpl implements IDresses{
	
	private List<Dresses> dresses ;
	private List<Footwears> footwears ;
	
	public DressesImpl() {
		super();
		dresses = new ArrayList<>();
		dresses.add(new Dresses("gowns1", "shirts1", "trousers1"));
		dresses.add(new Dresses("gowns2", "shirts2", "trousers2"));
		dresses.add(new Dresses("gowns3", "shirts3", "trousers3"));
		dresses.add(new Dresses("gowns4", "shirts4", "trousers4"));
		dresses.add(new Dresses("gowns5", "shirts5", "trousers5"));
		
		
		footwears = new ArrayList<Footwears>();
		footwears.add(new Footwears("shoes1", "boots1", "socks1"));
		footwears.add(new Footwears("shoes2", "boots2", "socks2"));
		footwears.add(new Footwears("shoes3", "boots3", "socks3"));
		footwears.add(new Footwears("shoes3", "boots4", "socks4"));
		footwears.add(new Footwears("shoes5", "boots5", "socks5"));
		
	}
	
	@Override
	public List<Dresses> getDresses() {
		
		return dresses;
	}

	@Override
	public List<Footwears> getFootwears() {
		// TODO Auto-generated method stub
		return footwears;
	}

	
	

}
