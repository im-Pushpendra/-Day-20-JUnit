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

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.lastName("Math");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLastName_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.lastName("math");
		Assert.assertEquals(false, result);

	}

	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.email("sangeetamath15@gmail.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.email("sangeetamath&12.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPhoneNumber_WhenProper_shouldReturnTrue() {
		boolean result = userRegistration.phoneNumber("91 9629873456");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPhoneNumber_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.phoneNumber("919629873456");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.password("Qwertyuiop");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPassword_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.password("qwertyyuuiop");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPasswordRule2_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.password2("Qwertyu19");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPasswordRule2_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.password2("qwerrty");
		Assert.assertEquals(false, result);
	}
	 @Test
	    public void givenPasswordRule3_WhenProper_ShouldReturnTrue(){
		 boolean result = userRegistration.password3("qwertyuio");
		 Assert.assertEquals(true, result);
	 }
	 @Test
	    public void givenPasswordRule3_WhenNotProper_ShouldReturnFalse(){
		 boolean result = userRegistration.password3("qwertyuioggggp");
		 Assert.assertEquals(false, result);
	 }
}
