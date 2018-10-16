package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.pojo.Vehicle;
import com.revature.util.SessionUtil;

public class VehicleDAO implements VehicleCRUD{
    
	Session sess = SessionUtil.getSession();
	
	@Override
	public void newVehicle(Vehicle ve) {
		// TODO Auto-generated method stub
		Vehicle savev = ve;
		sess.save(savev);
		
		
	}

	@Override
	public Vehicle getVehicle(int vehicleId) {
		// TODO Auto-generated method stub
		
		
		return sess.get(Vehicle.class,vehicleId);
	}

	@Override
	public List<Vehicle> getAllVehicles() {
		List<Vehicle> listVe = sess.createQuery("from VEHICLE_TABLE").list();
		return listVe;
	}

	@Override
	public void update(Vehicle ve) {
	
	 sess.saveOrUpdate(ve);
		
	}

	@Override
	public void delete(Vehicle ve) {
		Transaction trans = sess.beginTransaction();
		sess.delete(ve);
		trans.commit();
		
	}

}
