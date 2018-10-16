package com.revature.dao;

import java.util.List;

import com.revature.pojo.Vehicle;

public interface VehicleCRUD {
	
	public void newVehicle(Vehicle ve);
	
	public Vehicle getVehicle(int vehicleId);
	
	public List<Vehicle> getAllVehicles();
	
	public void update(Vehicle ve);
	
	public void delete(Vehicle ve);

	

}
