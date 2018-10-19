package com.revature.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.revature.dao.VehicleDAO;
import com.revature.pojo.Vehicle;

@RunWith(MockitoJUnitRunner.class)
public class VehicleServiceTest {
	@Mock
	VehicleDAO vedao;
	
	@InjectMocks
	VehicleService veserv;
	
	private static Vehicle ve;
	
    private static List<Vehicle> vehList;
    
    
    
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		vehList = new ArrayList<Vehicle>();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.ve = new Vehicle(1,2,"BMW-15","4-door", "gray", 2010, "Toyota", 120000.00, 30.0, "new stereo");
		this.vehList.addAll(Arrays.asList(new Vehicle[] {this.ve,new Vehicle()}));
		when(vedao.getAllVehicles()).thenReturn(this.vehList);
		when(vedao.getVehicle(1)).thenReturn(this.ve);
	}

	@After
	public void tearDown() throws Exception {
	   vehList.clear();
	}

	@Test
	public void testGetAllVehicle() {
		assertEquals("should get whole list of vehicle", this.vehList, this.veserv.getAllVehicles());
	
	}
	
	@Test
	public void testGetVehicle() {
		assertEquals("should get one  vehicle", this.ve, this.veserv.getVehicle(1));
	
	}

	@Test
	public void testMakeVehicle() {
		veserv.newVehicle(this.ve);
		verify(vedao).newVehicle(ve);
	
	}
	
	@Test
	public void testUpdateVehicle() {
		veserv.update(this.ve);
		verify(vedao).update(ve);
	
	}
	
	@Test
	public void testDeleteVehicle() {
		veserv.delete(this.ve);
		verify(vedao).delete(ve);
	
	}

}
