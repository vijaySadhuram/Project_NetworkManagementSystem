package com.NetworkDeviceMS.NetworkDeviceManagementSystem.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//Controller Layer-->Handle the HTTP Request to the Service layer
@RestController
public class DeviceController {
 //method mapping
	@GetMapping("/home")
	public String  Home() {
		return "i ma vija";
	}
	
	

}
