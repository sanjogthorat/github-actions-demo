package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class MyHooks {

	
	@Before("@sanity")
	public void beforeHook()
	{
		System.out.println("Before hook is executing");
	}
	
	
	@After("@regression")
	public void afterHook()
	{
		System.out.println("After hook is executing");
	}
	
//	@Before(order = 0)
//	public void beforeHook1()
//	{
//		System.out.println("Before hook1 is executing");
//	}
//	
//	@Before(order = -2)
//	public void beforeHook2()
//	{
//		System.out.println("Before hook2 is executing");
//	}
//	
//	@After(order = 10)
//	public void afterHook1()
//	{
//		System.out.println("After hook1 is executing");
//	}
//	@After(order = 500)
//	public void afterHook2()
//	{
//		System.out.println("After hook2 is executing");
//	}
//	
//	@BeforeStep(order = 5)
//	public void beforeStep1() {
//		System.out.println("BeforeStep hook 1 is executing");
//	}
//	
//	@BeforeStep(order = 20)
//	public void beforeStep2() {
//		System.out.println("BeforeStep hook 2 is executing");
//	}
//	
//	@AfterStep(order = 1)
//	public void afterStep1() {
//		System.out.println("AfterStep hook 1 is executing");
//	}
//	
//	@AfterStep(order = 21)
//	public void afterStep2() {
//		System.out.println("AfterStep hook 2 is executing");
//	}
//	
//	@BeforeAll
//	public static void beforeAllHook()
//	{
//		System.out.println("Before all hook is executing");
//	}
//	
//	
//	@AfterAll
//	public static void afterAllHook()
//	{
//		System.out.println("After all hook is executing");
//	}

}
