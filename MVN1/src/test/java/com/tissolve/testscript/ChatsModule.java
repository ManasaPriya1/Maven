package com.tissolve.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.tissolve.generic.BaseClass;

public class ChatsModule extends BaseClass {
	@Test
	public void demo() {
		Reporter.log("HI", true);
	}
	
}
