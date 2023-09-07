package com.NetworkDeviceMS.NetworkDeviceManagementSystem.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.NetworkDeviceMS.NetworkDeviceManagementSystem.DeviceEntities.Device;
import com.NetworkDeviceMS.NetworkDeviceManagementSystem.DeviceService.DeviceService;
import com.NetworkDeviceMS.NetworkDeviceManagementSystem.Exception.ResourceNotFoundException;
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
	
	@PutMapping("/devices/{id}")
    public ResponseEntity<String> updateDevice(@PathVariable("id") Long id, @RequestBody Device updatedDevice) {
        Device updated = deviceservice.updateDevice(id, updatedDevice);
        if (updated != null) {
        	return new ResponseEntity<String>("Deviced update data Successfully!..", HttpStatus.OK);
        } else {
        	return new ResponseEntity<String>("Error Occured while updating the data into dataBase", HttpStatus.BAD_REQUEST);   
        	}
    }
	
	@DeleteMapping("devices/{id}")
	public ResponseEntity<String> deleteDevice(@PathVariable Long id) {
		ResponseEntity<String> responseEntity;
		try {
			deviceservice.deleteDevice(id);
			responseEntity = new ResponseEntity<String>("Deleted the data successfully!...", HttpStatus.OK);
		} catch (ResourceNotFoundException exception) {
			responseEntity = new ResponseEntity<String>("Error Occured while deleting the data from dataBase",
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return responseEntity;
	}
	
	/*
	 * the below method returns list of devices
	 */
	@GetMapping("/devices")
	public List<Device> getDevice(){
        //call the service
		 return deviceservice.getDevice();	
	}
	
    /*	
	Count the Number of devices
   */	
	
	@GetMapping("/count")
    public ResponseEntity<String> getDeviceCount() {
        long count = deviceservice.getDeviceCount();
        String message = "The number of devices is " + count;
        return ResponseEntity.ok(message);
    }

	/*	
	fetch data based on brand-distribution
    */	

    @GetMapping("/brand-distribution")
    public ResponseEntity<Map<String, Long>> getDeviceBrandDistribution() {
        Map<String, Long> brandDistribution = deviceservice.getDeviceBrandDistribution();
        return ResponseEntity.ok(brandDistribution);
    } 
}
