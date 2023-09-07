package com.NetworkDeviceMS.NetworkDeviceManagementSystem.DeviceService;

import java.util.List;
import java.util.Map;

import com.NetworkDeviceMS.NetworkDeviceManagementSystem.DeviceEntities.Device;

public interface DeviceService {
	
	 List<Device> getDevice();
	 Device saveDevice(Device device);
	 Device updateDevice(Long id, Device device);
	 void deleteDevice(Long id);
	 long getDeviceCount();
	 Map<String, Long> getDeviceBrandDistribution(); 

}
