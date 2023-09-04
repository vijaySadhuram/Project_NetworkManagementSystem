package com.NetworkDeviceMS.NetworkDeviceManagementSystem.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.NetworkDeviceMS.NetworkDeviceManagementSystem.DeviceEntities.Device;
//Controller Layer-->Handle the HTTP Request to the Service layer
@RestController
public class DeviceController {
 //method mapping
	
//	for testing the application
	@GetMapping("/home")
	public String  Home() {
		return "Hi Welcome device world";
	}
	
	//Get the Devices info
	@GetMapping("/devices")
	public List<Device> getDevice(){
		
	}
	
	

}
