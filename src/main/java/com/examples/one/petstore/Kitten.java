package com.examples.one.petstore;

public class Kitten
{
	public int id;
	public String name;
	public String breed;
	public boolean sensitiveToFeeding;
	
	public Kitten(int id_in, String name_in, String breed_in)
	{
		id = id_in;
		name = name_in;
		if (breed_in.equals("Persian") || breed_in.equals("Siamese") || breed_in.equals("Bengal"))
			breed = breed_in;
		else
			breed = "Unknown";
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public String getBreed()
	{
		return breed;
	}
	public boolean getSensitiveToFeeding()
	{
		return sensitiveToFeeding;
	}
	
	public void setId(int id_in)
	{
		id = id_in;
	}
	public void setName(String name_in)
	{
		name = name_in;
	}
	public void setBreed(String breed_in)
	{
		if (breed_in.equals("Persian") || breed_in.equals("Siamese") || breed_in.equals("Bengal"))
			breed = breed_in;
		else
			breed = "Unknown";
	}
	public void setSensitiveToFeeding(boolean sensitiveToFeeding_in)
	{
		sensitiveToFeeding = sensitiveToFeeding_in;
	}
}
