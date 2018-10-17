package com.revature.service;

import java.util.List;
import java.util.logging.Logger;

import javax.transaction.Transactional;

import org.apache.commons.logging.Log;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

import com.revature.dao.VehicleDAO;
import com.revature.pojo.User;
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
    public void tradeVehicle(User ua,User ub, Vehicle va, Vehicle vb) {
    	int ida = ua.getId();
    	int idb = ub.getId();
    	if (ida==va.getUserId() && idb==vb.getUserId()) {
    		va.setUserId(idb);
    		vb.setUserId(ida);
    	
    	}
    }
}
