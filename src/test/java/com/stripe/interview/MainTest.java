package com.stripe.interview;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
	@Test
	public void testUseGuavaForSomeReason() throws Exception {
		String actual = Main.useGuavaForSomeReason("hello!<a href>");
		Assert.assertEquals("uh oh, the tests failed!", "hello!&lt;a href&gt;", actual);
	}
}