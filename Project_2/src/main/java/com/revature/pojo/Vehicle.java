package com.revature.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "VEHICLE_TABLE")
public class Vehicle {
	
	@Id
	@Column(name = "VEHICLE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vehicleId;
	
	
	@Column(name="USER_ID")
	private int userId;

	

	@Column(name = "VIN")
	private String vin;

	@Column(name = "BODY")
	private String body;

	@Column(name = "COLOR")
	private String color;

	@Column(name = "YEAR")
	private int year;

	@Column(name = "MAKE")
	private String make;

	@Column(name = "PRICE")
	private double price;

	@Column(name = "FUEL")
	private double fuel;

	@Column(name = "INFO")
	private String info;
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Vehicle(int vehicleId, int userId,String vin, String body, String color, int year, String make, double price,
			double fuel, String info) {
		super();
		this.vehicleId = vehicleId;
		this.userId=userId;
		this.vin = vin;
		this.body = body;
		this.color = color;
		this.year = year;
		this.make = make;
		this.price = price;
		this.fuel = fuel;
		this.info = info;
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", userId=" + userId + ", vin=" + vin + ", body=" + body + ", color="
				+ color + ", year=" + year + ", make=" + make + ", price=" + price + ", fuel=" + fuel + ", info=" + info
				+ "]";
	}

	

}
