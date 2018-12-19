package com.gc.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.collection.ArrayList_Demo;
import com.collection.entity.Employee;
import com.gc.*;

public class CounterTest1 {
	CounterTest a;
	@Before
	public void setUp() throws Exception {
		a=new CounterTest();
	}

	@After
	public void tearDown() throws Exception {
		a=null;
	}

	@Test
	public void testMain() {
		//System.out.println(a.main().size());
		int e=a.main();
		//assert(e.size()>0):"data not retrive";
		assertEquals(e== 0, true);
	}

}
