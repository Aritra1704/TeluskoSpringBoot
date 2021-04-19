package com.example.demo;

import org.springframework.stereotype.Component;

@Component
//@Component("lap1")
public class Laptop {

	private int l_id;
	private String brand;
	public int getL_id() {
		return l_id;
	}
	public void setL_id(int l_id) {
		this.l_id = l_id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Laptop [l_id=" + l_id + ", brand=" + brand + "]";
	}
	
	public void commpile() {
		System.out.println("Laptop compiling");
	}
}
