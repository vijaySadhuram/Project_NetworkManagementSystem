package com.NetworkDeviceMS.NetworkDeviceManagementSystem.DeviceEntities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DEVICE")
public class Device {
	
// parameter of device
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
    private String name;
    private String version;
    private String brand;
	/**
	 * @param id
	 * @param name
	 * @param version
	 * @param brand
	 */
	public Device(long id, String name, String version, String brand) {
		super();
		this.id = id;
		this.name = name;
		this.version = version;
		this.brand = brand;
	}
	/**
	 * 
	 */
	public Device() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Device [id=" + id + ", name=" + name + ", version=" + version + ", brand=" + brand + "]";
	}
	
}
