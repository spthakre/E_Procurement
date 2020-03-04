package com.jbk.E_P.Tests;

import org.testng.annotations.Test;

import com.jbk.E_P.Base.Base;

public class HomePageTest extends Base {

	@Test(groups = { "smoke", "sanity" })
	public void TCH1() {
		System.out.println("Im in TCH1");
	}

	@Test(groups = { "smoke", "sanity" })
	public void TCH2() {
		System.out.println("Im in TCH2");
	}

	@Test(groups = { "smoke" })
	public void TCH3() {
		System.out.println("Im in TCH3");
	}

	@Test(groups = { "regression" })
	public void TCH4() {
		System.out.println("Im in TCH4");
	}

	@Test(groups = { "smoke", "regression" })
	public void TCH5() {
		System.out.println("Im in TCH5");
	}

}