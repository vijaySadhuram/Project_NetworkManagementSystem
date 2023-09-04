package com.NetworkDeviceMS.NetworkDeviceManagementSystem.DeviceService;

import java.util.List;

import com.NetworkDeviceMS.NetworkDeviceManagementSystem.DeviceEntities.Device;

public interface DeviceService {
	
	 List<Device> getDevice();
	 Device saveDevice(Device device);

}
