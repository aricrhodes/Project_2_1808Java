package com.revature.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserTest {
	
	User u = new User(1, "john", "pass", false);

	@Test
	public void testGetId() {
		int i = u.getId();
		assertEquals(i, 1);
	}

	@Test
	public void testSetId() {
		u.setId(2);
		assertEquals(u.getId(), 2);
	}

	@Test
	public void testGetUsername() {
		assertEquals(u.getUsername(), "john");
	}

	@Test
	public void testSetUsername() {
		u.setUsername("jack");
		assertEquals(u.getUsername(), "jack");
	}

	@Test
	public void testGetPassword() {
		assertEquals(u.getPassword(), "pass");
	}

	@Test
	public void testSetPassword() {
		u.setPassword("word");
		assertEquals(u.getPassword(), "word");
	}

	@Test
	public void testIsAdmin() {
		assertEquals(u.isAdmin(), false);
	}

	@Test
	public void testSetAdmin() {
		u.setAdmin(true);
		assertEquals(u.isAdmin(), true);
	}

}
