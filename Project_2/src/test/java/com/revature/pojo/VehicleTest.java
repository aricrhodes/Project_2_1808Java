package com.revature.pojo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class VehicleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	Vehicle ve = new Vehicle(1, 2,"BMW-15", "4-door", "gray", 2010, "Toyota", 120000.00, 30.0, "new stereo");

	@Before
	public void setUp() throws Exception {
		Vehicle ve = new Vehicle(1,2, "BMW-15", "4-door", "gray", 2010, "Toyota", 120000.00, 30.0, "new stereo");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetVin() {
		assertEquals("BMW-15", ve.getVin());
	}

	@Test
	public void testSetVin() {
		ve.setVin("Yaris");
		assertEquals("Yaris", ve.getVin());
	}

	@Test
	public void testGetBody() {
		assertEquals("4-door", ve.getBody());

	}

	@Test
	public void testSetBody() {
		ve.setBody("van");
		assertEquals("van", ve.getBody());

	}

	@Test
	public void testGetColor() {
		assertEquals("gray", ve.getColor());
	}

	@Test
	public void testSetColor() {
		ve.setColor("black");
		assertEquals("black", ve.getColor());
	}

	@Test
	public void testGetYear() {
		assertEquals(2010, ve.getYear());
	}

	@Test
	public void testSetYear() {
		ve.setYear(2012);
		assertEquals(2012, ve.getYear());
	}

	@Test
	public void testGetMake() {
		assertEquals("Toyota", ve.getMake());
	}

	@Test
	public void testSetMake() {
		ve.setMake("ToyotaCorola");
		assertEquals("ToyotaCorola", ve.getMake());
	}

	@Test
	public void testGetPrice() {
		assertEquals(120000.00, ve.getPrice(), .1);
	}

	@Test
	public void testSetPrice() {
		ve.setPrice(200000.00);
		assertEquals(200000.00, ve.getPrice(), .001);
	}

	@Test
	public void testGetFuel() {
		assertEquals(30.0, ve.getFuel(), .1);
	}

	@Test
	public void testSetFuel() {
		ve.setFuel(50.0);
		assertEquals(50.0, ve.getFuel(), 0.1);
	}

	@Test
	public void testGetInfo() {
		assertEquals("new stereo", ve.getInfo());
	}

	@Test
	public void testSetInfo() {
		ve.setInfo("fast");
		assertEquals("fast", ve.getInfo());
	}

}
