package com.demotest;

import org.testng.annotations.Test;

public class TestCases extends Demo {

	@Test
	public void test1() {

		setup();
		loginToFacebook("9861389207", "26011950");
		closeDriver();

	}

	@Test
	public void test2() {

		setup();
		setusrname("9861389207");
		setpassword("26011950");
		clicklogin();
		closeDriver();
	}

}
