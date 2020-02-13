package main.java.com.yankov.repair_shop.data;

public class ReferenceManager
{
	private static ReferenceManager instance;
	
	private ReferenceManager(){}
	
	public ReferenceManager access()
	{
		return instance;
	}
	
	
}