package com.revature.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.stereotype.Service;

import com.revature.dao.VehicleDAO;
import com.revature.pojo.Vehicle;
import com.revature.util.SessionUtil;

@Service
@Transactional
public class VehicleService {
	VehicleDAO vedao = new VehicleDAO();
	Session sess = SessionUtil.getSession();

	public Vehicle getVehicle(int vehicleId) {
		return vedao.getVehicle(vehicleId);
	}

	public void newVehicle(Vehicle ve) {
		vedao.newVehicle(ve);
	}

	public List<Vehicle> getAllVehicles() {
		return vedao.getAllVehicles();
	}

	public void update(Vehicle ve) {
		vedao.update(ve);
	}

	public void delete(Vehicle ve) {
		vedao.delete(ve);
	}

}
