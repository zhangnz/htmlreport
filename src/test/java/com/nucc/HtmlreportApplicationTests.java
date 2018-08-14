package com.nucc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HtmlreportApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("------------");
	}

	@Test
	public void test01(){
		Assert.assertEquals(1,1);
	}

	@Test
	public void test02(){
		Assert.assertEquals(2,1);
	}

}
