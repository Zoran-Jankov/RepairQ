package main.java.com.zoran_jankov.repair_shop.data;

public class ReferenceManager
{
	private static ReferenceManager instance;
	
	private ReferenceManager(){}
	
	public ReferenceManager access()
	{
		return instance;
	}
	
	
}