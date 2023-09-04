package com.NetworkDeviceMS.NetworkDeviceManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.NetworkDeviceMS.NetworkDeviceManagementSystem.DeviceEntities.Device;
import com.NetworkDeviceMS.NetworkDeviceManagementSystem.DeviceService.DeviceService;
import com.NetworkDeviceMS.NetworkDeviceManagementSystem.repository.DeviceRepository;
//Controller Layer-->Handle the HTTP Request to the Service layer
@RestController
@RequestMapping("/api")
public class DeviceController {
	
	@Autowired
	private DeviceService  deviceservice;
	private DeviceRepository devicerepo;
	
	@PostMapping("/devices")
	public ResponseEntity<String> saveDevice(@RequestBody Device device) {
		Device respone = deviceservice.saveDevice(device);
		if(respone != null) {
		return new ResponseEntity<String>("Deviced Saved Successfully!..", HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("Error Occured while saving the data into dataBase", HttpStatus.BAD_REQUEST);
		}
	}
//	users to update existing device information.
	@PutMapping("/devices")
	public ResponseEntity<String> updateDevice(@PathVariable long id,@RequestBody Device  device){
		 Device updateDevice=
		 if (updateDevice != null)
	            return new ResponseEntity<String>("updated device infomation successfully into database",HttpStatus.OK);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	              	
	}
	
	
	
	//Get the Devices info
	@GetMapping("/devices")
	public List<Device> getDevice(){
        //call the service
		 return deviceservice.getDevice();	
	}
	
	

}
