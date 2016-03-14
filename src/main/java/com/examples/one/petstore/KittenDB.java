package com.examples.one.petstore;
import java.util.ArrayList;

public class KittenDB
{
	public ArrayList<Kitten> kittenList = new ArrayList<Kitten>(5);
	
	public boolean addKitten(Kitten k)
	{
		return kittenList.add(k);
	}
	public boolean delKitten(int id_in)
	{
		int index = -1;
		for (int i=0; i<kittenList.size(); i++)
		{
			if (kittenList.get(i).id == id_in)
				index = i;
		}
		return kittenList.remove(kittenList.get(index));
	}
	public Kitten getKitten(int id_in)
	{
		int index = -1;
		for (int i=0; i<kittenList.size(); i++)
		{
			if (kittenList.get(i).id == id_in)
				index = i;
		}
		return kittenList.get(index);
	}
	public int countKittens()
	{
		return kittenList.size();
	}
}
