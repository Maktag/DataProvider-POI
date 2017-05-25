package com.POI.test.POItest;

import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
	@Test(dataProvider="returndata", dataProviderClass=DProvider.class)
	public void setData(String username, String password, String extra)
	{
		System.out.println("you have provided username as::"+username);
		System.out.println("you have provided password as::"+password);
		System.out.println("you have provided Extra as::"+extra);
	}

}
