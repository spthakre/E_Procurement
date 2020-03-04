package com.jbk.E_P.Tests;

import org.testng.annotations.Test;

import com.jbk.E_P.Base.Base;

public class LoginPageTest extends Base {

	@Test(groups = { "smoke", "sanity" })
	public void TC1() {
		System.out.println("Im in TC1");
	}

	@Test(groups = { "smoke", "sanity" })
	public void TC2() {
		System.out.println("Im in TC2");
	}

	@Test(groups = { "regression", "smoke" })
	public void TC3() {
		System.out.println("Im in TC3");
	}

	@Test(groups = { "smoke", "sanity" })
	public void TC4() {
		System.out.println("Im in TC4");
	}

	@Test(groups = { "smoke", "regression" })
	public void TC5() {
		System.out.println("Im in TC5");
	}

}
