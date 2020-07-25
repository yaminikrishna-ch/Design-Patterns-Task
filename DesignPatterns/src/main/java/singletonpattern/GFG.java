package singletonpattern;
public class GFG 
{ 

private GFG() 
{ 
	// private constructor 
} 

//Inner class to provide instance of class 
private static class BillPughSingleton 
{ 
	private static final GFG INSTANCE = new GFG(); 
} 

public static GFG getInstance() 
{ 
	return BillPughSingleton.INSTANCE; 
} 
} 
