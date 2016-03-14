package com.examples.one.petstore;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class KittenTest
{
	Kitten k_test = new Kitten(0,"Fluffy","Persian");
	
	@After
	public void test_brakedown()
	{
		k_test = null;
	}
	
	@Test
	public void test_get_id()
	{
		assertEquals(k_test.id,k_test.getId());
	}
	
	@Test
	public void test_get_name()
	{
		assertEquals(k_test.name,k_test.getName());
	}
	
	@Test
	public void test_get_breed()
	{
		assertEquals("Persian",k_test.getBreed());
	}
	
}
