package com.revature.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.revature.dao.UserDAO;
import com.revature.pojo.User;


@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
	
	@Mock
	private UserDAO uD;
	
	@InjectMocks
	private UserService uS;
	
	private static List<User> userList;
	
	private static User u;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		userList = new ArrayList<User>();
	   
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		
		u = new User(1, "david" , "dpass" , true);
		userList.addAll(Stream.of(
				u,
				new User(2, "natali" , "best" , false),
				new User(3 , "john" , "yellow", true)
				).collect(Collectors.toList()));
	}

	@After
	public void tearDown() throws Exception {
		userList.clear();
	}

	@Test
	public void testMakingUser() {
		uS.getUser(u.getUsername());
		verify(uD).updateUser(u);
		
	}
	@Test
	public void testGettingAllUsers() {
		assertEquals("should give you full list of users", userList,uS.getAllUsers());
	}

}
