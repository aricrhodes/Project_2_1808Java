package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pojo.User;
import com.revature.pojo.Vehicle;
import com.revature.service.VehicleService;

@RestController
public class VehicleController {

	@Autowired
	private VehicleService ves;

	@RequestMapping(value = "/vehicle", method = RequestMethod.GET)
	public List<Vehicle> getAllVehicles() {
		System.out.println("inside get Vehicles ");
		return ves.getAllVehicles();
	}

	@RequestMapping(value = "/vehicle/{vehicleId}", method = RequestMethod.GET)
	public Vehicle getVehicle(@PathVariable("vehicleId") int vehicleId) {
		System.out.println("inside get vehicle");
		return ves.getVehicle(vehicleId);
	}

	@RequestMapping(value = "/vehicle", method = RequestMethod.POST, consumes = { "application/json" })
	public void addUser(@RequestBody Vehicle v) {
		System.out.println("inside addvehicle()");

		ves.newVehicle(v);
	}

	@RequestMapping(value = "/vehicle/{vehicleId}", method = RequestMethod.PUT)
	public void updateVehicle(@PathVariable("vehicleId") int vehicleId, @RequestBody Vehicle v) {
		v.setVehicleId(vehicleId);
		System.out.println("inside updateVehicle");
		ves.update(v);
	}

	@RequestMapping(value = "/vehicle/{vehicleId}", method = RequestMethod.DELETE)
	public void deleteVehicle(@PathVariable("vehicleId") int vehicleId) {
		Vehicle v = ves.getVehicle(vehicleId);
		System.out.println("inside deleteVehicle");
		ves.delete(v);
	}

}
