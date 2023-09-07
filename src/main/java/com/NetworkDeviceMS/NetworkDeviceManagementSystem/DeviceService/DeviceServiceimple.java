package com.NetworkDeviceMS.NetworkDeviceManagementSystem.DeviceService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NetworkDeviceMS.NetworkDeviceManagementSystem.DeviceEntities.Device;
import com.NetworkDeviceMS.NetworkDeviceManagementSystem.Exception.ResourceNotFoundException;
import com.NetworkDeviceMS.NetworkDeviceManagementSystem.repository.DeviceRepository;

@Service
public class DeviceServiceimple implements DeviceService {
	
	@Autowired
	private DeviceRepository deviceRepository;
	
	@Override
	public Device saveDevice(Device device) {
		return deviceRepository.save(device);
	}
	
	@Override
	public Device updateDevice(Long id, Device updatedDevice) {
		Optional<Device> optionalDevice = deviceRepository.findById(id);
        if (optionalDevice.isPresent()) {
            updatedDevice.setId(id);
            return deviceRepository.save(updatedDevice);
        } else {
            throw new ResourceNotFoundException("The source which you trying to update is not found");
        }
    }

	@Override
	public List<Device> getDevice() {
		return deviceRepository.findAll();
	}
	
	@Override
	public void deleteDevice(Long id) {
		Optional<Device> optionalDevice = deviceRepository.findById(id);
		if (optionalDevice.isPresent()) {
			deviceRepository.deleteById(id);

		} else {
			throw new ResourceNotFoundException("The source which you trying to delete is not found");
		}
	}
     
	public long getDeviceCount() {
        return deviceRepository.count();
    }

    public Map<String, Long> getDeviceBrandDistribution() {
        List<Device> devices = deviceRepository.findAll();
        Map<String, Long> brandDistribution = new HashMap<>();

        for (Device device : devices) {
            String brand = device.getBrand();
            brandDistribution.put(brand, brandDistribution.getOrDefault(brand, 0L) + 1);
        }

        return brandDistribution;
    }
	
	

}
