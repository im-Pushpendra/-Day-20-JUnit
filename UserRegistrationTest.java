package com.bridgelabz.day20.UC_Day_20_JUnit;

import org.junit.Assert;
import org.junit.Test;
public class UserRegistrationTest {
	userRegistration userRegistration = new userRegistration();
	 @Test
	    public void givenFirstName_WhenProper_ShouldReturnTrue() {
	        boolean result = userRegistration.firstName("Amar");
	        Assert.assertEquals(true, result);
	    }

	    @Test
	    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
	        boolean result = userRegistration.firstName("amar");
	        Assert.assertEquals(false, result);
	    }
}
