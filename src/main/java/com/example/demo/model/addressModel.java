package com.example.demo.model;

import java.math.BigDecimal;

public class addressModel {
	private String address;
	private Double area;
	private BigDecimal price;
	private BigDecimal maxPrice;
	private Double x;
    private Double y;
    
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Double getArea() {
		return area;
	}
	public void setArea(Double area) {
		this.area = area;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(BigDecimal maxPrice) {
		this.maxPrice = maxPrice;
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
	
	@Override
	public String toString() {
		return "addressModel [address=" + address + ", area=" + area + ", price=" + price + ", maxPrice=" + maxPrice
				+ ", x=" + x + ", y=" + y + "]";
	}
    
}
