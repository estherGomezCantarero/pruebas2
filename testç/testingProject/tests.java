package testingProject;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class tests {

	@Test
	public void test1()
	{
		int x = 9 , y = 3;
		assertTrue(x+y ==12 );
		
	}
	
	@Test
	public void test2()
	{
		int x = 9 , y = 3;
		assertTrue(x-y ==6 );
		
	}
	
	@Test
	public void test3()
	{
		int x = 9 , y = 3;
		assertTrue(x*y ==18 );
		
	}
}
