package com.example.demo.model;

import java.util.HashMap;

public class Documents {
    private HashMap<String, Object> address;
    private String address_type;
    private Double x;
    private Double y;
    private String address_name;
    private HashMap<String, Object> road_address;
    
	public HashMap<String, Object> getAddress() {
		return address;
	}
	public void setAddress(HashMap<String, Object> address) {
		this.address = address;
	}
	public String getAddress_type() {
		return address_type;
	}
	public void setAddress_type(String address_type) {
		this.address_type = address_type;
	}
	public Double getX() {
		return x;
	}
	public void setX(Double x) {
		this.x = x;
	}
	public Double getY() {
		return y;
	}
	public void setY(Double y) {
		this.y = y;
	}
	public String getAddress_name() {
		return address_name;
	}
	public void setAddress_name(String address_name) {
		this.address_name = address_name;
	}
	public HashMap<String, Object> getRoad_address() {
		return road_address;
	}
	public void setRoad_address(HashMap<String, Object> road_address) {
		this.road_address = road_address;
	}
}