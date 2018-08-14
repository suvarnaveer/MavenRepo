package com.test.maven;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestTitle {
	
	@Test
	public void TestTitle() {
		int h=9;
		int a=++h + ++h + --h  +h--;
		System.out.println(a);
	}

}
