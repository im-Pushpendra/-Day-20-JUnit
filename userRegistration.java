package com.bridgelabz.day20.UC_Day_20_JUnit;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userRegistration {
	 public boolean firstName(String firstName) {
	        String regex = "^[A-Z]{1}[a-z]{2,}$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(firstName);
	        return matcher.matches();
	    }
	 public boolean lastName(String lastName) {
	        String regex = "^[A-Z]{1}[a-z]{2,}$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(lastName);
	        return matcher.matches();
	    }
}
