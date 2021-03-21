package com.ecommerce.sample.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
 

@Controller
public class FrontControler {
	
	@Autowired
	private DressesImpl mylist;
	
	
    @RequestMapping(value = "/home")
    public String myhome() {
    	
    	return "home";
    }
    
    @RequestMapping(path = "/rdresses" , method= RequestMethod.POST )
    public String mydresses(Model model) {
    	List dresses = this.mylist.getDresses();
    	model.addAttribute("list",dresses);
    	return "dresses";
    }
    
    @RequestMapping(path = "/rfootwears" , method= RequestMethod.POST )
    public String myfootwears(Model model) {
    	
    	List footwears = this.mylist.getFootwears();
    	model.addAttribute("list",footwears);
    	
    	return "footwears";
    }
    
    
    @RequestMapping(path = "/rcart" , method= RequestMethod.POST )
    public String mycart(Model model, @RequestParam String myitem) {
    	System.out.println("This is cart controller");
    	System.out.println(myitem);
        model.addAttribute("myitem",myitem);
    	return "mycart";
    }
    
    
    
    
    /*
     * Dressess - Dresssess page - > dressess optoin 
     * same for footwear
     * 
     * appplication.propertiers: configure so we dont have to provide prefix and postfix. 
     * 
     * trial basis:  server to client and client to server 
     * 
     * click on dress ==> you have choose this dress etc.. same message. .
     * 
     * 
     * 
     */
	  
	

}
