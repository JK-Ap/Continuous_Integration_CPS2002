package com.examples.one.petstore;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class PuppyTest
{
	Puppy p_test = new Puppy(0,"Fido","Labrador");
	
	@After
	public void test_brakedown()
	{
		p_test = null;
	}
	
	@Test
	public void test_get_id()
	{
		assertEquals(p_test.id,p_test.getID());
	}
	
	@Test
	public void test_get_name()
	{
		assertEquals(p_test.name,p_test.getName());
	}
	
	@Test
	public void test_get_breed()
	{
		assertEquals("Labrador",p_test.getBreed());
	}
	
}
