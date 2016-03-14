package com.examples.one.petstore;

public class Puppy 
{
	public int id;
	public String name;
	public String breed;
	public boolean loudBark;
	public int exerciseRequiredPerDay;
	public boolean friendlyWithChildren;
	
	public Puppy(int c_id, String c_name, String c_breed)
	{
		id = c_id;
		name = c_name;
		if(("Labrador".equals(c_breed)) ||
				("Pitbull".equals(c_breed)) || 
				("Doberman".equals(c_breed)) )
		{
			breed = c_breed;
		}
		else
		{
			breed = "Labrador";
		}
	}
	
	public int getID()
	{
		return id;
	}
	
	public String getBreed()
	{
		return breed;
	}
	
	public String getName()
	{
		return name;
	}
	
}
