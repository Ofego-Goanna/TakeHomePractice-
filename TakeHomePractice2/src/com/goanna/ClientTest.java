package com.goanna;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClientTest {
	
	ArrayList<Integer> list;
	
	
	@BeforeEach
	void Init() {
		list = new ArrayList<Integer>();
		
	}	

	@Test
	void testAllPositives() {
		
		assertFalse(Client.allPositives(null));
		assertTrue(Client.allPositives(list));
		
		list.add(22);
		list.add(12);
		list.add(-10);
		list.add(0);
		
		
		assertFalse(Client.allPositives(list));
	
	}

	@Test
	void testAllEven() {
		list.add(2);
		list.add(2);
		list.add(4);
		list.add(6);
		
		assertTrue(Client.allEven(list));
		
	}

	@Test
	void testSquared() {
		list.add(1);
		list.add(0);
		list.add(7);
		list.add(-2);
		list.add(9);
		
		Client.squared(list);
		
		assertEquals("[1, 0, 49, 4, 81]", list.toString());
		
		
	}

	@Test
	void testRemoveNegatives() {
	list.add(-2);
	list.add(-10);
	list.add(5);
	list.add(10);
	
	// Continue 
	
	Client.removeNegatives(list);
	
	assertEquals("[5, 10]", list.toString());
	
	
	
	}
	
}
