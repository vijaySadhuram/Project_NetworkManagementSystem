package com.NetworkDeviceMS.NetworkDeviceManagementSystem.DeviceService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NetworkDeviceMS.NetworkDeviceManagementSystem.DeviceEntities.Device;
import com.NetworkDeviceMS.NetworkDeviceManagementSystem.repository.DeviceRepository;

@Service
public class DeviceServiceimple implements DeviceService {
	
	@Autowired
	private DeviceRepository deviceRepository;
	
	@Override
	public Device saveDevice(Device device) {
		return deviceRepository.save(device);
	}

//	List<Device> list;
//	public DeviceServiceimple() {
//		list=new ArrayList<>();
//		list.add(new Device(1,"Router123","V2.0","Cisco"));
//		list.add(new Device(2,"Switch456","V3.1","HP"));
//		}
	
	@Override
	public List<Device> getDevice() {
		return deviceRepository.findAll();
	}

}
