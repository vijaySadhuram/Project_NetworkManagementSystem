package com.NetworkDeviceMS.NetworkDeviceManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NetworkDeviceMS.NetworkDeviceManagementSystem.DeviceEntities.Device;

public interface DeviceRepository extends JpaRepository<Device, Long>{
	

}
