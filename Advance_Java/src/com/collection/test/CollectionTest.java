package com.collection.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.collection.ArrayList_Demo;
import com.collection.entity.Employee;

public class CollectionTest {
	ArrayList_Demo a;
	@Before
	public void setUp() throws Exception {
		a=new ArrayList_Demo();
	}

	@After
	public void tearDown() throws Exception {
		a=null;
	}

	@Test
	public void testMain() {
		//System.out.println(a.main().size());
		ArrayList<Employee> e=a.main();
		//assert(e.size()>0):"data not retrive";
		assertEquals(e.size() > 0, true);
	}

}
