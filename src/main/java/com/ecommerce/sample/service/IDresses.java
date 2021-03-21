package com.ecommerce.sample.service;

import com.ecommerce.sample.model.Dresses;
import com.ecommerce.sample.model.Footwears;

import java.util.List;

public interface IDresses {
	
   public List<Dresses> getDresses();
   public List<Footwears> getFootwears();

}
